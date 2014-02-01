package com.nfeanalytics.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
		@NamedQuery(name = "DashboardEntity.listCustomers", query = ""
				+ "select distinct obj.nfeProc_NFe_infNFe_dest_xNome "
				+ "  from DashboardEntity obj                        "
				+ " where obj.user = :user                           "
				+ " order by obj.nfeProc_NFe_infNFe_dest_xNome asc   "),

		@NamedQuery(name = "DashboardEntity.listUFs", query = ""
				+ "select distinct obj.nfeProc_NFe_infNFe_dest_enderDest_UF "
				+ "  from DashboardEntity obj                               "
				+ " where obj.user = :user                                  "
				+ " order by obj.nfeProc_NFe_infNFe_dest_enderDest_UF asc   "),
		@NamedQuery(name = "DashboardEntity.findByUser", query = ""
				+ "select obj                   "
				+ "  from DashboardEntity obj   "
				+ " where obj.user =:user       "),
		@NamedQuery(name = "DashboardEntity.deleteByChNFe", query = ""
				+ "delete                     "
				+ "  from DashboardEntity obj "
				+ " where obj.chNFe = :chNFe  "
				+ "   and obj.user  = :user   ")

})
public class DashboardEntity extends SuperEntity {

	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	private List<DetDashboardEntity>	dets	= new LinkedList<DetDashboardEntity>();

	private String						chNFe;

	private double						lat;

	private double						lng;

	private Date						nfeProc_NFe_infNFe_ide_dEmi;

	private int							month;

	private int							year;

	/**
	 * Criado para fazer o agrupamento no select
	 */
	private int							yearMonth;

	private String						nfeProc_NFe_infNFe_dest_xNome;

	private String						nfeProc_NFe_infNFe_dest_enderDest_UF;

	private int							nfeProc_NFe_infNFe_ide_indPag;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vICMS;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vST;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vProd;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vFrete;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vSeg;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vDesc;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vII;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vIPI;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vPIS;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vOutro;

	private BigDecimal					nfeProc_NFe_infNFe_total_ICMSTot_vNF;

	public DashboardEntity() {
	}

	public List<DetDashboardEntity> getDets() {
		return dets;
	}

	public void setDets(List<DetDashboardEntity> dets) {
		this.dets = dets;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
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

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vNF() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vNF;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vNF(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vNF) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vNF = nfeProc_NFe_infNFe_total_ICMSTot_vNF;
	}

	public String getNfeProc_NFe_infNFe_dest_xNome() {
		return nfeProc_NFe_infNFe_dest_xNome;
	}

	public void setNfeProc_NFe_infNFe_dest_xNome(String nfeProc_NFe_infNFe_dest_xNome) {
		this.nfeProc_NFe_infNFe_dest_xNome = nfeProc_NFe_infNFe_dest_xNome;
	}

	public int getNfeProc_NFe_infNFe_ide_indPag() {
		return nfeProc_NFe_infNFe_ide_indPag;
	}

	public void setNfeProc_NFe_infNFe_ide_indPag(int nfeProc_NFe_infNFe_ide_indPag) {
		this.nfeProc_NFe_infNFe_ide_indPag = nfeProc_NFe_infNFe_ide_indPag;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_UF() {
		return nfeProc_NFe_infNFe_dest_enderDest_UF;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_UF(String nfeProc_NFe_infNFe_dest_enderDest_UF) {
		this.nfeProc_NFe_infNFe_dest_enderDest_UF = nfeProc_NFe_infNFe_dest_enderDest_UF;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vICMS() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vICMS;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vICMS(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vICMS) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vICMS = nfeProc_NFe_infNFe_total_ICMSTot_vICMS;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vST() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vST;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vST(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vST) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vST = nfeProc_NFe_infNFe_total_ICMSTot_vST;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vProd() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vProd;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vProd(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vProd) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vProd = nfeProc_NFe_infNFe_total_ICMSTot_vProd;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vFrete() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vFrete;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vFrete(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vFrete) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vFrete = nfeProc_NFe_infNFe_total_ICMSTot_vFrete;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vSeg() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vSeg;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vSeg(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vSeg) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vSeg = nfeProc_NFe_infNFe_total_ICMSTot_vSeg;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vDesc() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vDesc;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vDesc(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vDesc) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vDesc = nfeProc_NFe_infNFe_total_ICMSTot_vDesc;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vII() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vII;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vII(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vII) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vII = nfeProc_NFe_infNFe_total_ICMSTot_vII;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vIPI() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vIPI;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vIPI(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vIPI) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vIPI = nfeProc_NFe_infNFe_total_ICMSTot_vIPI;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vPIS() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vPIS;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vPIS(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vPIS) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vPIS = nfeProc_NFe_infNFe_total_ICMSTot_vPIS;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vCOFINS() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vCOFINS(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS = nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS;
	}

	public BigDecimal getNfeProc_NFe_infNFe_total_ICMSTot_vOutro() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vOutro;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vOutro(BigDecimal nfeProc_NFe_infNFe_total_ICMSTot_vOutro) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vOutro = nfeProc_NFe_infNFe_total_ICMSTot_vOutro;
	}

}
