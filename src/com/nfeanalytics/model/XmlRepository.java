package com.nfeanalytics.model;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Query;

import com.google.appengine.api.datastore.Blob;
import com.nfeanalytics.util.TransactionalFragment;
import com.nfeanalytics.util.XMLUtils;

public class XmlRepository extends SuperRepository<XmlEntity> {

	private static final Logger			LOGGER		= Logger.getLogger(XmlRepository.class.getName());

	private static final XmlRepository	instance	= new XmlRepository();

	public static XmlRepository getInstance() {
		return instance;
	}

	protected XmlRepository() {
	}

	public void processar(final String userEmail, final byte[] xml, String fileName) {
		long timestamp = System.currentTimeMillis();

		try {
			final NFeEntity nfe = XMLUtils
					.parseXMLNFeEDet(new ByteArrayInputStream(xml), userEmail);

			String chNFe = nfe.getChNFe();

			if (chNFe == null) {
				XmlEntity xmlEntity = new XmlEntity(userEmail, new Blob(xml));
				xmlEntity.setChNFe("### Invalid XML " + fileName);
				xmlEntity.setProcessingError(true);
				xmlEntity.persist();

				LOGGER.warning("### Invalid XML" + fileName);

			} else {

				if (!NFeRepository.getInstance().existNFeByChNFe(nfe.getChNFe(), userEmail)) {
					nfe.persist();
					nfe.createDashboard().persist();

					XmlEntity xmlEntity = new XmlEntity(userEmail, new Blob(xml));
					xmlEntity.setChNFe(chNFe);
					xmlEntity.persist();

				} else {
					LOGGER.info("### NFe already imported with chNFe " + nfe.getChNFe());
				}

			}

		} catch (Exception e) {

			XmlEntity xmlEntity = new XmlEntity(userEmail, new Blob(xml));
			xmlEntity.setChNFe("### " + e.getMessage());
			xmlEntity.setProcessingError(true);
			xmlEntity.persist();

			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}

		LOGGER.info("### Processed " + fileName + " in " + (System.currentTimeMillis() - timestamp) + " ms ");

	}

	public List<XmlEntity> findPendentes() {
		Query query = em().createNamedQuery("XmlEntity.findPendentes");
		return query.getResultList();
	}

	public List<XmlEntity> findByUser(String user) {
		Query query = em().createNamedQuery("XmlEntity.findByUser");
		query.setParameter("user", user);
		return query.getResultList();
	}

	public XmlEntity findByChNFe(String chNFe, String user) {
		Query query = em().createNamedQuery("XmlEntity.findByChNFe");
		query.setParameter("chNFe", chNFe);
		query.setParameter("user", user);
		return (XmlEntity) query.getSingleResult();
	}

	public void deleteByChNFe(String chNFe, String user) {
		Query query = em().createNamedQuery("XmlEntity.deleteByChNFe");
		query.setParameter("chNFe", chNFe);
		query.setParameter("user", user);
		query.executeUpdate();
	}

	public void deleteByUser(final String user) {
		List<XmlEntity> xmls = findByUser(user);
		for (final XmlEntity xml : xmls) {
			TransactionalFragment tx = new TransactionalFragment() {

				@Override
				protected void doInTransaction() throws Exception {
					xml.find().remove();
				}

			};
			tx.execute();

		}
	}

}
