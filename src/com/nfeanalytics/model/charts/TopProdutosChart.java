package com.nfeanalytics.model.charts;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import com.google.gson.Gson;
import com.nfeanalytics.core.json.Column;
import com.nfeanalytics.core.json.DataTable;
import com.nfeanalytics.core.json.Row;
import com.nfeanalytics.core.json.Value;
import com.nfeanalytics.model.DetDashboardEntity;

public class TopProdutosChart extends SuperChart {

	public TopProdutosChart() {
		super("produtos");
	}

	@Override
	public String generateJson(String userEmail, Map<String, String[]> parameters) {

		List<DetDashboardEntity> list = getTopProdutos(userEmail, parameters);

		DataTable dataTable = new DataTable();

		{
			Column c1 = new Column();
			c1.setLabel("Produto");
			c1.setType("string");

			Column c2 = new Column();
			c2.setLabel("Valor");
			c2.setType("number");

			dataTable.getCols().add(c1);
			dataTable.getCols().add(c2);
		}

		Iterator<DetDashboardEntity> iterator = list.iterator();
		for (int i = 0; i < 10 && iterator.hasNext(); i++) {

			DetDashboardEntity helper = iterator.next();

			Value v1 = new Value();
			v1.setV(helper.getNfeProc_NFe_infNFe_det_prod_xProd());

			Value v2 = new Value();
			v2.setV(helper.getNfeProc_NFe_infNFe_det_prod_vProd());

			Row r1 = new Row();
			r1.getC().add(v1);
			r1.getC().add(v2);

			dataTable.getRows().add(r1);
		}

		Gson gson = new Gson();
		String json = gson.toJson(dataTable);

		return json;
	}

	private List<DetDashboardEntity> getTopProdutos(String user, Map<String, String[]> parameters) {

		String sql = "";
		sql += "select obj.nfeProc_NFe_infNFe_det_prod_xProd,     ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_det_prod_vProd) ";
		sql += "  from DetDashboardEntity obj                     ";
		sql += " where obj.user = :user                           ";

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

		sql += " group by obj.nfeProc_NFe_infNFe_det_prod_xProd          ";

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

		List resultList = query.getResultList();

		List<DetDashboardEntity> list = new ArrayList<DetDashboardEntity>(resultList.size());
		for (Object result : resultList) {
			Object[] columns = (Object[]) result;

			DetDashboardEntity helper = new DetDashboardEntity();
			helper.setNfeProc_NFe_infNFe_det_prod_xProd((String) columns[0]);
			helper.setNfeProc_NFe_infNFe_det_prod_vProd(((BigDecimal) columns[1]).setScale(2, RoundingMode.HALF_UP));
			list.add(helper);
		}

		Collections.sort(list, new Comparator<DetDashboardEntity>() {

			@Override
			public int compare(DetDashboardEntity o1, DetDashboardEntity o2) {
				return o2.getNfeProc_NFe_infNFe_det_prod_vProd().compareTo(
						o1.getNfeProc_NFe_infNFe_det_prod_vProd());
			}
		});

		return list;
	}

}
