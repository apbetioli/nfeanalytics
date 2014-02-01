package com.nfeanalytics.model.charts;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.persistence.Query;

import com.google.gson.Gson;
import com.nfeanalytics.core.helper.ReceitaDespesaPorAnoHelper;
import com.nfeanalytics.core.json.Column;
import com.nfeanalytics.core.json.DataTable;
import com.nfeanalytics.core.json.Row;
import com.nfeanalytics.core.json.Value;

public class ReceitaDespesaChart extends SuperChart {

	public ReceitaDespesaChart() {
		super("receita");
	}

	@Override
	public String generateJson(String userEmail, Map<String, String[]> parameters) {
		DataTable dataTable = new DataTable();

		{
			Column c = new Column();
			c.setLabel("Ano");
			c.setType("string");

			dataTable.getCols().add(c);
		}
		{
			Column c = new Column();
			c.setLabel("Produtos");
			c.setType("number");

			dataTable.getCols().add(c);
		}
		{
			Column c = new Column();
			c.setLabel("Impostos");
			c.setType("number");

			dataTable.getCols().add(c);
		}
		{
			Column c = new Column();
			c.setLabel("Outros");
			c.setType("number");

			dataTable.getCols().add(c);
		}
		{
			Column c = new Column();
			c.setLabel("Total nota");
			c.setType("number");

			dataTable.getCols().add(c);
		}

		List<ReceitaDespesaPorAnoHelper> list = getReceitaDespesaPorAno(userEmail, parameters);

		for (ReceitaDespesaPorAnoHelper receita : list) {

			Row row = new Row();
			row.getC().add(new Value(receita.getYear()));
			row.getC().add(new Value(receita.getValorProdutos()));
			row.getC().add(new Value(receita.getValorImpostos()));
			row.getC().add(new Value(receita.getValorOutros()));
			row.getC().add(new Value(receita.getValorNF()));

			dataTable.getRows().add(row);
		}

		Gson gson = new Gson();
		String json = gson.toJson(dataTable);

		return json;
	}

	private List<ReceitaDespesaPorAnoHelper> getReceitaDespesaPorAno(String user, Map<String, String[]> parameters) {

		String sql = "";
		sql += "select obj.year,                                          ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vProd),   ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vICMS+    "
				+ "        obj.nfeProc_NFe_infNFe_total_ICMSTot_vST+      "
				+ "        obj.nfeProc_NFe_infNFe_total_ICMSTot_vII+      "
				+ "        obj.nfeProc_NFe_infNFe_total_ICMSTot_vIPI+     "
				+ "        obj.nfeProc_NFe_infNFe_total_ICMSTot_vPIS+     "
				+ "        obj.nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS), ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vFrete+   "
				+ "        obj.nfeProc_NFe_infNFe_total_ICMSTot_vSeg+     "
				+ "        obj.nfeProc_NFe_infNFe_total_ICMSTot_vDesc+    "
				+ "        obj.nfeProc_NFe_infNFe_total_ICMSTot_vOutro),  ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vNF)      ";
		sql += "  from DashboardEntity obj                                ";
		sql += " where obj.user = :user                                   ";

		Date beginDate = null;
		if (parameters.containsKey("begin")) {
			try {
				String begin = parameters.get("begin")[0];
				beginDate = SIMPLE_DATE_FORMAT.parse(begin);

				sql += " and obj.year >= :begin ";
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		Date endDate = null;
		if (parameters.containsKey("end")) {
			try {
				String end = parameters.get("end")[0];
				endDate = SIMPLE_DATE_FORMAT.parse(end);

				sql += " and obj.year <= :end ";
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

		sql += " group by obj.year     ";
		sql += " order by obj.year asc ";

		Query query = em().createQuery(sql);
		query.setParameter("user", user);

		if (beginDate != null) {
			Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
			c.setTime(beginDate);
			query.setParameter("begin", c.get(Calendar.YEAR));
		}

		if (endDate != null) {
			Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
			c.setTime(endDate);
			query.setParameter("end", c.get(Calendar.YEAR));
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

		List<ReceitaDespesaPorAnoHelper> result = new ArrayList<ReceitaDespesaPorAnoHelper>();

		for (Object object : list) {
			Object[] columns = (Object[]) object;

			ReceitaDespesaPorAnoHelper helper = new ReceitaDespesaPorAnoHelper();
			helper.setYear((int) columns[0]);
			helper.setValorProdutos((BigDecimal) columns[1]);
			helper.setValorImpostos((BigDecimal) columns[2]);
			helper.setValorOutros((BigDecimal) columns[3]);
			helper.setValorNF((BigDecimal) columns[4]);

			result.add(helper);
		}

		return result;

	}
}
