package com.nfeanalytics.model.charts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import com.google.gson.Gson;
import com.nfeanalytics.core.helper.FretePorEstadoHelper;
import com.nfeanalytics.core.json.Column;
import com.nfeanalytics.core.json.DataTable;
import com.nfeanalytics.core.json.Row;
import com.nfeanalytics.core.json.Value;

public class FretePorEstadoChart extends SuperChart {

	public FretePorEstadoChart() {
		super("frete_estado");
	}

	@Override
	public String generateJson(String userEmail, Map<String, String[]> parameters) {
		DataTable dataTable = new DataTable();

		{
			Column c = new Column();
			c.setLabel("UF");
			c.setType("string");

			dataTable.getCols().add(c);
		}
		{
			Column c = new Column();
			c.setLabel("Valor");
			c.setType("number");

			dataTable.getCols().add(c);
		}

		List<FretePorEstadoHelper> list = getFretePorEstado(userEmail, parameters);

		for (FretePorEstadoHelper receita : list) {

			Row row = new Row();
			row.getC().add(new Value(receita.getUf()));
			row.getC().add(new Value(receita.getValor()));

			dataTable.getRows().add(row);
		}

		Gson gson = new Gson();
		String json = gson.toJson(dataTable);

		return json;
	}

	private List<FretePorEstadoHelper> getFretePorEstado(String user, Map<String, String[]> parameters) {

		String sql = "";
		sql += "select obj.nfeProc_NFe_infNFe_dest_enderDest_UF,          ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vFrete)   ";
		sql += "  from DashboardEntity obj                                ";
		sql += " where obj.user = :user                                   ";

		// Date beginDate = null;
		// if (parameters.containsKey("begin")) {
		// try {
		// String begin = parameters.get("begin")[0];
		// beginDate = SIMPLE_DATE_FORMAT.parse(begin);
		//
		// sql += " and obj.year >= :begin ";
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
		// }
		//
		// Date endDate = null;
		// if (parameters.containsKey("end")) {
		// try {
		// String end = parameters.get("end")[0];
		// endDate = SIMPLE_DATE_FORMAT.parse(end);
		//
		// sql += " and obj.year <= :end ";
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
		// }

		if (parameters.containsKey("customers")) {
			sql += " and obj.nfeProc_NFe_infNFe_dest_xNome in ( :customers ) ";
		}

		if (parameters.containsKey("ufs")) {
			sql += " and obj.nfeProc_NFe_infNFe_dest_enderDest_UF in ( :ufs ) ";
		}

		sql += " group by obj.nfeProc_NFe_infNFe_dest_enderDest_UF ";
		sql += " order by obj.nfeProc_NFe_infNFe_dest_enderDest_UF asc ";

		Query query = em().createQuery(sql);
		query.setParameter("user", user);

		// if (beginDate != null) {
		// Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		// c.setTime(beginDate);
		// query.setParameter("begin", c.get(Calendar.YEAR));
		// }
		//
		// if (endDate != null) {
		// Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		// c.setTime(endDate);
		// query.setParameter("end", c.get(Calendar.YEAR));
		// }

		if (parameters.containsKey("customers")) {
			String[] customers = parameters.get("customers");
			query.setParameter("customers", Arrays.asList(customers));
		}

		if (parameters.containsKey("ufs")) {
			String[] ufs = parameters.get("ufs");
			query.setParameter("ufs", Arrays.asList(ufs));
		}

		List list = query.getResultList();

		List<FretePorEstadoHelper> result = new ArrayList<FretePorEstadoHelper>();

		for (Object object : list) {
			Object[] columns = (Object[]) object;

			FretePorEstadoHelper helper = new FretePorEstadoHelper();
			helper.setUf((String) columns[0]);
			helper.setValor((BigDecimal) columns[1]);

			result.add(helper);
		}

		Collections.sort(result, new Comparator<FretePorEstadoHelper>() {

			@Override
			public int compare(FretePorEstadoHelper o1, FretePorEstadoHelper o2) {
				return o2.getValor().compareTo(o1.getValor());
			}
		});

		return result;

	}

}
