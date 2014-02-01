package com.nfeanalytics.util;

public class LinesChartKeyHelper implements Comparable<LinesChartKeyHelper> {

	private int	year;

	private int	month;

	public LinesChartKeyHelper(int year, int month) {
		this.year = year;
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinesChartKeyHelper other = (LinesChartKeyHelper) obj;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public int compareTo(LinesChartKeyHelper o) {
		int compare = ((Integer) this.year).compareTo(o.year);
		if (compare == 0)
			return ((Integer) this.month).compareTo(o.month);
		return compare;
	}

}