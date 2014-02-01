package com.nfeanalytics.model;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.persistence.Query;

import com.google.appengine.api.channel.ChannelMessage;
import com.google.appengine.api.channel.ChannelService;
import com.google.appengine.api.channel.ChannelServiceFactory;
import com.google.gson.Gson;
import com.nfeanalytics.model.charts.SuperChart;
import com.nfeanalytics.util.TransactionalFragment;

public class DashboardRepository extends SuperRepository<DashboardEntity> {

	private static final Logger					LOGGER						= Logger.getLogger(DashboardRepository.class
																					.getName());

	public static final SimpleDateFormat		SIMPLE_DATE_FORMAT_GROUP	= new SimpleDateFormat("yyyyMM");

	public static final SimpleDateFormat		SIMPLE_DATE_FORMAT			= new SimpleDateFormat("yyyy-MM-dd");

	private static final DashboardRepository	instance					= new DashboardRepository();

	public static DashboardRepository getInstance() {
		return instance;
	}

	protected DashboardRepository() {
	}

	private final Map<String, SuperChart>	chartFactory	= new HashMap<String, SuperChart>();

	/*
	 * Utilizado para os casos onde é feito o upload, a queue não tem
	 * conhecimento do token no dashboard, para isso guardamos em cache. Este
	 * cache é por usuário.
	 */
	private final Map<String, String>		tokenCache		= new HashMap<String, String>();

	public void registerChart(SuperChart... charts) {
		for (SuperChart chart : charts) {
			chartFactory.put(chart.getName(), chart);
		}
	}

	public String createToken(String userEmail) {
		String channelKey = "dashboard_" + userEmail;

		ChannelService channelService = ChannelServiceFactory.getChannelService();
		String token = channelService.createChannel(channelKey);

		Logger.getLogger(getClass().getName()).info("### Channel created " + token);

		tokenCache.put(userEmail, token);

		return token;
	}

	public void updateChannels(String userEmail, Map<String, String[]> parameters) {
		String token = null;

		if (parameters.containsKey("token"))
			token = parameters.get("token")[0];
		else
			token = tokenCache.get(userEmail);

		if (token == null) {
			LOGGER.warning("### Update channels sem token. Nada a fazer");
			return;
		}

		String json = jsonCompleto(userEmail, parameters);

		sendMessage(token, json);
	}

	protected void sendMessage(String channelKey, String value) {
		ChannelService channelService = ChannelServiceFactory.getChannelService();
		channelService.sendMessage(new ChannelMessage(channelKey, value));

		Logger.getLogger(getClass().getName()).info("### Message sent " + channelKey);
	}

	private String jsonCompleto(String userEmail, Map<String, String[]> parameters) {
		Map<String, String> values = new HashMap<String, String>();

		for (SuperChart chart : chartFactory.values()) {
			String json = chart.generateJson(userEmail, parameters);
			values.put(chart.getName(), json);
		}

		Gson gson = new Gson();

		values.put("customers", gson.toJson(listCustomers(userEmail)));
		values.put("ufs", gson.toJson(listUFs(userEmail)));

		String json = gson.toJson(values);
		return json;
	}

	public List<String> listCustomers(String user) {
		Query query = em().createNamedQuery("DashboardEntity.listCustomers");
		query.setParameter("user", user);
		return query.getResultList();
	}

	public List<String> listUFs(String user) {
		Query query = em().createNamedQuery("DashboardEntity.listUFs");
		query.setParameter("user", user);
		return query.getResultList();
	}

	public void deleteByChNFeWithChilds(String chNFe, String user) {
		deleteChildsByChNFe(chNFe, user);
		deleteByChNFe(chNFe, user);
	}

	public void deleteByUserWithChilds(final String user) {

		deleteChildsByUser(user);

		List<DashboardEntity> dashboards = findByUser(user);
		for (final DashboardEntity dashboard : dashboards) {
			TransactionalFragment tx = new TransactionalFragment() {

				@Override
				protected void doInTransaction() throws Exception {
					deleteByChNFe(dashboard.getChNFe(), user);

				}

			};

			tx.execute();

		}
	}

	private void deleteByChNFe(String chNFe, String user) {
		Query query = em().createNamedQuery("DashboardEntity.deleteByChNFe");
		query.setParameter("chNFe", chNFe);
		query.setParameter("user", user);
		query.executeUpdate();
	}

	private void deleteChildsByUser(final String user) {

		List<DetDashboardEntity> detDashboards = findChildsByUser(user);

		for (final DetDashboardEntity detDashboard : detDashboards) {
			TransactionalFragment tx = new TransactionalFragment() {

				@Override
				protected void doInTransaction() throws Exception {
					deleteChildsByChNFe(detDashboard.getChNFe(), user);

				}

			};

			tx.execute();

		}

	}

	private void deleteChildsByChNFe(String chNFe, String user) {
		Query query = em().createNamedQuery("DetDashboardEntity.deleteByChNFe");
		query.setParameter("chNFe", chNFe);
		query.setParameter("user", user);
		query.executeUpdate();
	}

	private List<DashboardEntity> findByUser(String user) {
		Query query = em().createNamedQuery("DashboardEntity.findByUser");
		query.setParameter("user", user);
		return query.getResultList();
	}

	private List<DetDashboardEntity> findChildsByUser(String user) {
		Query query = em().createNamedQuery("DetDashboardEntity.findByUser");
		query.setParameter("user", user);
		return query.getResultList();
	}

}
