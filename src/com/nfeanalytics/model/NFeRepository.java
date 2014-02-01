package com.nfeanalytics.model;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.nfeanalytics.util.TransactionalFragment;

public class NFeRepository extends SuperRepository {

	private static final Logger			LOGGER		= Logger.getLogger(NFeRepository.class.getName());

	private static final NFeRepository	instance	= new NFeRepository();

	public static NFeRepository getInstance() {
		return instance;
	}

	protected NFeRepository() {
	}

	public boolean existNFeByChNFe(String chNFe, String user) {
		Query query = em().createNamedQuery("NFeEntity.findByChNFe");
		query.setParameter("chNFe", chNFe);
		query.setParameter("user", user);
		query.setMaxResults(1);
		try {
			return query.getSingleResult() != null;
		} catch (NoResultException e) {
			return false;
		}
	}

	public void deleteByChNFeWithChilds(String chNFe, String user) {

		deleteChildsByChNFe(chNFe, user);

		deleteByChNFe(chNFe, user);

	}

	private void deleteByChNFe(String chNFe, String user) {
		Query query = em().createNamedQuery("NFeEntity.deleteByChNFe");
		query.setParameter("chNFe", chNFe);
		query.setParameter("user", user);
		query.executeUpdate();
	}

	private void deleteChildsByChNFe(String chNFe, String user) {
		Query query = em().createNamedQuery("DetEntity.deleteByChNFe");
		query.setParameter("chNFe", chNFe);
		query.setParameter("user", user);
		query.executeUpdate();

	}

	public void deleteByUserWithChilds(final String user) {

		deleteChildsByUser(user);

		List<NFeEntity> nfes = findByUser(user);
		for (final NFeEntity nfe : nfes) {
			TransactionalFragment tx = new TransactionalFragment() {

				@Override
				protected void doInTransaction() throws Exception {
					deleteByChNFe(nfe.getChNFe(), user);

				}

			};

			tx.execute();

		}

	}

	private List<NFeEntity> findByUser(String user) {
		Query query = em().createNamedQuery("NFeEntity.findByUser");
		query.setParameter("user", user);
		return query.getResultList();
	}

	private void deleteChildsByUser(final String user) {

		List<DetEntity> dets = findChildsByUser(user);

		for (final DetEntity det : dets) {
			TransactionalFragment tx = new TransactionalFragment() {

				@Override
				protected void doInTransaction() throws Exception {
					deleteChildsByChNFe(det.getChNFe(), user);

				}

			};

			tx.execute();

		}

	}

	private List<DetEntity> findChildsByUser(String user) {
		Query query = em().createNamedQuery("DetEntity.findByUser");
		query.setParameter("user", user);
		return query.getResultList();
	}

}
