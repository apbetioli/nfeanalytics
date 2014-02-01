package com.nfeanalytics.model.charts;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.persistence.Query;

import com.google.gson.Gson;
import com.nfeanalytics.core.json.Column;
import com.nfeanalytics.core.json.DataTable;
import com.nfeanalytics.core.json.Row;
import com.nfeanalytics.core.json.Value;
import com.nfeanalytics.model.DashboardEntity;
import com.nfeanalytics.util.LinesChartKeyHelper;

public class CompanyPerformanceChart extends SuperChart {

	public CompanyPerformanceChart() {
		super("line");
	}

	@Override
	public String generateJson(String userEmail, Map<String, String[]> parameters) {

		List<DashboardEntity> list = getCompanyPerformance(userEmail, parameters);

		Calendar now = Calendar.getInstance();
		int currentYear = now.get(Calendar.YEAR);
		int minYear = currentYear;
		int maxYear = 0;

		Map<LinesChartKeyHelper, BigDecimal> map = new HashMap<LinesChartKeyHelper, BigDecimal>();

		for (DashboardEntity dash : list) {
			LinesChartKeyHelper linesChartKeyHelper = new LinesChartKeyHelper(dash.getYear(), dash.getMonth());
			map.put(linesChartKeyHelper, dash.getNfeProc_NFe_infNFe_total_ICMSTot_vNF());

			minYear = Math.min(minYear, dash.getYear());
			maxYear = Math.max(maxYear, dash.getYear());
		}

		if (maxYear == 0)
			maxYear = minYear;

		DataTable dataTable = new DataTable();

		{
			Column cMonth = new Column();
			cMonth.setLabel("Month");
			cMonth.setType("string");

			dataTable.getCols().add(cMonth);
		}

		for (int month = 1; month <= 12; month++) {

			Row r1 = new Row();

			now.set(Calendar.MONTH, month - 1);

			Value v1 = new Value();
			v1.setV(now.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault()));

			r1.getC().add(v1);

			for (int year = minYear; year <= maxYear; year++) {

				LinesChartKeyHelper linesChartKeyHelper = new LinesChartKeyHelper(year, month);
				BigDecimal value = map.get(linesChartKeyHelper);

				Value v2 = new Value();
				v2.setV(value != null ? value : BigDecimal.ZERO);

				r1.getC().add(v2);
			}

			dataTable.getRows().add(r1);
		}

		for (int year = minYear; year <= maxYear; year++) {

			Column cYear = new Column();
			cYear.setLabel("" + year);
			cYear.setType("number");

			dataTable.getCols().add(cYear);
		}

		Gson gson = new Gson();
		String json = gson.toJson(dataTable);

		return json;
	}

	private List<DashboardEntity> getCompanyPerformance(String user, Map<String, String[]> parameters) {
		String sql = "";
		sql += "select obj.year,                                     ";
		sql += "       obj.month,                                    ";
		sql += "       obj.yearMonth,                                ";
		sql += "       sum(obj.nfeProc_NFe_infNFe_total_ICMSTot_vNF) ";
		sql += "  from DashboardEntity obj                           ";
		sql += " where obj.user = :user                              ";

		Integer beginDate = null;
		if (parameters.containsKey("begin")) {
			try {
				String begin = parameters.get("begin")[0];
				Date date = SIMPLE_DATE_FORMAT.parse(begin);
				beginDate = Integer.parseInt(SIMPLE_DATE_FORMAT_GROUP.format(date));

				sql += " and obj.yearMonth >= :begin ";

			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		Integer endDate = null;
		if (parameters.containsKey("end")) {
			try {
				String end = parameters.get("end")[0];
				Date date = SIMPLE_DATE_FORMAT.parse(end);
				endDate = Integer.parseInt(SIMPLE_DATE_FORMAT_GROUP.format(date));

				sql += " and obj.yearMonth <= :end ";

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

		sql += " group by obj.yearMonth, obj.year, obj.month                        ";
		sql += " order by obj.yearMonth, obj.year, obj.month                        ";

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

		List<DashboardEntity> list = new ArrayList<DashboardEntity>(resultList.size());
		for (Object result : resultList) {
			Object[] columns = (Object[]) result;

			DashboardEntity helper = new DashboardEntity();
			helper.setYear((int) columns[0]);
			helper.setMonth((int) columns[1]);
			helper.setNfeProc_NFe_infNFe_total_ICMSTot_vNF(((BigDecimal) columns[3]).setScale(2, RoundingMode.HALF_UP));
			list.add(helper);
		}

		return list;
	}
}
