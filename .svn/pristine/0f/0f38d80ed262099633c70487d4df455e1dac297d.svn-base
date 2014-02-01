package com.nfeanalytics.core.json;

import java.math.BigDecimal;

public class Value {

	private Object	v;

	private Object	f;

	public Value() {
	}

	public Value(Object v) {
		super();
		setV(v);
	}

	public Object getV() {
		return v;
	}

	public void setV(Object v) {
		this.v = v;

		if (v != null && v instanceof BigDecimal)
			setF(String.format("%.2f", ((BigDecimal) v).doubleValue()));
	}

	public Object getF() {
		return f;
	}

	public void setF(Object f) {
		this.f = f;
	}

}
