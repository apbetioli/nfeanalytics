package com.nfeanalytics.model.charts;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import com.google.gson.Gson;
import com.nfeanalytics.core.helper.IndPagHelper;
import com.nfeanalytics.core.json.Column;
import com.nfeanalytics.core.json.DataTable;
import com.nfeanalytics.core.json.Row;
import com.nfeanalytics.core.json.Value;

public class PaymentMethodChart extends SuperChart {

	public PaymentMethodChart() {
		super("pie");
	}

	@Override
	public String generateJson(String userEmail, Map<String, String[]> parameters) {

		List<IndPagHelper> list = getPaymentMethods(userEmail, parameters);

		DataTable dataTable = new DataTable();

		{
			Column c1 = new Column();
			c1.setLabel("Description");
			c1.setType("string");

			Column c2 = new Column();
			c2.setLabel("Value");
			c2.setType("number");

			dataTable.getCols().add(c1);
			dataTable.getCols().add(c2);
		}

		for (IndPagHelper helper : list) {

			Value v1 = new Value();
			v1.setV(helper.getDescription());

			Value v2 = new Value();
			v2.setV(helper.getCount());

			Row r1 = new Row();
			r1.getC().add(v1);
			r1.getC().add(v2);

			dataTable.getRows().add(r1);

		}

		Gson gson = new Gson();
		String json = gson.toJson(dataTable);

		return json;
	}

	private List<IndPagHelper> getPaymentMethods(String user, Map<String, String[]> parameters) {

		String sql = "";
		sql += "select obj.nfeProc_NFe_infNFe_ide_indPag,       ";
		sql += "       count(obj.nfeProc_NFe_infNFe_ide_indPag) ";
		sql += "  from DashboardEntity obj                      ";
		sql += " where obj.user = :user                         ";

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

		sql += " group by obj.nfeProc_NFe_infNFe_ide_indPag     ";

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

		List<IndPagHelper> list = new ArrayList<IndPagHelper>(resultList.size());
		for (Object result : resultList) {
			Object[] columns = (Object[]) result;

			IndPagHelper helper = new IndPagHelper();
			helper.setIndPag((int) columns[0]);
			helper.setCount((int) (long) columns[1]);
			list.add(helper);
		}

		return list;
	}
}
