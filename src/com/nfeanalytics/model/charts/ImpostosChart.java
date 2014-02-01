package com.nfeanalytics.model.charts;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.google.gson.Gson;
import com.nfeanalytics.core.helper.ImpostosHelper;
import com.nfeanalytics.core.json.Column;
import com.nfeanalytics.core.json.DataTable;
import com.nfeanalytics.core.json.Row;
import com.nfeanalytics.core.json.Value;

public class ImpostosChart extends SuperChart {

	public ImpostosChart() {
		super("impostos");
	}

	@Override
	public String generateJson(String userEmail, Map<String, String[]> parameters) {

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

		ImpostosHelper impostos = getImpostos(userEmail, parameters);
		if (impostos != null) {

			{
				Row row = new Row();
				row.getC().add(new Value("ICMS"));
				row.getC().add(new Value(impostos.getvICMS()));

				dataTable.getRows().add(row);
			}
			{
				Row row = new Row();
				row.getC().add(new Value("ICMS ST"));
				row.getC().add(new Value(impostos.getvST()));

				dataTable.getRows().add(row);
			}
			{
				Row row = new Row();
				row.getC().add(new Value("II"));
				row.getC().add(new Value(impostos.getvII()));

				dataTable.getRows().add(row);
			}
			{
				Row row = new Row();
				row.getC().add(new Value("IPI"));
				row.getC().add(new Value(impostos.getvIPI()));

				dataTable.getRows().add(row);
			}
			{
				Row row = new Row();
				row.getC().add(new Value("PIS"));
				row.getC().add(new Value(impostos.getvPIS()));

				dataTable.getRows().add(row);
			}
			{
				Row row = new Row();
				row.getC().add(new Value("COFINS"));
				row.getC().add(new Value(impostos.getvCOFINS()));

				dataTable.getRows().add(row);
			}
		}

		Gson gson = new Gson();
		String json = gson.toJson(dataTable);

		return json;
	}

	private ImpostosHelper getImpostos(String user, Map<String, String[]> parameters) {

		String sql = "";
		sql += "select sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vICMS),  ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vST),    ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vII),    ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vIPI),   ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vPIS),   ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS) ";
		sql += "  from DashboardEntity obj                               ";
		sql += " where obj.user = :user                                  ";

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

		try {
			query.setMaxResults(1);

			Object[] columns = (Object[]) query.getSingleResult();

			ImpostosHelper helper = new ImpostosHelper();
			helper.setvICMS((BigDecimal) columns[0]);
			helper.setvST((BigDecimal) columns[1]);
			helper.setvII((BigDecimal) columns[2]);
			helper.setvIPI((BigDecimal) columns[3]);
			helper.setvPIS((BigDecimal) columns[4]);
			helper.setvCOFINS((BigDecimal) columns[5]);

			return helper;

		} catch (NoResultException e) {
			return null;
		}

	}
}
