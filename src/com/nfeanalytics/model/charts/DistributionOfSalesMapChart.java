package com.nfeanalytics.model.charts;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import com.google.gson.Gson;
import com.nfeanalytics.core.json.Coordinate;

public class DistributionOfSalesMapChart extends SuperChart {

	public DistributionOfSalesMapChart() {
		super("map");
	}

	@Override
	public String generateJson(String userEmail, Map<String, String[]> parameters) {
		List<Coordinate> list = getDistributionOfSalesCoordinates(userEmail, parameters);

		String json = new Gson().toJson(list);

		return json;
	}

	private List<Coordinate> getDistributionOfSalesCoordinates(String user, Map<String, String[]> parameters) {

		String sql = "";
		sql += "select obj.lat,            ";
		sql += "       obj.lng             ";
		sql += "  from DashboardEntity obj ";
		sql += " where obj.user = :user    ";

		Date beginDate = null;
		if (parameters.containsKey("begin")) {
			try {
				String begin = parameters.get("begin")[0];
				beginDate = SIMPLE_DATE_FORMAT.parse(begin);

				sql += " and obj.nfeProc_NFe_infNFe_ide_dEmi >= :begin ";
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		Date endDate = null;
		if (parameters.containsKey("end")) {
			try {
				String end = parameters.get("end")[0];
				endDate = SIMPLE_DATE_FORMAT.parse(end);

				sql += " and obj.nfeProc_NFe_infNFe_ide_dEmi <= :end ";
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		if (parameters.containsKey("customers")) {
			sql += " and obj.nfeProc_NFe_infNFe_dest_xNome in ( :customers ) ";
		}

		if (parameters.containsKey("ufs")) {
			sql += " and obj.nfeProc_NFe_infNFe_dest_enderDest_UF in ( :ufs ) ";
		}

		Query query = em().createQuery(sql);
		query.setParameter("user", user);

		if (beginDate != null) {
			query.setParameter("begin", beginDate);
		}

		if (endDate != null) {
			query.setParameter("end", endDate);
		}

		if (parameters.containsKey("customers")) {
			String[] customers = parameters.get("customers");
			query.setParameter("customers", Arrays.asList(customers));
		}

		if (parameters.containsKey("ufs")) {
			String[] ufs = parameters.get("ufs");
			query.setParameter("ufs", Arrays.asList(ufs));
		}

		List list = query.getResultList();

		List<Coordinate> coords = new ArrayList<Coordinate>(list.size());
		for (Object result : list) {
			Object[] columns = (Object[]) result;

			Coordinate coordinate = new Coordinate((double) columns[0], (double) columns[1]);
			if (coordinate.isValid())
				coords.add(coordinate);

		}
		return coords;
	}
}
