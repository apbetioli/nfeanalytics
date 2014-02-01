package com.nfeanalytics.core.helper;

import java.math.BigDecimal;

public class ReceitaDespesaPorAnoHelper {

	private int			year;

	private BigDecimal	valorProdutos;

	private BigDecimal	valorImpostos;

	private BigDecimal	valorOutros;

	private BigDecimal	valorNF;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public BigDecimal getValorProdutos() {
		return valorProdutos;
	}

	public void setValorProdutos(BigDecimal valorProdutos) {
		this.valorProdutos = valorProdutos;
	}

	public BigDecimal getValorImpostos() {
		return valorImpostos;
	}

	public void setValorImpostos(BigDecimal valorImpostos) {
		this.valorImpostos = valorImpostos;
	}

	public BigDecimal getValorOutros() {
		return valorOutros;
	}

	public void setValorOutros(BigDecimal valorOutros) {
		this.valorOutros = valorOutros;
	}

	public BigDecimal getValorNF() {
		return valorNF;
	}

	public void setValorNF(BigDecimal valorNF) {
		this.valorNF = valorNF;
	}

}
