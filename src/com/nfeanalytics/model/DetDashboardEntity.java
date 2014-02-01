package com.nfeanalytics.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
		@NamedQuery(name = "DetDashboardEntity.findByUser", query = ""
				+ "select obj                     "
				+ "  from DetDashboardEntity obj  "
				+ " where obj.user =:user         "),
		@NamedQuery(name = "DetDashboardEntity.deleteByChNFe", query = ""
				+ "delete                        "
				+ "  from DetDashboardEntity obj "
				+ " where obj.chNFe = :chNFe     "
				+ "   and  obj.user =:user       ")

})
public class DetDashboardEntity extends SuperEntity {

	private static final long	serialVersionUID	= 5494908117423026992L;

	private String				chNFe;

	private Date				nfeProc_NFe_infNFe_ide_dEmi;

	private int					month;

	private int					year;

	private int					yearMonth;

	private String				nfeProc_NFe_infNFe_dest_xNome;

	private String				nfeProc_NFe_infNFe_dest_enderDest_UF;

	private String				nfeProc_NFe_infNFe_det_prod_cProd;

	private String				nfeProc_NFe_infNFe_det_prod_xProd;

	private BigDecimal			nfeProc_NFe_infNFe_det_prod_vProd;

	private String				nfeProc_NFe_infNFe_det_prod_uCom;

	private BigDecimal			nfeProc_NFe_infNFe_det_prod_qCom;

	private BigDecimal			nfeProc_NFe_infNFe_det_prod_vUnCom;

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public Date getNfeProc_NFe_infNFe_ide_dEmi() {
		return nfeProc_NFe_infNFe_ide_dEmi;
	}

	public void setNfeProc_NFe_infNFe_ide_dEmi(Date nfeProc_NFe_infNFe_ide_dEmi) {
		this.nfeProc_NFe_infNFe_ide_dEmi = nfeProc_NFe_infNFe_ide_dEmi;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYearMonth() {
		return yearMonth;
	}

	public void setYearMonth(int yearMonth) {
		this.yearMonth = yearMonth;
	}

	public String getNfeProc_NFe_infNFe_dest_xNome() {
		return nfeProc_NFe_infNFe_dest_xNome;
	}

	public void setNfeProc_NFe_infNFe_dest_xNome(String nfeProc_NFe_infNFe_dest_xNome) {
		this.nfeProc_NFe_infNFe_dest_xNome = nfeProc_NFe_infNFe_dest_xNome;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_UF() {
		return nfeProc_NFe_infNFe_dest_enderDest_UF;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_UF(String nfeProc_NFe_infNFe_dest_enderDest_UF) {
		this.nfeProc_NFe_infNFe_dest_enderDest_UF = nfeProc_NFe_infNFe_dest_enderDest_UF;
	}

	public String getNfeProc_NFe_infNFe_det_prod_cProd() {
		return nfeProc_NFe_infNFe_det_prod_cProd;
	}

	public void setNfeProc_NFe_infNFe_det_prod_cProd(String nfeProc_NFe_infNFe_det_prod_cProd) {
		this.nfeProc_NFe_infNFe_det_prod_cProd = nfeProc_NFe_infNFe_det_prod_cProd;
	}

	public String getNfeProc_NFe_infNFe_det_prod_xProd() {
		return nfeProc_NFe_infNFe_det_prod_xProd;
	}

	public void setNfeProc_NFe_infNFe_det_prod_xProd(String nfeProc_NFe_infNFe_det_prod_xProd) {
		this.nfeProc_NFe_infNFe_det_prod_xProd = nfeProc_NFe_infNFe_det_prod_xProd;
	}

	public BigDecimal getNfeProc_NFe_infNFe_det_prod_vProd() {
		return nfeProc_NFe_infNFe_det_prod_vProd;
	}

	public void setNfeProc_NFe_infNFe_det_prod_vProd(BigDecimal nfeProc_NFe_infNFe_det_prod_vProd) {
		this.nfeProc_NFe_infNFe_det_prod_vProd = nfeProc_NFe_infNFe_det_prod_vProd;
	}

	public String getNfeProc_NFe_infNFe_det_prod_uCom() {
		return nfeProc_NFe_infNFe_det_prod_uCom;
	}

	public void setNfeProc_NFe_infNFe_det_prod_uCom(String nfeProc_NFe_infNFe_det_prod_uCom) {
		this.nfeProc_NFe_infNFe_det_prod_uCom = nfeProc_NFe_infNFe_det_prod_uCom;
	}

	public BigDecimal getNfeProc_NFe_infNFe_det_prod_qCom() {
		return nfeProc_NFe_infNFe_det_prod_qCom;
	}

	public void setNfeProc_NFe_infNFe_det_prod_qCom(BigDecimal nfeProc_NFe_infNFe_det_prod_qCom) {
		this.nfeProc_NFe_infNFe_det_prod_qCom = nfeProc_NFe_infNFe_det_prod_qCom;
	}

	public BigDecimal getNfeProc_NFe_infNFe_det_prod_vUnCom() {
		return nfeProc_NFe_infNFe_det_prod_vUnCom;
	}

	public void setNfeProc_NFe_infNFe_det_prod_vUnCom(BigDecimal nfeProc_NFe_infNFe_det_prod_vUnCom) {
		this.nfeProc_NFe_infNFe_det_prod_vUnCom = nfeProc_NFe_infNFe_det_prod_vUnCom;
	}

}
