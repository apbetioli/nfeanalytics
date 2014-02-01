package com.nfeanalytics.core.helper;


public class IndPagHelper {

	private int	indPag;

	private int	count;

	public int getIndPag() {
		return indPag;
	}

	public void setIndPag(int indPag) {
		this.indPag = indPag;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getDescription() {
		switch (indPag) {
			default :
			case 0 :
				return "Outros";
			case 1 :
				return "A vista";
			case 2 :
				return "A prazo";

		}
	}

}
