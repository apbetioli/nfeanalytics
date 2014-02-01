package com.nfeanalytics.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtil {

	static final Calendar	CALENDAR	= Calendar.getInstance();

	public static Date parseToDateXML(String data) {
		Date parse = null;

		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

			parse = simpleDateFormat.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parse;

	}

	public static String parseToString(Date data) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		return simpleDateFormat.format(data);

	}

	public static int getYear(Date data) {
		CALENDAR.setTime(data);
		return CALENDAR.get(Calendar.YEAR);

	}

	public static int getMonth(Date data) {
		CALENDAR.setTime(data);
		return CALENDAR.get(Calendar.MONTH);

	}
}
