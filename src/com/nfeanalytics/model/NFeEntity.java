package com.nfeanalytics.model;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nfeanalytics.core.json.Coordinate;
import com.nfeanalytics.core.map.GeocodingClient;
import com.nfeanalytics.util.DataUtil;

@Entity
@NamedQueries({
		@NamedQuery(name = "NFeEntity.findByUser", query = ""
				+ "select obj               "
				+ "  from NFeEntity obj     "
				+ " where obj.user =:user"),
		@NamedQuery(name = "NFeEntity.findByChNFe", query = ""
				+ "select obj                                       "
				+ "  from NFeEntity obj                             "
				+ " where obj.chNFe = :chNFe"
				+ "   and obj.user  = :user"),

		@NamedQuery(name = "NFeEntity.deleteByChNFe", query = ""
				+ "delete                     "
				+ "  from NFeEntity obj       "
				+ " where obj.chNFe = :chNFe  "
				+ "   and obj.user  = :user")

})
public class NFeEntity extends SuperEntity implements Comparable<NFeEntity> {

	private static final long	serialVersionUID	= 2841492119975354479L;

	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	private List<DetEntity>		dets				= new LinkedList<DetEntity>();

	private String				chNFe;

	private String				nfeProc_NFe_infNFe_ide_cUF;

	private String				nfeProc_NFe_infNFe_ide_cNF;

	private String				nfeProc_NFe_infNFe_ide_natOp;

	private String				nfeProc_NFe_infNFe_ide_indPag;

	private String				nfeProc_NFe_infNFe_ide_mod;

	private String				nfeProc_NFe_infNFe_ide_serie;

	private String				nfeProc_NFe_infNFe_ide_nNF;

	private String				nfeProc_NFe_infNFe_ide_dEmi;

	private String				nfeProc_NFe_infNFe_ide_dSaiEnt;

	private String				nfeProc_NFe_infNFe_ide_hSaiEnt;

	private String				nfeProc_NFe_infNFe_ide_tpNF;

	private String				nfeProc_NFe_infNFe_ide_cMunFG;

	private String				nfeProc_NFe_infNFe_ide_NFref;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNFe;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNF_cUF;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNF_AAMM;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNF_CNPJ;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNF_mod;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNF_serie;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNF_nNF;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNFP_cUF;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNFP_AAMM;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNFP_CNPJ;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNFP_CPF;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNFP_IE;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNFP_mod;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNFP_serie;

	private String				nfeProc_NFe_infNFe_ide_NFref_refNFP_nNF;

	private String				nfeProc_NFe_infNFe_ide_NFref_refCTe;

	private String				nfeProc_NFe_infNFe_ide_NFref_refECF_mod;

	private String				nfeProc_NFe_infNFe_ide_NFref_refECF_nECF;

	private String				nfeProc_NFe_infNFe_ide_NFref_refECF_nCOO;

	private String				nfeProc_NFe_infNFe_ide_tpImp;

	private String				nfeProc_NFe_infNFe_ide_tpEmis;

	private String				nfeProc_NFe_infNFe_ide_cDV;

	private String				nfeProc_NFe_infNFe_ide_tpAmb;

	private String				nfeProc_NFe_infNFe_ide_finNFe;

	private String				nfeProc_NFe_infNFe_ide_procEmi;

	private String				nfeProc_NFe_infNFe_ide_verProc;

	private String				nfeProc_NFe_infNFe_ide_dhCont;

	private String				nfeProc_NFe_infNFe_ide_xJust;

	private String				nfeProc_NFe_infNFe_emit_CNPJ;

	private String				nfeProc_NFe_infNFe_emit_CPF;

	private String				nfeProc_NFe_infNFe_emit_xNome;

	private String				nfeProc_NFe_infNFe_emit_xFant;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_xLgr;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_nro;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_xCpl;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_xBairro;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_cMun;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_xMun;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_UF;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_CEP;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_cPais;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_xPais;

	private String				nfeProc_NFe_infNFe_emit_enderEmit_fone;

	private String				nfeProc_NFe_infNFe_emit_IE;

	private String				nfeProc_NFe_infNFe_emit_IEST;

	private String				nfeProc_NFe_infNFe_emit_IM;

	private String				nfeProc_NFe_infNFe_emit_CNAE;

	private String				nfeProc_NFe_infNFe_emit_CRT;

	private String				nfeProc_NFe_infNFe_avulsa_CNPJ;

	private String				nfeProc_NFe_infNFe_avulsa_xOrgao;

	private String				nfeProc_NFe_infNFe_avulsa_matr;

	private String				nfeProc_NFe_infNFe_avulsa_xAgente;

	private String				nfeProc_NFe_infNFe_avulsa_fone;

	private String				nfeProc_NFe_infNFe_avulsa_UF;

	private String				nfeProc_NFe_infNFe_avulsa_nDAR;

	private String				nfeProc_NFe_infNFe_avulsa_dEmi;

	private String				nfeProc_NFe_infNFe_avulsa_vDAR;

	private String				nfeProc_NFe_infNFe_avulsa_repEmi;

	private String				nfeProc_NFe_infNFe_avulsa_dPag;

	private String				nfeProc_NFe_infNFe_dest_CNPJ;

	private String				nfeProc_NFe_infNFe_dest_CPF;

	private String				nfeProc_NFe_infNFe_dest_xNome;

	private String				nfeProc_NFe_infNFe_dest_enderDest_xLgr;

	private String				nfeProc_NFe_infNFe_dest_enderDest_nro;

	private String				nfeProc_NFe_infNFe_dest_enderDest_xCpl;

	private String				nfeProc_NFe_infNFe_dest_enderDest_xBairro;

	private String				nfeProc_NFe_infNFe_dest_enderDest_cMun;

	private String				nfeProc_NFe_infNFe_dest_enderDest_xMun;

	private String				nfeProc_NFe_infNFe_dest_enderDest_UF;

	private String				nfeProc_NFe_infNFe_dest_enderDest_CEP;

	private String				nfeProc_NFe_infNFe_dest_enderDest_cPais;

	private String				nfeProc_NFe_infNFe_dest_enderDest_xPais;

	private String				nfeProc_NFe_infNFe_dest_enderDest_fone;

	private String				nfeProc_NFe_infNFe_dest_IE;

	private String				nfeProc_NFe_infNFe_dest_ISUF;

	private String				nfeProc_NFe_infNFe_dest_email;

	private String				nfeProc_NFe_infNFe_retirada_CNPJ;

	private String				nfeProc_NFe_infNFe_retirada_CPF;

	private String				nfeProc_NFe_infNFe_retirada_xLgr;

	private String				nfeProc_NFe_infNFe_retirada_nro;

	private String				nfeProc_NFe_infNFe_retirada_xCpl;

	private String				nfeProc_NFe_infNFe_retirada_xBairro;

	private String				nfeProc_NFe_infNFe_retirada_cMun;

	private String				nfeProc_NFe_infNFe_retirada_xMun;

	private String				nfeProc_NFe_infNFe_retirada_UF;

	private String				nfeProc_NFe_infNFe_entrega_CNPJ;

	private String				nfeProc_NFe_infNFe_entrega_CPF;

	private String				nfeProc_NFe_infNFe_entrega_xLgr;

	private String				nfeProc_NFe_infNFe_entrega_nro;

	private String				nfeProc_NFe_infNFe_entrega_xCpl;

	private String				nfeProc_NFe_infNFe_entrega_xBairro;

	private String				nfeProc_NFe_infNFe_entrega_cMun;

	private String				nfeProc_NFe_infNFe_entrega_xMun;

	private String				nfeProc_NFe_infNFe_entrega_UF;

	private String				nfeProc_NFe_infNFe_total_ICMSTot;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vBC;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vICMS;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vBCST;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vST;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vProd;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vFrete;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vSeg;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vDesc;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vII;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vIPI;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vPIS;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vOutro;

	private String				nfeProc_NFe_infNFe_total_ICMSTot_vNF;

	private String				nfeProc_NFe_infNFe_total_ISSQNtot_vServ;

	private String				nfeProc_NFe_infNFe_total_ISSQNtot_vBC;

	private String				nfeProc_NFe_infNFe_total_ISSQNtot_vISS;

	private String				nfeProc_NFe_infNFe_total_ISSQNtot_vPIS;

	private String				nfeProc_NFe_infNFe_total_ISSQNtot_vCOFINS;

	private String				nfeProc_NFe_infNFe_total_retTrib_vRetPIS;

	private String				nfeProc_NFe_infNFe_total_retTrib_vRetCOFINS;

	private String				nfeProc_NFe_infNFe_total_retTrib_vRetCSLL;

	private String				nfeProc_NFe_infNFe_total_retTrib_vBCIRRF;

	private String				nfeProc_NFe_infNFe_total_retTrib_vIRRF;

	private String				nfeProc_NFe_infNFe_total_retTrib_vBCRetPrev;

	private String				nfeProc_NFe_infNFe_total_retTrib_vRetPrev;

	private String				nfeProc_NFe_infNFe_transp_modFrete;

	private String				nfeProc_NFe_infNFe_transp_transporta_CNPJ;

	private String				nfeProc_NFe_infNFe_transp_transporta_CPF;

	private String				nfeProc_NFe_infNFe_transp_transporta_xNome;

	private String				nfeProc_NFe_infNFe_transp_transporta_IE;

	private String				nfeProc_NFe_infNFe_transp_transporta_xEnder;

	private String				nfeProc_NFe_infNFe_transp_transporta_xMun;

	private String				nfeProc_NFe_infNFe_transp_transporta_UF;

	private String				nfeProc_NFe_infNFe_transp_retTransp_vServ;

	private String				nfeProc_NFe_infNFe_transp_retTransp_vBCRet;

	private String				nfeProc_NFe_infNFe_transp_retTransp_pICMSRet;

	private String				nfeProc_NFe_infNFe_transp_retTransp_vICMSRet;

	private String				nfeProc_NFe_infNFe_transp_retTransp_CFOP;

	private String				nfeProc_NFe_infNFe_transp_retTransp_cMunFG;

	private String				nfeProc_NFe_infNFe_transp_veicTransp_placa;

	private String				nfeProc_NFe_infNFe_transp_veicTransp_UF;

	private String				nfeProc_NFe_infNFe_transp_veicTransp_RNTC;

	private String				nfeProc_NFe_infNFe_transp_reboque_UF;

	private String				nfeProc_NFe_infNFe_transp_reboque_RNTC;

	private String				nfeProc_NFe_infNFe_transp_vagao;

	private String				nfeProc_NFe_infNFe_transp_balsa;

	private String				nfeProc_NFe_infNFe_transp_vol_qVol;

	private String				nfeProc_NFe_infNFe_transp_vol_esp;

	private String				nfeProc_NFe_infNFe_transp_vol_marca;

	private String				nfeProc_NFe_infNFe_transp_vol_nVol;

	private String				nfeProc_NFe_infNFe_transp_vol_pesoL;

	private String				nfeProc_NFe_infNFe_transp_vol_pesoB;

	private String				nfeProc_NFe_infNFe_transp_vol_lacres_nLacre;

	private String				nfeProc_NFe_infNFe_cobr_fat_nFat;

	private String				nfeProc_NFe_infNFe_cobr_fat_vOrig;

	private String				nfeProc_NFe_infNFe_cobr_fat_vDesc;

	private String				nfeProc_NFe_infNFe_cobr_fat_vLiq;

	private String				nfeProc_NFe_infNFe_cobr_dup_nDup;

	private String				nfeProc_NFe_infNFe_cobr_dup_dVenc;

	private String				nfeProc_NFe_infNFe_cobr_dup_vDup;

	private String				nfeProc_NFe_infNFe_infAdic_infAdFisco;

	private String				nfeProc_NFe_infNFe_infAdic_infCpl;

	private String				nfeProc_NFe_infNFe_infAdic_obsCont_xCampo;

	private String				nfeProc_NFe_infNFe_infAdic_obsCont_xTexto;

	private String				nfeProc_NFe_infNFe_infAdic_obsFisco_xCampo;

	private String				nfeProc_NFe_infNFe_infAdic_obsFisco_xTexto;

	private String				nfeProc_NFe_infNFe_infAdic_procRef_nProc;

	private String				nfeProc_NFe_infNFe_infAdic_procRef_indProc;

	private String				nfeProc_NFe_infNFe_exporta_UFEmbarq;

	private String				nfeProc_NFe_infNFe_exporta_xLocEmbarq;

	private String				nfeProc_NFe_infNFe_compra_xNEmp;

	private String				nfeProc_NFe_infNFe_compra_xPed;

	private String				nfeProc_NFe_infNFe_compra_xCont;

	private String				nfeProc_NFe_infNFe_cana_safra;

	private String				nfeProc_NFe_infNFe_cana_ref;

	private String				nfeProc_NFe_infNFe_cana_forDia_qtde;

	private String				nfeProc_NFe_infNFe_cana_qTotMes;

	private String				nfeProc_NFe_infNFe_cana_qTotAnt;

	private String				nfeProc_NFe_infNFe_cana_qTotGer;

	private String				nfeProc_NFe_infNFe_cana_deduc_xDed;

	private String				nfeProc_NFe_infNFe_cana_deduc_vDed;

	private String				nfeProc_NFe_infNFe_cana_vFor;

	private String				nfeProc_NFe_infNFe_cana_vTotDed;

	private String				nfeProc_NFe_infNFe_cana_vLiqFor;

	private String				nfeProc_protNFe_infProt_tpAmb;

	private String				nfeProc_protNFe_infProt_verAplic;

	private String				nfeProc_protNFe_infProt_dhRecbto;

	private String				nfeProc_protNFe_infProt_nProt;

	private String				nfeProc_protNFe_infProt_digVal;

	private String				nfeProc_protNFe_infProt_cStat;

	private String				nfeProc_protNFe_infProt_xMotivo;

	private String				nfeProc_NFe_infNFe_Id;

	private String				nfeProc_NFe_infNFe_versao;

	private String				nfeProc_protNFe_versao;

	public NFeEntity() {
	}

	public NFeEntity(String user) {
		setUser(user);
	}

	public String getEndereco() {
		return this.nfeProc_NFe_infNFe_dest_enderDest_xLgr + ", "
				+ this.nfeProc_NFe_infNFe_dest_enderDest_nro + ", "
				+ this.nfeProc_NFe_infNFe_dest_enderDest_xMun + ", "
				+ this.nfeProc_NFe_infNFe_dest_enderDest_UF + ", "
				+ this.nfeProc_NFe_infNFe_dest_enderDest_xPais;
	}

	public List<DetEntity> getDets() {
		return dets;
	}

	public void setDets(List<DetEntity> dets) {
		this.dets = dets;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public String getNfeProc_NFe_infNFe_ide_cUF() {
		return nfeProc_NFe_infNFe_ide_cUF;
	}

	public void setNfeProc_NFe_infNFe_ide_cUF(String nfeProc_NFe_infNFe_ide_cUF) {
		this.nfeProc_NFe_infNFe_ide_cUF = nfeProc_NFe_infNFe_ide_cUF;
	}

	public String getNfeProc_NFe_infNFe_ide_cNF() {
		return nfeProc_NFe_infNFe_ide_cNF;
	}

	public void setNfeProc_NFe_infNFe_ide_cNF(String nfeProc_NFe_infNFe_ide_cNF) {
		this.nfeProc_NFe_infNFe_ide_cNF = nfeProc_NFe_infNFe_ide_cNF;
	}

	public String getNfeProc_NFe_infNFe_ide_natOp() {
		return nfeProc_NFe_infNFe_ide_natOp;
	}

	public void setNfeProc_NFe_infNFe_ide_natOp(String nfeProc_NFe_infNFe_ide_natOp) {
		this.nfeProc_NFe_infNFe_ide_natOp = nfeProc_NFe_infNFe_ide_natOp;
	}

	public String getNfeProc_NFe_infNFe_ide_indPag() {
		return nfeProc_NFe_infNFe_ide_indPag;
	}

	public void setNfeProc_NFe_infNFe_ide_indPag(String nfeProc_NFe_infNFe_ide_indPag) {
		this.nfeProc_NFe_infNFe_ide_indPag = nfeProc_NFe_infNFe_ide_indPag;
	}

	public String getNfeProc_NFe_infNFe_ide_mod() {
		return nfeProc_NFe_infNFe_ide_mod;
	}

	public void setNfeProc_NFe_infNFe_ide_mod(String nfeProc_NFe_infNFe_ide_mod) {
		this.nfeProc_NFe_infNFe_ide_mod = nfeProc_NFe_infNFe_ide_mod;
	}

	public String getNfeProc_NFe_infNFe_ide_serie() {
		return nfeProc_NFe_infNFe_ide_serie;
	}

	public void setNfeProc_NFe_infNFe_ide_serie(String nfeProc_NFe_infNFe_ide_serie) {
		this.nfeProc_NFe_infNFe_ide_serie = nfeProc_NFe_infNFe_ide_serie;
	}

	public String getNfeProc_NFe_infNFe_ide_nNF() {
		return nfeProc_NFe_infNFe_ide_nNF;
	}

	public void setNfeProc_NFe_infNFe_ide_nNF(String nfeProc_NFe_infNFe_ide_nNF) {
		this.nfeProc_NFe_infNFe_ide_nNF = nfeProc_NFe_infNFe_ide_nNF;
	}

	public String getNfeProc_NFe_infNFe_ide_dEmi() {
		return nfeProc_NFe_infNFe_ide_dEmi;
	}

	public void setNfeProc_NFe_infNFe_ide_dEmi(String nfeProc_NFe_infNFe_ide_dEmi) {
		this.nfeProc_NFe_infNFe_ide_dEmi = nfeProc_NFe_infNFe_ide_dEmi;
	}

	public String getNfeProc_NFe_infNFe_ide_dSaiEnt() {
		return nfeProc_NFe_infNFe_ide_dSaiEnt;
	}

	public void setNfeProc_NFe_infNFe_ide_dSaiEnt(String nfeProc_NFe_infNFe_ide_dSaiEnt) {
		this.nfeProc_NFe_infNFe_ide_dSaiEnt = nfeProc_NFe_infNFe_ide_dSaiEnt;
	}

	public String getNfeProc_NFe_infNFe_ide_hSaiEnt() {
		return nfeProc_NFe_infNFe_ide_hSaiEnt;
	}

	public void setNfeProc_NFe_infNFe_ide_hSaiEnt(String nfeProc_NFe_infNFe_ide_hSaiEnt) {
		this.nfeProc_NFe_infNFe_ide_hSaiEnt = nfeProc_NFe_infNFe_ide_hSaiEnt;
	}

	public String getNfeProc_NFe_infNFe_ide_tpNF() {
		return nfeProc_NFe_infNFe_ide_tpNF;
	}

	public void setNfeProc_NFe_infNFe_ide_tpNF(String nfeProc_NFe_infNFe_ide_tpNF) {
		this.nfeProc_NFe_infNFe_ide_tpNF = nfeProc_NFe_infNFe_ide_tpNF;
	}

	public String getNfeProc_NFe_infNFe_ide_cMunFG() {
		return nfeProc_NFe_infNFe_ide_cMunFG;
	}

	public void setNfeProc_NFe_infNFe_ide_cMunFG(String nfeProc_NFe_infNFe_ide_cMunFG) {
		this.nfeProc_NFe_infNFe_ide_cMunFG = nfeProc_NFe_infNFe_ide_cMunFG;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref() {
		return nfeProc_NFe_infNFe_ide_NFref;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref(String nfeProc_NFe_infNFe_ide_NFref) {
		this.nfeProc_NFe_infNFe_ide_NFref = nfeProc_NFe_infNFe_ide_NFref;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNFe() {
		return nfeProc_NFe_infNFe_ide_NFref_refNFe;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNFe(String nfeProc_NFe_infNFe_ide_NFref_refNFe) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNFe = nfeProc_NFe_infNFe_ide_NFref_refNFe;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNF_cUF() {
		return nfeProc_NFe_infNFe_ide_NFref_refNF_cUF;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNF_cUF(String nfeProc_NFe_infNFe_ide_NFref_refNF_cUF) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNF_cUF = nfeProc_NFe_infNFe_ide_NFref_refNF_cUF;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNF_AAMM() {
		return nfeProc_NFe_infNFe_ide_NFref_refNF_AAMM;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNF_AAMM(String nfeProc_NFe_infNFe_ide_NFref_refNF_AAMM) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNF_AAMM = nfeProc_NFe_infNFe_ide_NFref_refNF_AAMM;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNF_CNPJ() {
		return nfeProc_NFe_infNFe_ide_NFref_refNF_CNPJ;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNF_CNPJ(String nfeProc_NFe_infNFe_ide_NFref_refNF_CNPJ) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNF_CNPJ = nfeProc_NFe_infNFe_ide_NFref_refNF_CNPJ;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNF_mod() {
		return nfeProc_NFe_infNFe_ide_NFref_refNF_mod;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNF_mod(String nfeProc_NFe_infNFe_ide_NFref_refNF_mod) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNF_mod = nfeProc_NFe_infNFe_ide_NFref_refNF_mod;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNF_serie() {
		return nfeProc_NFe_infNFe_ide_NFref_refNF_serie;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNF_serie(String nfeProc_NFe_infNFe_ide_NFref_refNF_serie) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNF_serie = nfeProc_NFe_infNFe_ide_NFref_refNF_serie;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNF_nNF() {
		return nfeProc_NFe_infNFe_ide_NFref_refNF_nNF;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNF_nNF(String nfeProc_NFe_infNFe_ide_NFref_refNF_nNF) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNF_nNF = nfeProc_NFe_infNFe_ide_NFref_refNF_nNF;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNFP_cUF() {
		return nfeProc_NFe_infNFe_ide_NFref_refNFP_cUF;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNFP_cUF(String nfeProc_NFe_infNFe_ide_NFref_refNFP_cUF) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNFP_cUF = nfeProc_NFe_infNFe_ide_NFref_refNFP_cUF;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNFP_AAMM() {
		return nfeProc_NFe_infNFe_ide_NFref_refNFP_AAMM;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNFP_AAMM(String nfeProc_NFe_infNFe_ide_NFref_refNFP_AAMM) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNFP_AAMM = nfeProc_NFe_infNFe_ide_NFref_refNFP_AAMM;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNFP_CNPJ() {
		return nfeProc_NFe_infNFe_ide_NFref_refNFP_CNPJ;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNFP_CNPJ(String nfeProc_NFe_infNFe_ide_NFref_refNFP_CNPJ) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNFP_CNPJ = nfeProc_NFe_infNFe_ide_NFref_refNFP_CNPJ;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNFP_CPF() {
		return nfeProc_NFe_infNFe_ide_NFref_refNFP_CPF;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNFP_CPF(String nfeProc_NFe_infNFe_ide_NFref_refNFP_CPF) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNFP_CPF = nfeProc_NFe_infNFe_ide_NFref_refNFP_CPF;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNFP_IE() {
		return nfeProc_NFe_infNFe_ide_NFref_refNFP_IE;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNFP_IE(String nfeProc_NFe_infNFe_ide_NFref_refNFP_IE) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNFP_IE = nfeProc_NFe_infNFe_ide_NFref_refNFP_IE;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNFP_mod() {
		return nfeProc_NFe_infNFe_ide_NFref_refNFP_mod;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNFP_mod(String nfeProc_NFe_infNFe_ide_NFref_refNFP_mod) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNFP_mod = nfeProc_NFe_infNFe_ide_NFref_refNFP_mod;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNFP_serie() {
		return nfeProc_NFe_infNFe_ide_NFref_refNFP_serie;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNFP_serie(String nfeProc_NFe_infNFe_ide_NFref_refNFP_serie) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNFP_serie = nfeProc_NFe_infNFe_ide_NFref_refNFP_serie;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refNFP_nNF() {
		return nfeProc_NFe_infNFe_ide_NFref_refNFP_nNF;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refNFP_nNF(String nfeProc_NFe_infNFe_ide_NFref_refNFP_nNF) {
		this.nfeProc_NFe_infNFe_ide_NFref_refNFP_nNF = nfeProc_NFe_infNFe_ide_NFref_refNFP_nNF;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refCTe() {
		return nfeProc_NFe_infNFe_ide_NFref_refCTe;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refCTe(String nfeProc_NFe_infNFe_ide_NFref_refCTe) {
		this.nfeProc_NFe_infNFe_ide_NFref_refCTe = nfeProc_NFe_infNFe_ide_NFref_refCTe;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refECF_mod() {
		return nfeProc_NFe_infNFe_ide_NFref_refECF_mod;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refECF_mod(String nfeProc_NFe_infNFe_ide_NFref_refECF_mod) {
		this.nfeProc_NFe_infNFe_ide_NFref_refECF_mod = nfeProc_NFe_infNFe_ide_NFref_refECF_mod;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refECF_nECF() {
		return nfeProc_NFe_infNFe_ide_NFref_refECF_nECF;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refECF_nECF(String nfeProc_NFe_infNFe_ide_NFref_refECF_nECF) {
		this.nfeProc_NFe_infNFe_ide_NFref_refECF_nECF = nfeProc_NFe_infNFe_ide_NFref_refECF_nECF;
	}

	public String getNfeProc_NFe_infNFe_ide_NFref_refECF_nCOO() {
		return nfeProc_NFe_infNFe_ide_NFref_refECF_nCOO;
	}

	public void setNfeProc_NFe_infNFe_ide_NFref_refECF_nCOO(String nfeProc_NFe_infNFe_ide_NFref_refECF_nCOO) {
		this.nfeProc_NFe_infNFe_ide_NFref_refECF_nCOO = nfeProc_NFe_infNFe_ide_NFref_refECF_nCOO;
	}

	public String getNfeProc_NFe_infNFe_ide_tpImp() {
		return nfeProc_NFe_infNFe_ide_tpImp;
	}

	public void setNfeProc_NFe_infNFe_ide_tpImp(String nfeProc_NFe_infNFe_ide_tpImp) {
		this.nfeProc_NFe_infNFe_ide_tpImp = nfeProc_NFe_infNFe_ide_tpImp;
	}

	public String getNfeProc_NFe_infNFe_ide_tpEmis() {
		return nfeProc_NFe_infNFe_ide_tpEmis;
	}

	public void setNfeProc_NFe_infNFe_ide_tpEmis(String nfeProc_NFe_infNFe_ide_tpEmis) {
		this.nfeProc_NFe_infNFe_ide_tpEmis = nfeProc_NFe_infNFe_ide_tpEmis;
	}

	public String getNfeProc_NFe_infNFe_ide_cDV() {
		return nfeProc_NFe_infNFe_ide_cDV;
	}

	public void setNfeProc_NFe_infNFe_ide_cDV(String nfeProc_NFe_infNFe_ide_cDV) {
		this.nfeProc_NFe_infNFe_ide_cDV = nfeProc_NFe_infNFe_ide_cDV;
	}

	public String getNfeProc_NFe_infNFe_ide_tpAmb() {
		return nfeProc_NFe_infNFe_ide_tpAmb;
	}

	public void setNfeProc_NFe_infNFe_ide_tpAmb(String nfeProc_NFe_infNFe_ide_tpAmb) {
		this.nfeProc_NFe_infNFe_ide_tpAmb = nfeProc_NFe_infNFe_ide_tpAmb;
	}

	public String getNfeProc_NFe_infNFe_ide_finNFe() {
		return nfeProc_NFe_infNFe_ide_finNFe;
	}

	public void setNfeProc_NFe_infNFe_ide_finNFe(String nfeProc_NFe_infNFe_ide_finNFe) {
		this.nfeProc_NFe_infNFe_ide_finNFe = nfeProc_NFe_infNFe_ide_finNFe;
	}

	public String getNfeProc_NFe_infNFe_ide_procEmi() {
		return nfeProc_NFe_infNFe_ide_procEmi;
	}

	public void setNfeProc_NFe_infNFe_ide_procEmi(String nfeProc_NFe_infNFe_ide_procEmi) {
		this.nfeProc_NFe_infNFe_ide_procEmi = nfeProc_NFe_infNFe_ide_procEmi;
	}

	public String getNfeProc_NFe_infNFe_ide_verProc() {
		return nfeProc_NFe_infNFe_ide_verProc;
	}

	public void setNfeProc_NFe_infNFe_ide_verProc(String nfeProc_NFe_infNFe_ide_verProc) {
		this.nfeProc_NFe_infNFe_ide_verProc = nfeProc_NFe_infNFe_ide_verProc;
	}

	public String getNfeProc_NFe_infNFe_ide_dhCont() {
		return nfeProc_NFe_infNFe_ide_dhCont;
	}

	public void setNfeProc_NFe_infNFe_ide_dhCont(String nfeProc_NFe_infNFe_ide_dhCont) {
		this.nfeProc_NFe_infNFe_ide_dhCont = nfeProc_NFe_infNFe_ide_dhCont;
	}

	public String getNfeProc_NFe_infNFe_ide_xJust() {
		return nfeProc_NFe_infNFe_ide_xJust;
	}

	public void setNfeProc_NFe_infNFe_ide_xJust(String nfeProc_NFe_infNFe_ide_xJust) {
		this.nfeProc_NFe_infNFe_ide_xJust = nfeProc_NFe_infNFe_ide_xJust;
	}

	public String getNfeProc_NFe_infNFe_emit_CNPJ() {
		return nfeProc_NFe_infNFe_emit_CNPJ;
	}

	public void setNfeProc_NFe_infNFe_emit_CNPJ(String nfeProc_NFe_infNFe_emit_CNPJ) {
		this.nfeProc_NFe_infNFe_emit_CNPJ = nfeProc_NFe_infNFe_emit_CNPJ;
	}

	public String getNfeProc_NFe_infNFe_emit_CPF() {
		return nfeProc_NFe_infNFe_emit_CPF;
	}

	public void setNfeProc_NFe_infNFe_emit_CPF(String nfeProc_NFe_infNFe_emit_CPF) {
		this.nfeProc_NFe_infNFe_emit_CPF = nfeProc_NFe_infNFe_emit_CPF;
	}

	public String getNfeProc_NFe_infNFe_emit_xNome() {
		return nfeProc_NFe_infNFe_emit_xNome;
	}

	public void setNfeProc_NFe_infNFe_emit_xNome(String nfeProc_NFe_infNFe_emit_xNome) {
		this.nfeProc_NFe_infNFe_emit_xNome = nfeProc_NFe_infNFe_emit_xNome;
	}

	public String getNfeProc_NFe_infNFe_emit_xFant() {
		return nfeProc_NFe_infNFe_emit_xFant;
	}

	public void setNfeProc_NFe_infNFe_emit_xFant(String nfeProc_NFe_infNFe_emit_xFant) {
		this.nfeProc_NFe_infNFe_emit_xFant = nfeProc_NFe_infNFe_emit_xFant;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_xLgr() {
		return nfeProc_NFe_infNFe_emit_enderEmit_xLgr;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_xLgr(String nfeProc_NFe_infNFe_emit_enderEmit_xLgr) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_xLgr = nfeProc_NFe_infNFe_emit_enderEmit_xLgr;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_nro() {
		return nfeProc_NFe_infNFe_emit_enderEmit_nro;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_nro(String nfeProc_NFe_infNFe_emit_enderEmit_nro) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_nro = nfeProc_NFe_infNFe_emit_enderEmit_nro;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_xCpl() {
		return nfeProc_NFe_infNFe_emit_enderEmit_xCpl;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_xCpl(String nfeProc_NFe_infNFe_emit_enderEmit_xCpl) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_xCpl = nfeProc_NFe_infNFe_emit_enderEmit_xCpl;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_xBairro() {
		return nfeProc_NFe_infNFe_emit_enderEmit_xBairro;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_xBairro(String nfeProc_NFe_infNFe_emit_enderEmit_xBairro) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_xBairro = nfeProc_NFe_infNFe_emit_enderEmit_xBairro;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_cMun() {
		return nfeProc_NFe_infNFe_emit_enderEmit_cMun;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_cMun(String nfeProc_NFe_infNFe_emit_enderEmit_cMun) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_cMun = nfeProc_NFe_infNFe_emit_enderEmit_cMun;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_xMun() {
		return nfeProc_NFe_infNFe_emit_enderEmit_xMun;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_xMun(String nfeProc_NFe_infNFe_emit_enderEmit_xMun) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_xMun = nfeProc_NFe_infNFe_emit_enderEmit_xMun;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_UF() {
		return nfeProc_NFe_infNFe_emit_enderEmit_UF;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_UF(String nfeProc_NFe_infNFe_emit_enderEmit_UF) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_UF = nfeProc_NFe_infNFe_emit_enderEmit_UF;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_CEP() {
		return nfeProc_NFe_infNFe_emit_enderEmit_CEP;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_CEP(String nfeProc_NFe_infNFe_emit_enderEmit_CEP) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_CEP = nfeProc_NFe_infNFe_emit_enderEmit_CEP;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_cPais() {
		return nfeProc_NFe_infNFe_emit_enderEmit_cPais;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_cPais(String nfeProc_NFe_infNFe_emit_enderEmit_cPais) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_cPais = nfeProc_NFe_infNFe_emit_enderEmit_cPais;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_xPais() {
		return nfeProc_NFe_infNFe_emit_enderEmit_xPais;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_xPais(String nfeProc_NFe_infNFe_emit_enderEmit_xPais) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_xPais = nfeProc_NFe_infNFe_emit_enderEmit_xPais;
	}

	public String getNfeProc_NFe_infNFe_emit_enderEmit_fone() {
		return nfeProc_NFe_infNFe_emit_enderEmit_fone;
	}

	public void setNfeProc_NFe_infNFe_emit_enderEmit_fone(String nfeProc_NFe_infNFe_emit_enderEmit_fone) {
		this.nfeProc_NFe_infNFe_emit_enderEmit_fone = nfeProc_NFe_infNFe_emit_enderEmit_fone;
	}

	public String getNfeProc_NFe_infNFe_emit_IE() {
		return nfeProc_NFe_infNFe_emit_IE;
	}

	public void setNfeProc_NFe_infNFe_emit_IE(String nfeProc_NFe_infNFe_emit_IE) {
		this.nfeProc_NFe_infNFe_emit_IE = nfeProc_NFe_infNFe_emit_IE;
	}

	public String getNfeProc_NFe_infNFe_emit_IEST() {
		return nfeProc_NFe_infNFe_emit_IEST;
	}

	public void setNfeProc_NFe_infNFe_emit_IEST(String nfeProc_NFe_infNFe_emit_IEST) {
		this.nfeProc_NFe_infNFe_emit_IEST = nfeProc_NFe_infNFe_emit_IEST;
	}

	public String getNfeProc_NFe_infNFe_emit_IM() {
		return nfeProc_NFe_infNFe_emit_IM;
	}

	public void setNfeProc_NFe_infNFe_emit_IM(String nfeProc_NFe_infNFe_emit_IM) {
		this.nfeProc_NFe_infNFe_emit_IM = nfeProc_NFe_infNFe_emit_IM;
	}

	public String getNfeProc_NFe_infNFe_emit_CNAE() {
		return nfeProc_NFe_infNFe_emit_CNAE;
	}

	public void setNfeProc_NFe_infNFe_emit_CNAE(String nfeProc_NFe_infNFe_emit_CNAE) {
		this.nfeProc_NFe_infNFe_emit_CNAE = nfeProc_NFe_infNFe_emit_CNAE;
	}

	public String getNfeProc_NFe_infNFe_emit_CRT() {
		return nfeProc_NFe_infNFe_emit_CRT;
	}

	public void setNfeProc_NFe_infNFe_emit_CRT(String nfeProc_NFe_infNFe_emit_CRT) {
		this.nfeProc_NFe_infNFe_emit_CRT = nfeProc_NFe_infNFe_emit_CRT;
	}

	public String getNfeProc_NFe_infNFe_avulsa_CNPJ() {
		return nfeProc_NFe_infNFe_avulsa_CNPJ;
	}

	public void setNfeProc_NFe_infNFe_avulsa_CNPJ(String nfeProc_NFe_infNFe_avulsa_CNPJ) {
		this.nfeProc_NFe_infNFe_avulsa_CNPJ = nfeProc_NFe_infNFe_avulsa_CNPJ;
	}

	public String getNfeProc_NFe_infNFe_avulsa_xOrgao() {
		return nfeProc_NFe_infNFe_avulsa_xOrgao;
	}

	public void setNfeProc_NFe_infNFe_avulsa_xOrgao(String nfeProc_NFe_infNFe_avulsa_xOrgao) {
		this.nfeProc_NFe_infNFe_avulsa_xOrgao = nfeProc_NFe_infNFe_avulsa_xOrgao;
	}

	public String getNfeProc_NFe_infNFe_avulsa_matr() {
		return nfeProc_NFe_infNFe_avulsa_matr;
	}

	public void setNfeProc_NFe_infNFe_avulsa_matr(String nfeProc_NFe_infNFe_avulsa_matr) {
		this.nfeProc_NFe_infNFe_avulsa_matr = nfeProc_NFe_infNFe_avulsa_matr;
	}

	public String getNfeProc_NFe_infNFe_avulsa_xAgente() {
		return nfeProc_NFe_infNFe_avulsa_xAgente;
	}

	public void setNfeProc_NFe_infNFe_avulsa_xAgente(String nfeProc_NFe_infNFe_avulsa_xAgente) {
		this.nfeProc_NFe_infNFe_avulsa_xAgente = nfeProc_NFe_infNFe_avulsa_xAgente;
	}

	public String getNfeProc_NFe_infNFe_avulsa_fone() {
		return nfeProc_NFe_infNFe_avulsa_fone;
	}

	public void setNfeProc_NFe_infNFe_avulsa_fone(String nfeProc_NFe_infNFe_avulsa_fone) {
		this.nfeProc_NFe_infNFe_avulsa_fone = nfeProc_NFe_infNFe_avulsa_fone;
	}

	public String getNfeProc_NFe_infNFe_avulsa_UF() {
		return nfeProc_NFe_infNFe_avulsa_UF;
	}

	public void setNfeProc_NFe_infNFe_avulsa_UF(String nfeProc_NFe_infNFe_avulsa_UF) {
		this.nfeProc_NFe_infNFe_avulsa_UF = nfeProc_NFe_infNFe_avulsa_UF;
	}

	public String getNfeProc_NFe_infNFe_avulsa_nDAR() {
		return nfeProc_NFe_infNFe_avulsa_nDAR;
	}

	public void setNfeProc_NFe_infNFe_avulsa_nDAR(String nfeProc_NFe_infNFe_avulsa_nDAR) {
		this.nfeProc_NFe_infNFe_avulsa_nDAR = nfeProc_NFe_infNFe_avulsa_nDAR;
	}

	public String getNfeProc_NFe_infNFe_avulsa_dEmi() {
		return nfeProc_NFe_infNFe_avulsa_dEmi;
	}

	public void setNfeProc_NFe_infNFe_avulsa_dEmi(String nfeProc_NFe_infNFe_avulsa_dEmi) {
		this.nfeProc_NFe_infNFe_avulsa_dEmi = nfeProc_NFe_infNFe_avulsa_dEmi;
	}

	public String getNfeProc_NFe_infNFe_avulsa_vDAR() {
		return nfeProc_NFe_infNFe_avulsa_vDAR;
	}

	public void setNfeProc_NFe_infNFe_avulsa_vDAR(String nfeProc_NFe_infNFe_avulsa_vDAR) {
		this.nfeProc_NFe_infNFe_avulsa_vDAR = nfeProc_NFe_infNFe_avulsa_vDAR;
	}

	public String getNfeProc_NFe_infNFe_avulsa_repEmi() {
		return nfeProc_NFe_infNFe_avulsa_repEmi;
	}

	public void setNfeProc_NFe_infNFe_avulsa_repEmi(String nfeProc_NFe_infNFe_avulsa_repEmi) {
		this.nfeProc_NFe_infNFe_avulsa_repEmi = nfeProc_NFe_infNFe_avulsa_repEmi;
	}

	public String getNfeProc_NFe_infNFe_avulsa_dPag() {
		return nfeProc_NFe_infNFe_avulsa_dPag;
	}

	public void setNfeProc_NFe_infNFe_avulsa_dPag(String nfeProc_NFe_infNFe_avulsa_dPag) {
		this.nfeProc_NFe_infNFe_avulsa_dPag = nfeProc_NFe_infNFe_avulsa_dPag;
	}

	public String getNfeProc_NFe_infNFe_dest_CNPJ() {
		return nfeProc_NFe_infNFe_dest_CNPJ;
	}

	public void setNfeProc_NFe_infNFe_dest_CNPJ(String nfeProc_NFe_infNFe_dest_CNPJ) {
		this.nfeProc_NFe_infNFe_dest_CNPJ = nfeProc_NFe_infNFe_dest_CNPJ;
	}

	public String getNfeProc_NFe_infNFe_dest_CPF() {
		return nfeProc_NFe_infNFe_dest_CPF;
	}

	public void setNfeProc_NFe_infNFe_dest_CPF(String nfeProc_NFe_infNFe_dest_CPF) {
		this.nfeProc_NFe_infNFe_dest_CPF = nfeProc_NFe_infNFe_dest_CPF;
	}

	public String getNfeProc_NFe_infNFe_dest_xNome() {
		return nfeProc_NFe_infNFe_dest_xNome;
	}

	public void setNfeProc_NFe_infNFe_dest_xNome(String nfeProc_NFe_infNFe_dest_xNome) {
		this.nfeProc_NFe_infNFe_dest_xNome = nfeProc_NFe_infNFe_dest_xNome;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_xLgr() {
		return nfeProc_NFe_infNFe_dest_enderDest_xLgr;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_xLgr(String nfeProc_NFe_infNFe_dest_enderDest_xLgr) {
		this.nfeProc_NFe_infNFe_dest_enderDest_xLgr = nfeProc_NFe_infNFe_dest_enderDest_xLgr;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_nro() {
		return nfeProc_NFe_infNFe_dest_enderDest_nro;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_nro(String nfeProc_NFe_infNFe_dest_enderDest_nro) {
		this.nfeProc_NFe_infNFe_dest_enderDest_nro = nfeProc_NFe_infNFe_dest_enderDest_nro;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_xCpl() {
		return nfeProc_NFe_infNFe_dest_enderDest_xCpl;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_xCpl(String nfeProc_NFe_infNFe_dest_enderDest_xCpl) {
		this.nfeProc_NFe_infNFe_dest_enderDest_xCpl = nfeProc_NFe_infNFe_dest_enderDest_xCpl;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_xBairro() {
		return nfeProc_NFe_infNFe_dest_enderDest_xBairro;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_xBairro(String nfeProc_NFe_infNFe_dest_enderDest_xBairro) {
		this.nfeProc_NFe_infNFe_dest_enderDest_xBairro = nfeProc_NFe_infNFe_dest_enderDest_xBairro;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_cMun() {
		return nfeProc_NFe_infNFe_dest_enderDest_cMun;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_cMun(String nfeProc_NFe_infNFe_dest_enderDest_cMun) {
		this.nfeProc_NFe_infNFe_dest_enderDest_cMun = nfeProc_NFe_infNFe_dest_enderDest_cMun;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_xMun() {
		return nfeProc_NFe_infNFe_dest_enderDest_xMun;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_xMun(String nfeProc_NFe_infNFe_dest_enderDest_xMun) {
		this.nfeProc_NFe_infNFe_dest_enderDest_xMun = nfeProc_NFe_infNFe_dest_enderDest_xMun;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_UF() {
		return nfeProc_NFe_infNFe_dest_enderDest_UF;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_UF(String nfeProc_NFe_infNFe_dest_enderDest_UF) {
		this.nfeProc_NFe_infNFe_dest_enderDest_UF = nfeProc_NFe_infNFe_dest_enderDest_UF;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_CEP() {
		return nfeProc_NFe_infNFe_dest_enderDest_CEP;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_CEP(String nfeProc_NFe_infNFe_dest_enderDest_CEP) {
		this.nfeProc_NFe_infNFe_dest_enderDest_CEP = nfeProc_NFe_infNFe_dest_enderDest_CEP;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_cPais() {
		return nfeProc_NFe_infNFe_dest_enderDest_cPais;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_cPais(String nfeProc_NFe_infNFe_dest_enderDest_cPais) {
		this.nfeProc_NFe_infNFe_dest_enderDest_cPais = nfeProc_NFe_infNFe_dest_enderDest_cPais;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_xPais() {
		return nfeProc_NFe_infNFe_dest_enderDest_xPais;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_xPais(String nfeProc_NFe_infNFe_dest_enderDest_xPais) {
		this.nfeProc_NFe_infNFe_dest_enderDest_xPais = nfeProc_NFe_infNFe_dest_enderDest_xPais;
	}

	public String getNfeProc_NFe_infNFe_dest_enderDest_fone() {
		return nfeProc_NFe_infNFe_dest_enderDest_fone;
	}

	public void setNfeProc_NFe_infNFe_dest_enderDest_fone(String nfeProc_NFe_infNFe_dest_enderDest_fone) {
		this.nfeProc_NFe_infNFe_dest_enderDest_fone = nfeProc_NFe_infNFe_dest_enderDest_fone;
	}

	public String getNfeProc_NFe_infNFe_dest_IE() {
		return nfeProc_NFe_infNFe_dest_IE;
	}

	public void setNfeProc_NFe_infNFe_dest_IE(String nfeProc_NFe_infNFe_dest_IE) {
		this.nfeProc_NFe_infNFe_dest_IE = nfeProc_NFe_infNFe_dest_IE;
	}

	public String getNfeProc_NFe_infNFe_dest_ISUF() {
		return nfeProc_NFe_infNFe_dest_ISUF;
	}

	public void setNfeProc_NFe_infNFe_dest_ISUF(String nfeProc_NFe_infNFe_dest_ISUF) {
		this.nfeProc_NFe_infNFe_dest_ISUF = nfeProc_NFe_infNFe_dest_ISUF;
	}

	public String getNfeProc_NFe_infNFe_dest_email() {
		return nfeProc_NFe_infNFe_dest_email;
	}

	public void setNfeProc_NFe_infNFe_dest_email(String nfeProc_NFe_infNFe_dest_email) {
		this.nfeProc_NFe_infNFe_dest_email = nfeProc_NFe_infNFe_dest_email;
	}

	public String getNfeProc_NFe_infNFe_retirada_CNPJ() {
		return nfeProc_NFe_infNFe_retirada_CNPJ;
	}

	public void setNfeProc_NFe_infNFe_retirada_CNPJ(String nfeProc_NFe_infNFe_retirada_CNPJ) {
		this.nfeProc_NFe_infNFe_retirada_CNPJ = nfeProc_NFe_infNFe_retirada_CNPJ;
	}

	public String getNfeProc_NFe_infNFe_retirada_CPF() {
		return nfeProc_NFe_infNFe_retirada_CPF;
	}

	public void setNfeProc_NFe_infNFe_retirada_CPF(String nfeProc_NFe_infNFe_retirada_CPF) {
		this.nfeProc_NFe_infNFe_retirada_CPF = nfeProc_NFe_infNFe_retirada_CPF;
	}

	public String getNfeProc_NFe_infNFe_retirada_xLgr() {
		return nfeProc_NFe_infNFe_retirada_xLgr;
	}

	public void setNfeProc_NFe_infNFe_retirada_xLgr(String nfeProc_NFe_infNFe_retirada_xLgr) {
		this.nfeProc_NFe_infNFe_retirada_xLgr = nfeProc_NFe_infNFe_retirada_xLgr;
	}

	public String getNfeProc_NFe_infNFe_retirada_nro() {
		return nfeProc_NFe_infNFe_retirada_nro;
	}

	public void setNfeProc_NFe_infNFe_retirada_nro(String nfeProc_NFe_infNFe_retirada_nro) {
		this.nfeProc_NFe_infNFe_retirada_nro = nfeProc_NFe_infNFe_retirada_nro;
	}

	public String getNfeProc_NFe_infNFe_retirada_xCpl() {
		return nfeProc_NFe_infNFe_retirada_xCpl;
	}

	public void setNfeProc_NFe_infNFe_retirada_xCpl(String nfeProc_NFe_infNFe_retirada_xCpl) {
		this.nfeProc_NFe_infNFe_retirada_xCpl = nfeProc_NFe_infNFe_retirada_xCpl;
	}

	public String getNfeProc_NFe_infNFe_retirada_xBairro() {
		return nfeProc_NFe_infNFe_retirada_xBairro;
	}

	public void setNfeProc_NFe_infNFe_retirada_xBairro(String nfeProc_NFe_infNFe_retirada_xBairro) {
		this.nfeProc_NFe_infNFe_retirada_xBairro = nfeProc_NFe_infNFe_retirada_xBairro;
	}

	public String getNfeProc_NFe_infNFe_retirada_cMun() {
		return nfeProc_NFe_infNFe_retirada_cMun;
	}

	public void setNfeProc_NFe_infNFe_retirada_cMun(String nfeProc_NFe_infNFe_retirada_cMun) {
		this.nfeProc_NFe_infNFe_retirada_cMun = nfeProc_NFe_infNFe_retirada_cMun;
	}

	public String getNfeProc_NFe_infNFe_retirada_xMun() {
		return nfeProc_NFe_infNFe_retirada_xMun;
	}

	public void setNfeProc_NFe_infNFe_retirada_xMun(String nfeProc_NFe_infNFe_retirada_xMun) {
		this.nfeProc_NFe_infNFe_retirada_xMun = nfeProc_NFe_infNFe_retirada_xMun;
	}

	public String getNfeProc_NFe_infNFe_retirada_UF() {
		return nfeProc_NFe_infNFe_retirada_UF;
	}

	public void setNfeProc_NFe_infNFe_retirada_UF(String nfeProc_NFe_infNFe_retirada_UF) {
		this.nfeProc_NFe_infNFe_retirada_UF = nfeProc_NFe_infNFe_retirada_UF;
	}

	public String getNfeProc_NFe_infNFe_entrega_CNPJ() {
		return nfeProc_NFe_infNFe_entrega_CNPJ;
	}

	public void setNfeProc_NFe_infNFe_entrega_CNPJ(String nfeProc_NFe_infNFe_entrega_CNPJ) {
		this.nfeProc_NFe_infNFe_entrega_CNPJ = nfeProc_NFe_infNFe_entrega_CNPJ;
	}

	public String getNfeProc_NFe_infNFe_entrega_CPF() {
		return nfeProc_NFe_infNFe_entrega_CPF;
	}

	public void setNfeProc_NFe_infNFe_entrega_CPF(String nfeProc_NFe_infNFe_entrega_CPF) {
		this.nfeProc_NFe_infNFe_entrega_CPF = nfeProc_NFe_infNFe_entrega_CPF;
	}

	public String getNfeProc_NFe_infNFe_entrega_xLgr() {
		return nfeProc_NFe_infNFe_entrega_xLgr;
	}

	public void setNfeProc_NFe_infNFe_entrega_xLgr(String nfeProc_NFe_infNFe_entrega_xLgr) {
		this.nfeProc_NFe_infNFe_entrega_xLgr = nfeProc_NFe_infNFe_entrega_xLgr;
	}

	public String getNfeProc_NFe_infNFe_entrega_nro() {
		return nfeProc_NFe_infNFe_entrega_nro;
	}

	public void setNfeProc_NFe_infNFe_entrega_nro(String nfeProc_NFe_infNFe_entrega_nro) {
		this.nfeProc_NFe_infNFe_entrega_nro = nfeProc_NFe_infNFe_entrega_nro;
	}

	public String getNfeProc_NFe_infNFe_entrega_xCpl() {
		return nfeProc_NFe_infNFe_entrega_xCpl;
	}

	public void setNfeProc_NFe_infNFe_entrega_xCpl(String nfeProc_NFe_infNFe_entrega_xCpl) {
		this.nfeProc_NFe_infNFe_entrega_xCpl = nfeProc_NFe_infNFe_entrega_xCpl;
	}

	public String getNfeProc_NFe_infNFe_entrega_xBairro() {
		return nfeProc_NFe_infNFe_entrega_xBairro;
	}

	public void setNfeProc_NFe_infNFe_entrega_xBairro(String nfeProc_NFe_infNFe_entrega_xBairro) {
		this.nfeProc_NFe_infNFe_entrega_xBairro = nfeProc_NFe_infNFe_entrega_xBairro;
	}

	public String getNfeProc_NFe_infNFe_entrega_cMun() {
		return nfeProc_NFe_infNFe_entrega_cMun;
	}

	public void setNfeProc_NFe_infNFe_entrega_cMun(String nfeProc_NFe_infNFe_entrega_cMun) {
		this.nfeProc_NFe_infNFe_entrega_cMun = nfeProc_NFe_infNFe_entrega_cMun;
	}

	public String getNfeProc_NFe_infNFe_entrega_xMun() {
		return nfeProc_NFe_infNFe_entrega_xMun;
	}

	public void setNfeProc_NFe_infNFe_entrega_xMun(String nfeProc_NFe_infNFe_entrega_xMun) {
		this.nfeProc_NFe_infNFe_entrega_xMun = nfeProc_NFe_infNFe_entrega_xMun;
	}

	public String getNfeProc_NFe_infNFe_entrega_UF() {
		return nfeProc_NFe_infNFe_entrega_UF;
	}

	public void setNfeProc_NFe_infNFe_entrega_UF(String nfeProc_NFe_infNFe_entrega_UF) {
		this.nfeProc_NFe_infNFe_entrega_UF = nfeProc_NFe_infNFe_entrega_UF;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot() {
		return nfeProc_NFe_infNFe_total_ICMSTot;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot(String nfeProc_NFe_infNFe_total_ICMSTot) {
		this.nfeProc_NFe_infNFe_total_ICMSTot = nfeProc_NFe_infNFe_total_ICMSTot;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vBC() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vBC;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vBC(String nfeProc_NFe_infNFe_total_ICMSTot_vBC) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vBC = nfeProc_NFe_infNFe_total_ICMSTot_vBC;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vICMS() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vICMS;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vICMS(String nfeProc_NFe_infNFe_total_ICMSTot_vICMS) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vICMS = nfeProc_NFe_infNFe_total_ICMSTot_vICMS;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vBCST() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vBCST;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vBCST(String nfeProc_NFe_infNFe_total_ICMSTot_vBCST) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vBCST = nfeProc_NFe_infNFe_total_ICMSTot_vBCST;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vST() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vST;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vST(String nfeProc_NFe_infNFe_total_ICMSTot_vST) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vST = nfeProc_NFe_infNFe_total_ICMSTot_vST;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vProd() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vProd;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vProd(String nfeProc_NFe_infNFe_total_ICMSTot_vProd) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vProd = nfeProc_NFe_infNFe_total_ICMSTot_vProd;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vFrete() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vFrete;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vFrete(String nfeProc_NFe_infNFe_total_ICMSTot_vFrete) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vFrete = nfeProc_NFe_infNFe_total_ICMSTot_vFrete;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vSeg() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vSeg;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vSeg(String nfeProc_NFe_infNFe_total_ICMSTot_vSeg) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vSeg = nfeProc_NFe_infNFe_total_ICMSTot_vSeg;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vDesc() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vDesc;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vDesc(String nfeProc_NFe_infNFe_total_ICMSTot_vDesc) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vDesc = nfeProc_NFe_infNFe_total_ICMSTot_vDesc;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vII() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vII;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vII(String nfeProc_NFe_infNFe_total_ICMSTot_vII) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vII = nfeProc_NFe_infNFe_total_ICMSTot_vII;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vIPI() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vIPI;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vIPI(String nfeProc_NFe_infNFe_total_ICMSTot_vIPI) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vIPI = nfeProc_NFe_infNFe_total_ICMSTot_vIPI;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vPIS() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vPIS;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vPIS(String nfeProc_NFe_infNFe_total_ICMSTot_vPIS) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vPIS = nfeProc_NFe_infNFe_total_ICMSTot_vPIS;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vCOFINS() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vCOFINS(String nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS = nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vOutro() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vOutro;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vOutro(String nfeProc_NFe_infNFe_total_ICMSTot_vOutro) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vOutro = nfeProc_NFe_infNFe_total_ICMSTot_vOutro;
	}

	public String getNfeProc_NFe_infNFe_total_ICMSTot_vNF() {
		return nfeProc_NFe_infNFe_total_ICMSTot_vNF;
	}

	public void setNfeProc_NFe_infNFe_total_ICMSTot_vNF(String nfeProc_NFe_infNFe_total_ICMSTot_vNF) {
		this.nfeProc_NFe_infNFe_total_ICMSTot_vNF = nfeProc_NFe_infNFe_total_ICMSTot_vNF;
	}

	public String getNfeProc_NFe_infNFe_total_ISSQNtot_vServ() {
		return nfeProc_NFe_infNFe_total_ISSQNtot_vServ;
	}

	public void setNfeProc_NFe_infNFe_total_ISSQNtot_vServ(String nfeProc_NFe_infNFe_total_ISSQNtot_vServ) {
		this.nfeProc_NFe_infNFe_total_ISSQNtot_vServ = nfeProc_NFe_infNFe_total_ISSQNtot_vServ;
	}

	public String getNfeProc_NFe_infNFe_total_ISSQNtot_vBC() {
		return nfeProc_NFe_infNFe_total_ISSQNtot_vBC;
	}

	public void setNfeProc_NFe_infNFe_total_ISSQNtot_vBC(String nfeProc_NFe_infNFe_total_ISSQNtot_vBC) {
		this.nfeProc_NFe_infNFe_total_ISSQNtot_vBC = nfeProc_NFe_infNFe_total_ISSQNtot_vBC;
	}

	public String getNfeProc_NFe_infNFe_total_ISSQNtot_vISS() {
		return nfeProc_NFe_infNFe_total_ISSQNtot_vISS;
	}

	public void setNfeProc_NFe_infNFe_total_ISSQNtot_vISS(String nfeProc_NFe_infNFe_total_ISSQNtot_vISS) {
		this.nfeProc_NFe_infNFe_total_ISSQNtot_vISS = nfeProc_NFe_infNFe_total_ISSQNtot_vISS;
	}

	public String getNfeProc_NFe_infNFe_total_ISSQNtot_vPIS() {
		return nfeProc_NFe_infNFe_total_ISSQNtot_vPIS;
	}

	public void setNfeProc_NFe_infNFe_total_ISSQNtot_vPIS(String nfeProc_NFe_infNFe_total_ISSQNtot_vPIS) {
		this.nfeProc_NFe_infNFe_total_ISSQNtot_vPIS = nfeProc_NFe_infNFe_total_ISSQNtot_vPIS;
	}

	public String getNfeProc_NFe_infNFe_total_ISSQNtot_vCOFINS() {
		return nfeProc_NFe_infNFe_total_ISSQNtot_vCOFINS;
	}

	public void setNfeProc_NFe_infNFe_total_ISSQNtot_vCOFINS(String nfeProc_NFe_infNFe_total_ISSQNtot_vCOFINS) {
		this.nfeProc_NFe_infNFe_total_ISSQNtot_vCOFINS = nfeProc_NFe_infNFe_total_ISSQNtot_vCOFINS;
	}

	public String getNfeProc_NFe_infNFe_total_retTrib_vRetPIS() {
		return nfeProc_NFe_infNFe_total_retTrib_vRetPIS;
	}

	public void setNfeProc_NFe_infNFe_total_retTrib_vRetPIS(String nfeProc_NFe_infNFe_total_retTrib_vRetPIS) {
		this.nfeProc_NFe_infNFe_total_retTrib_vRetPIS = nfeProc_NFe_infNFe_total_retTrib_vRetPIS;
	}

	public String getNfeProc_NFe_infNFe_total_retTrib_vRetCOFINS() {
		return nfeProc_NFe_infNFe_total_retTrib_vRetCOFINS;
	}

	public void setNfeProc_NFe_infNFe_total_retTrib_vRetCOFINS(String nfeProc_NFe_infNFe_total_retTrib_vRetCOFINS) {
		this.nfeProc_NFe_infNFe_total_retTrib_vRetCOFINS = nfeProc_NFe_infNFe_total_retTrib_vRetCOFINS;
	}

	public String getNfeProc_NFe_infNFe_total_retTrib_vRetCSLL() {
		return nfeProc_NFe_infNFe_total_retTrib_vRetCSLL;
	}

	public void setNfeProc_NFe_infNFe_total_retTrib_vRetCSLL(String nfeProc_NFe_infNFe_total_retTrib_vRetCSLL) {
		this.nfeProc_NFe_infNFe_total_retTrib_vRetCSLL = nfeProc_NFe_infNFe_total_retTrib_vRetCSLL;
	}

	public String getNfeProc_NFe_infNFe_total_retTrib_vBCIRRF() {
		return nfeProc_NFe_infNFe_total_retTrib_vBCIRRF;
	}

	public void setNfeProc_NFe_infNFe_total_retTrib_vBCIRRF(String nfeProc_NFe_infNFe_total_retTrib_vBCIRRF) {
		this.nfeProc_NFe_infNFe_total_retTrib_vBCIRRF = nfeProc_NFe_infNFe_total_retTrib_vBCIRRF;
	}

	public String getNfeProc_NFe_infNFe_total_retTrib_vIRRF() {
		return nfeProc_NFe_infNFe_total_retTrib_vIRRF;
	}

	public void setNfeProc_NFe_infNFe_total_retTrib_vIRRF(String nfeProc_NFe_infNFe_total_retTrib_vIRRF) {
		this.nfeProc_NFe_infNFe_total_retTrib_vIRRF = nfeProc_NFe_infNFe_total_retTrib_vIRRF;
	}

	public String getNfeProc_NFe_infNFe_total_retTrib_vBCRetPrev() {
		return nfeProc_NFe_infNFe_total_retTrib_vBCRetPrev;
	}

	public void setNfeProc_NFe_infNFe_total_retTrib_vBCRetPrev(String nfeProc_NFe_infNFe_total_retTrib_vBCRetPrev) {
		this.nfeProc_NFe_infNFe_total_retTrib_vBCRetPrev = nfeProc_NFe_infNFe_total_retTrib_vBCRetPrev;
	}

	public String getNfeProc_NFe_infNFe_total_retTrib_vRetPrev() {
		return nfeProc_NFe_infNFe_total_retTrib_vRetPrev;
	}

	public void setNfeProc_NFe_infNFe_total_retTrib_vRetPrev(String nfeProc_NFe_infNFe_total_retTrib_vRetPrev) {
		this.nfeProc_NFe_infNFe_total_retTrib_vRetPrev = nfeProc_NFe_infNFe_total_retTrib_vRetPrev;
	}

	public String getNfeProc_NFe_infNFe_transp_modFrete() {
		return nfeProc_NFe_infNFe_transp_modFrete;
	}

	public void setNfeProc_NFe_infNFe_transp_modFrete(String nfeProc_NFe_infNFe_transp_modFrete) {
		this.nfeProc_NFe_infNFe_transp_modFrete = nfeProc_NFe_infNFe_transp_modFrete;
	}

	public String getNfeProc_NFe_infNFe_transp_transporta_CNPJ() {
		return nfeProc_NFe_infNFe_transp_transporta_CNPJ;
	}

	public void setNfeProc_NFe_infNFe_transp_transporta_CNPJ(String nfeProc_NFe_infNFe_transp_transporta_CNPJ) {
		this.nfeProc_NFe_infNFe_transp_transporta_CNPJ = nfeProc_NFe_infNFe_transp_transporta_CNPJ;
	}

	public String getNfeProc_NFe_infNFe_transp_transporta_CPF() {
		return nfeProc_NFe_infNFe_transp_transporta_CPF;
	}

	public void setNfeProc_NFe_infNFe_transp_transporta_CPF(String nfeProc_NFe_infNFe_transp_transporta_CPF) {
		this.nfeProc_NFe_infNFe_transp_transporta_CPF = nfeProc_NFe_infNFe_transp_transporta_CPF;
	}

	public String getNfeProc_NFe_infNFe_transp_transporta_xNome() {
		return nfeProc_NFe_infNFe_transp_transporta_xNome;
	}

	public void setNfeProc_NFe_infNFe_transp_transporta_xNome(String nfeProc_NFe_infNFe_transp_transporta_xNome) {
		this.nfeProc_NFe_infNFe_transp_transporta_xNome = nfeProc_NFe_infNFe_transp_transporta_xNome;
	}

	public String getNfeProc_NFe_infNFe_transp_transporta_IE() {
		return nfeProc_NFe_infNFe_transp_transporta_IE;
	}

	public void setNfeProc_NFe_infNFe_transp_transporta_IE(String nfeProc_NFe_infNFe_transp_transporta_IE) {
		this.nfeProc_NFe_infNFe_transp_transporta_IE = nfeProc_NFe_infNFe_transp_transporta_IE;
	}

	public String getNfeProc_NFe_infNFe_transp_transporta_xEnder() {
		return nfeProc_NFe_infNFe_transp_transporta_xEnder;
	}

	public void setNfeProc_NFe_infNFe_transp_transporta_xEnder(String nfeProc_NFe_infNFe_transp_transporta_xEnder) {
		this.nfeProc_NFe_infNFe_transp_transporta_xEnder = nfeProc_NFe_infNFe_transp_transporta_xEnder;
	}

	public String getNfeProc_NFe_infNFe_transp_transporta_xMun() {
		return nfeProc_NFe_infNFe_transp_transporta_xMun;
	}

	public void setNfeProc_NFe_infNFe_transp_transporta_xMun(String nfeProc_NFe_infNFe_transp_transporta_xMun) {
		this.nfeProc_NFe_infNFe_transp_transporta_xMun = nfeProc_NFe_infNFe_transp_transporta_xMun;
	}

	public String getNfeProc_NFe_infNFe_transp_transporta_UF() {
		return nfeProc_NFe_infNFe_transp_transporta_UF;
	}

	public void setNfeProc_NFe_infNFe_transp_transporta_UF(String nfeProc_NFe_infNFe_transp_transporta_UF) {
		this.nfeProc_NFe_infNFe_transp_transporta_UF = nfeProc_NFe_infNFe_transp_transporta_UF;
	}

	public String getNfeProc_NFe_infNFe_transp_retTransp_vServ() {
		return nfeProc_NFe_infNFe_transp_retTransp_vServ;
	}

	public void setNfeProc_NFe_infNFe_transp_retTransp_vServ(String nfeProc_NFe_infNFe_transp_retTransp_vServ) {
		this.nfeProc_NFe_infNFe_transp_retTransp_vServ = nfeProc_NFe_infNFe_transp_retTransp_vServ;
	}

	public String getNfeProc_NFe_infNFe_transp_retTransp_vBCRet() {
		return nfeProc_NFe_infNFe_transp_retTransp_vBCRet;
	}

	public void setNfeProc_NFe_infNFe_transp_retTransp_vBCRet(String nfeProc_NFe_infNFe_transp_retTransp_vBCRet) {
		this.nfeProc_NFe_infNFe_transp_retTransp_vBCRet = nfeProc_NFe_infNFe_transp_retTransp_vBCRet;
	}

	public String getNfeProc_NFe_infNFe_transp_retTransp_pICMSRet() {
		return nfeProc_NFe_infNFe_transp_retTransp_pICMSRet;
	}

	public void setNfeProc_NFe_infNFe_transp_retTransp_pICMSRet(String nfeProc_NFe_infNFe_transp_retTransp_pICMSRet) {
		this.nfeProc_NFe_infNFe_transp_retTransp_pICMSRet = nfeProc_NFe_infNFe_transp_retTransp_pICMSRet;
	}

	public String getNfeProc_NFe_infNFe_transp_retTransp_vICMSRet() {
		return nfeProc_NFe_infNFe_transp_retTransp_vICMSRet;
	}

	public void setNfeProc_NFe_infNFe_transp_retTransp_vICMSRet(String nfeProc_NFe_infNFe_transp_retTransp_vICMSRet) {
		this.nfeProc_NFe_infNFe_transp_retTransp_vICMSRet = nfeProc_NFe_infNFe_transp_retTransp_vICMSRet;
	}

	public String getNfeProc_NFe_infNFe_transp_retTransp_CFOP() {
		return nfeProc_NFe_infNFe_transp_retTransp_CFOP;
	}

	public void setNfeProc_NFe_infNFe_transp_retTransp_CFOP(String nfeProc_NFe_infNFe_transp_retTransp_CFOP) {
		this.nfeProc_NFe_infNFe_transp_retTransp_CFOP = nfeProc_NFe_infNFe_transp_retTransp_CFOP;
	}

	public String getNfeProc_NFe_infNFe_transp_retTransp_cMunFG() {
		return nfeProc_NFe_infNFe_transp_retTransp_cMunFG;
	}

	public void setNfeProc_NFe_infNFe_transp_retTransp_cMunFG(String nfeProc_NFe_infNFe_transp_retTransp_cMunFG) {
		this.nfeProc_NFe_infNFe_transp_retTransp_cMunFG = nfeProc_NFe_infNFe_transp_retTransp_cMunFG;
	}

	public String getNfeProc_NFe_infNFe_transp_veicTransp_placa() {
		return nfeProc_NFe_infNFe_transp_veicTransp_placa;
	}

	public void setNfeProc_NFe_infNFe_transp_veicTransp_placa(String nfeProc_NFe_infNFe_transp_veicTransp_placa) {
		this.nfeProc_NFe_infNFe_transp_veicTransp_placa = nfeProc_NFe_infNFe_transp_veicTransp_placa;
	}

	public String getNfeProc_NFe_infNFe_transp_veicTransp_UF() {
		return nfeProc_NFe_infNFe_transp_veicTransp_UF;
	}

	public void setNfeProc_NFe_infNFe_transp_veicTransp_UF(String nfeProc_NFe_infNFe_transp_veicTransp_UF) {
		this.nfeProc_NFe_infNFe_transp_veicTransp_UF = nfeProc_NFe_infNFe_transp_veicTransp_UF;
	}

	public String getNfeProc_NFe_infNFe_transp_veicTransp_RNTC() {
		return nfeProc_NFe_infNFe_transp_veicTransp_RNTC;
	}

	public void setNfeProc_NFe_infNFe_transp_veicTransp_RNTC(String nfeProc_NFe_infNFe_transp_veicTransp_RNTC) {
		this.nfeProc_NFe_infNFe_transp_veicTransp_RNTC = nfeProc_NFe_infNFe_transp_veicTransp_RNTC;
	}

	public String getNfeProc_NFe_infNFe_transp_reboque_UF() {
		return nfeProc_NFe_infNFe_transp_reboque_UF;
	}

	public void setNfeProc_NFe_infNFe_transp_reboque_UF(String nfeProc_NFe_infNFe_transp_reboque_UF) {
		this.nfeProc_NFe_infNFe_transp_reboque_UF = nfeProc_NFe_infNFe_transp_reboque_UF;
	}

	public String getNfeProc_NFe_infNFe_transp_reboque_RNTC() {
		return nfeProc_NFe_infNFe_transp_reboque_RNTC;
	}

	public void setNfeProc_NFe_infNFe_transp_reboque_RNTC(String nfeProc_NFe_infNFe_transp_reboque_RNTC) {
		this.nfeProc_NFe_infNFe_transp_reboque_RNTC = nfeProc_NFe_infNFe_transp_reboque_RNTC;
	}

	public String getNfeProc_NFe_infNFe_transp_vagao() {
		return nfeProc_NFe_infNFe_transp_vagao;
	}

	public void setNfeProc_NFe_infNFe_transp_vagao(String nfeProc_NFe_infNFe_transp_vagao) {
		this.nfeProc_NFe_infNFe_transp_vagao = nfeProc_NFe_infNFe_transp_vagao;
	}

	public String getNfeProc_NFe_infNFe_transp_balsa() {
		return nfeProc_NFe_infNFe_transp_balsa;
	}

	public void setNfeProc_NFe_infNFe_transp_balsa(String nfeProc_NFe_infNFe_transp_balsa) {
		this.nfeProc_NFe_infNFe_transp_balsa = nfeProc_NFe_infNFe_transp_balsa;
	}

	public String getNfeProc_NFe_infNFe_transp_vol_qVol() {
		return nfeProc_NFe_infNFe_transp_vol_qVol;
	}

	public void setNfeProc_NFe_infNFe_transp_vol_qVol(String nfeProc_NFe_infNFe_transp_vol_qVol) {
		this.nfeProc_NFe_infNFe_transp_vol_qVol = nfeProc_NFe_infNFe_transp_vol_qVol;
	}

	public String getNfeProc_NFe_infNFe_transp_vol_esp() {
		return nfeProc_NFe_infNFe_transp_vol_esp;
	}

	public void setNfeProc_NFe_infNFe_transp_vol_esp(String nfeProc_NFe_infNFe_transp_vol_esp) {
		this.nfeProc_NFe_infNFe_transp_vol_esp = nfeProc_NFe_infNFe_transp_vol_esp;
	}

	public String getNfeProc_NFe_infNFe_transp_vol_marca() {
		return nfeProc_NFe_infNFe_transp_vol_marca;
	}

	public void setNfeProc_NFe_infNFe_transp_vol_marca(String nfeProc_NFe_infNFe_transp_vol_marca) {
		this.nfeProc_NFe_infNFe_transp_vol_marca = nfeProc_NFe_infNFe_transp_vol_marca;
	}

	public String getNfeProc_NFe_infNFe_transp_vol_nVol() {
		return nfeProc_NFe_infNFe_transp_vol_nVol;
	}

	public void setNfeProc_NFe_infNFe_transp_vol_nVol(String nfeProc_NFe_infNFe_transp_vol_nVol) {
		this.nfeProc_NFe_infNFe_transp_vol_nVol = nfeProc_NFe_infNFe_transp_vol_nVol;
	}

	public String getNfeProc_NFe_infNFe_transp_vol_pesoL() {
		return nfeProc_NFe_infNFe_transp_vol_pesoL;
	}

	public void setNfeProc_NFe_infNFe_transp_vol_pesoL(String nfeProc_NFe_infNFe_transp_vol_pesoL) {
		this.nfeProc_NFe_infNFe_transp_vol_pesoL = nfeProc_NFe_infNFe_transp_vol_pesoL;
	}

	public String getNfeProc_NFe_infNFe_transp_vol_pesoB() {
		return nfeProc_NFe_infNFe_transp_vol_pesoB;
	}

	public void setNfeProc_NFe_infNFe_transp_vol_pesoB(String nfeProc_NFe_infNFe_transp_vol_pesoB) {
		this.nfeProc_NFe_infNFe_transp_vol_pesoB = nfeProc_NFe_infNFe_transp_vol_pesoB;
	}

	public String getNfeProc_NFe_infNFe_transp_vol_lacres_nLacre() {
		return nfeProc_NFe_infNFe_transp_vol_lacres_nLacre;
	}

	public void setNfeProc_NFe_infNFe_transp_vol_lacres_nLacre(String nfeProc_NFe_infNFe_transp_vol_lacres_nLacre) {
		this.nfeProc_NFe_infNFe_transp_vol_lacres_nLacre = nfeProc_NFe_infNFe_transp_vol_lacres_nLacre;
	}

	public String getNfeProc_NFe_infNFe_cobr_fat_nFat() {
		return nfeProc_NFe_infNFe_cobr_fat_nFat;
	}

	public void setNfeProc_NFe_infNFe_cobr_fat_nFat(String nfeProc_NFe_infNFe_cobr_fat_nFat) {
		this.nfeProc_NFe_infNFe_cobr_fat_nFat = nfeProc_NFe_infNFe_cobr_fat_nFat;
	}

	public String getNfeProc_NFe_infNFe_cobr_fat_vOrig() {
		return nfeProc_NFe_infNFe_cobr_fat_vOrig;
	}

	public void setNfeProc_NFe_infNFe_cobr_fat_vOrig(String nfeProc_NFe_infNFe_cobr_fat_vOrig) {
		this.nfeProc_NFe_infNFe_cobr_fat_vOrig = nfeProc_NFe_infNFe_cobr_fat_vOrig;
	}

	public String getNfeProc_NFe_infNFe_cobr_fat_vDesc() {
		return nfeProc_NFe_infNFe_cobr_fat_vDesc;
	}

	public void setNfeProc_NFe_infNFe_cobr_fat_vDesc(String nfeProc_NFe_infNFe_cobr_fat_vDesc) {
		this.nfeProc_NFe_infNFe_cobr_fat_vDesc = nfeProc_NFe_infNFe_cobr_fat_vDesc;
	}

	public String getNfeProc_NFe_infNFe_cobr_fat_vLiq() {
		return nfeProc_NFe_infNFe_cobr_fat_vLiq;
	}

	public void setNfeProc_NFe_infNFe_cobr_fat_vLiq(String nfeProc_NFe_infNFe_cobr_fat_vLiq) {
		this.nfeProc_NFe_infNFe_cobr_fat_vLiq = nfeProc_NFe_infNFe_cobr_fat_vLiq;
	}

	public String getNfeProc_NFe_infNFe_cobr_dup_nDup() {
		return nfeProc_NFe_infNFe_cobr_dup_nDup;
	}

	public void setNfeProc_NFe_infNFe_cobr_dup_nDup(String nfeProc_NFe_infNFe_cobr_dup_nDup) {
		this.nfeProc_NFe_infNFe_cobr_dup_nDup = nfeProc_NFe_infNFe_cobr_dup_nDup;
	}

	public String getNfeProc_NFe_infNFe_cobr_dup_dVenc() {
		return nfeProc_NFe_infNFe_cobr_dup_dVenc;
	}

	public void setNfeProc_NFe_infNFe_cobr_dup_dVenc(String nfeProc_NFe_infNFe_cobr_dup_dVenc) {
		this.nfeProc_NFe_infNFe_cobr_dup_dVenc = nfeProc_NFe_infNFe_cobr_dup_dVenc;
	}

	public String getNfeProc_NFe_infNFe_cobr_dup_vDup() {
		return nfeProc_NFe_infNFe_cobr_dup_vDup;
	}

	public void setNfeProc_NFe_infNFe_cobr_dup_vDup(String nfeProc_NFe_infNFe_cobr_dup_vDup) {
		this.nfeProc_NFe_infNFe_cobr_dup_vDup = nfeProc_NFe_infNFe_cobr_dup_vDup;
	}

	public String getNfeProc_NFe_infNFe_infAdic_infAdFisco() {
		return nfeProc_NFe_infNFe_infAdic_infAdFisco;
	}

	public void setNfeProc_NFe_infNFe_infAdic_infAdFisco(String nfeProc_NFe_infNFe_infAdic_infAdFisco) {
		this.nfeProc_NFe_infNFe_infAdic_infAdFisco = nfeProc_NFe_infNFe_infAdic_infAdFisco;
	}

	public String getNfeProc_NFe_infNFe_infAdic_infCpl() {
		return nfeProc_NFe_infNFe_infAdic_infCpl;
	}

	public void setNfeProc_NFe_infNFe_infAdic_infCpl(String nfeProc_NFe_infNFe_infAdic_infCpl) {
		this.nfeProc_NFe_infNFe_infAdic_infCpl = nfeProc_NFe_infNFe_infAdic_infCpl;
	}

	public String getNfeProc_NFe_infNFe_infAdic_obsCont_xCampo() {
		return nfeProc_NFe_infNFe_infAdic_obsCont_xCampo;
	}

	public void setNfeProc_NFe_infNFe_infAdic_obsCont_xCampo(String nfeProc_NFe_infNFe_infAdic_obsCont_xCampo) {
		this.nfeProc_NFe_infNFe_infAdic_obsCont_xCampo = nfeProc_NFe_infNFe_infAdic_obsCont_xCampo;
	}

	public String getNfeProc_NFe_infNFe_infAdic_obsCont_xTexto() {
		return nfeProc_NFe_infNFe_infAdic_obsCont_xTexto;
	}

	public void setNfeProc_NFe_infNFe_infAdic_obsCont_xTexto(String nfeProc_NFe_infNFe_infAdic_obsCont_xTexto) {
		this.nfeProc_NFe_infNFe_infAdic_obsCont_xTexto = nfeProc_NFe_infNFe_infAdic_obsCont_xTexto;
	}

	public String getNfeProc_NFe_infNFe_infAdic_obsFisco_xCampo() {
		return nfeProc_NFe_infNFe_infAdic_obsFisco_xCampo;
	}

	public void setNfeProc_NFe_infNFe_infAdic_obsFisco_xCampo(String nfeProc_NFe_infNFe_infAdic_obsFisco_xCampo) {
		this.nfeProc_NFe_infNFe_infAdic_obsFisco_xCampo = nfeProc_NFe_infNFe_infAdic_obsFisco_xCampo;
	}

	public String getNfeProc_NFe_infNFe_infAdic_obsFisco_xTexto() {
		return nfeProc_NFe_infNFe_infAdic_obsFisco_xTexto;
	}

	public void setNfeProc_NFe_infNFe_infAdic_obsFisco_xTexto(String nfeProc_NFe_infNFe_infAdic_obsFisco_xTexto) {
		this.nfeProc_NFe_infNFe_infAdic_obsFisco_xTexto = nfeProc_NFe_infNFe_infAdic_obsFisco_xTexto;
	}

	public String getNfeProc_NFe_infNFe_infAdic_procRef_nProc() {
		return nfeProc_NFe_infNFe_infAdic_procRef_nProc;
	}

	public void setNfeProc_NFe_infNFe_infAdic_procRef_nProc(String nfeProc_NFe_infNFe_infAdic_procRef_nProc) {
		this.nfeProc_NFe_infNFe_infAdic_procRef_nProc = nfeProc_NFe_infNFe_infAdic_procRef_nProc;
	}

	public String getNfeProc_NFe_infNFe_infAdic_procRef_indProc() {
		return nfeProc_NFe_infNFe_infAdic_procRef_indProc;
	}

	public void setNfeProc_NFe_infNFe_infAdic_procRef_indProc(String nfeProc_NFe_infNFe_infAdic_procRef_indProc) {
		this.nfeProc_NFe_infNFe_infAdic_procRef_indProc = nfeProc_NFe_infNFe_infAdic_procRef_indProc;
	}

	public String getNfeProc_NFe_infNFe_exporta_UFEmbarq() {
		return nfeProc_NFe_infNFe_exporta_UFEmbarq;
	}

	public void setNfeProc_NFe_infNFe_exporta_UFEmbarq(String nfeProc_NFe_infNFe_exporta_UFEmbarq) {
		this.nfeProc_NFe_infNFe_exporta_UFEmbarq = nfeProc_NFe_infNFe_exporta_UFEmbarq;
	}

	public String getNfeProc_NFe_infNFe_exporta_xLocEmbarq() {
		return nfeProc_NFe_infNFe_exporta_xLocEmbarq;
	}

	public void setNfeProc_NFe_infNFe_exporta_xLocEmbarq(String nfeProc_NFe_infNFe_exporta_xLocEmbarq) {
		this.nfeProc_NFe_infNFe_exporta_xLocEmbarq = nfeProc_NFe_infNFe_exporta_xLocEmbarq;
	}

	public String getNfeProc_NFe_infNFe_compra_xNEmp() {
		return nfeProc_NFe_infNFe_compra_xNEmp;
	}

	public void setNfeProc_NFe_infNFe_compra_xNEmp(String nfeProc_NFe_infNFe_compra_xNEmp) {
		this.nfeProc_NFe_infNFe_compra_xNEmp = nfeProc_NFe_infNFe_compra_xNEmp;
	}

	public String getNfeProc_NFe_infNFe_compra_xPed() {
		return nfeProc_NFe_infNFe_compra_xPed;
	}

	public void setNfeProc_NFe_infNFe_compra_xPed(String nfeProc_NFe_infNFe_compra_xPed) {
		this.nfeProc_NFe_infNFe_compra_xPed = nfeProc_NFe_infNFe_compra_xPed;
	}

	public String getNfeProc_NFe_infNFe_compra_xCont() {
		return nfeProc_NFe_infNFe_compra_xCont;
	}

	public void setNfeProc_NFe_infNFe_compra_xCont(String nfeProc_NFe_infNFe_compra_xCont) {
		this.nfeProc_NFe_infNFe_compra_xCont = nfeProc_NFe_infNFe_compra_xCont;
	}

	public String getNfeProc_NFe_infNFe_cana_safra() {
		return nfeProc_NFe_infNFe_cana_safra;
	}

	public void setNfeProc_NFe_infNFe_cana_safra(String nfeProc_NFe_infNFe_cana_safra) {
		this.nfeProc_NFe_infNFe_cana_safra = nfeProc_NFe_infNFe_cana_safra;
	}

	public String getNfeProc_NFe_infNFe_cana_ref() {
		return nfeProc_NFe_infNFe_cana_ref;
	}

	public void setNfeProc_NFe_infNFe_cana_ref(String nfeProc_NFe_infNFe_cana_ref) {
		this.nfeProc_NFe_infNFe_cana_ref = nfeProc_NFe_infNFe_cana_ref;
	}

	public String getNfeProc_NFe_infNFe_cana_forDia_qtde() {
		return nfeProc_NFe_infNFe_cana_forDia_qtde;
	}

	public void setNfeProc_NFe_infNFe_cana_forDia_qtde(String nfeProc_NFe_infNFe_cana_forDia_qtde) {
		this.nfeProc_NFe_infNFe_cana_forDia_qtde = nfeProc_NFe_infNFe_cana_forDia_qtde;
	}

	public String getNfeProc_NFe_infNFe_cana_qTotMes() {
		return nfeProc_NFe_infNFe_cana_qTotMes;
	}

	public void setNfeProc_NFe_infNFe_cana_qTotMes(String nfeProc_NFe_infNFe_cana_qTotMes) {
		this.nfeProc_NFe_infNFe_cana_qTotMes = nfeProc_NFe_infNFe_cana_qTotMes;
	}

	public String getNfeProc_NFe_infNFe_cana_qTotAnt() {
		return nfeProc_NFe_infNFe_cana_qTotAnt;
	}

	public void setNfeProc_NFe_infNFe_cana_qTotAnt(String nfeProc_NFe_infNFe_cana_qTotAnt) {
		this.nfeProc_NFe_infNFe_cana_qTotAnt = nfeProc_NFe_infNFe_cana_qTotAnt;
	}

	public String getNfeProc_NFe_infNFe_cana_qTotGer() {
		return nfeProc_NFe_infNFe_cana_qTotGer;
	}

	public void setNfeProc_NFe_infNFe_cana_qTotGer(String nfeProc_NFe_infNFe_cana_qTotGer) {
		this.nfeProc_NFe_infNFe_cana_qTotGer = nfeProc_NFe_infNFe_cana_qTotGer;
	}

	public String getNfeProc_NFe_infNFe_cana_deduc_xDed() {
		return nfeProc_NFe_infNFe_cana_deduc_xDed;
	}

	public void setNfeProc_NFe_infNFe_cana_deduc_xDed(String nfeProc_NFe_infNFe_cana_deduc_xDed) {
		this.nfeProc_NFe_infNFe_cana_deduc_xDed = nfeProc_NFe_infNFe_cana_deduc_xDed;
	}

	public String getNfeProc_NFe_infNFe_cana_deduc_vDed() {
		return nfeProc_NFe_infNFe_cana_deduc_vDed;
	}

	public void setNfeProc_NFe_infNFe_cana_deduc_vDed(String nfeProc_NFe_infNFe_cana_deduc_vDed) {
		this.nfeProc_NFe_infNFe_cana_deduc_vDed = nfeProc_NFe_infNFe_cana_deduc_vDed;
	}

	public String getNfeProc_NFe_infNFe_cana_vFor() {
		return nfeProc_NFe_infNFe_cana_vFor;
	}

	public void setNfeProc_NFe_infNFe_cana_vFor(String nfeProc_NFe_infNFe_cana_vFor) {
		this.nfeProc_NFe_infNFe_cana_vFor = nfeProc_NFe_infNFe_cana_vFor;
	}

	public String getNfeProc_NFe_infNFe_cana_vTotDed() {
		return nfeProc_NFe_infNFe_cana_vTotDed;
	}

	public void setNfeProc_NFe_infNFe_cana_vTotDed(String nfeProc_NFe_infNFe_cana_vTotDed) {
		this.nfeProc_NFe_infNFe_cana_vTotDed = nfeProc_NFe_infNFe_cana_vTotDed;
	}

	public String getNfeProc_NFe_infNFe_cana_vLiqFor() {
		return nfeProc_NFe_infNFe_cana_vLiqFor;
	}

	public void setNfeProc_NFe_infNFe_cana_vLiqFor(String nfeProc_NFe_infNFe_cana_vLiqFor) {
		this.nfeProc_NFe_infNFe_cana_vLiqFor = nfeProc_NFe_infNFe_cana_vLiqFor;
	}

	public String getNfeProc_protNFe_infProt_tpAmb() {
		return nfeProc_protNFe_infProt_tpAmb;
	}

	public void setNfeProc_protNFe_infProt_tpAmb(String nfeProc_protNFe_infProt_tpAmb) {
		this.nfeProc_protNFe_infProt_tpAmb = nfeProc_protNFe_infProt_tpAmb;
	}

	public String getNfeProc_protNFe_infProt_verAplic() {
		return nfeProc_protNFe_infProt_verAplic;
	}

	public void setNfeProc_protNFe_infProt_verAplic(String nfeProc_protNFe_infProt_verAplic) {
		this.nfeProc_protNFe_infProt_verAplic = nfeProc_protNFe_infProt_verAplic;
	}

	public String getNfeProc_protNFe_infProt_dhRecbto() {
		return nfeProc_protNFe_infProt_dhRecbto;
	}

	public void setNfeProc_protNFe_infProt_dhRecbto(String nfeProc_protNFe_infProt_dhRecbto) {
		this.nfeProc_protNFe_infProt_dhRecbto = nfeProc_protNFe_infProt_dhRecbto;
	}

	public String getNfeProc_protNFe_infProt_nProt() {
		return nfeProc_protNFe_infProt_nProt;
	}

	public void setNfeProc_protNFe_infProt_nProt(String nfeProc_protNFe_infProt_nProt) {
		this.nfeProc_protNFe_infProt_nProt = nfeProc_protNFe_infProt_nProt;
	}

	public String getNfeProc_protNFe_infProt_digVal() {
		return nfeProc_protNFe_infProt_digVal;
	}

	public void setNfeProc_protNFe_infProt_digVal(String nfeProc_protNFe_infProt_digVal) {
		this.nfeProc_protNFe_infProt_digVal = nfeProc_protNFe_infProt_digVal;
	}

	public String getNfeProc_protNFe_infProt_cStat() {
		return nfeProc_protNFe_infProt_cStat;
	}

	public void setNfeProc_protNFe_infProt_cStat(String nfeProc_protNFe_infProt_cStat) {
		this.nfeProc_protNFe_infProt_cStat = nfeProc_protNFe_infProt_cStat;
	}

	public String getNfeProc_protNFe_infProt_xMotivo() {
		return nfeProc_protNFe_infProt_xMotivo;
	}

	public void setNfeProc_protNFe_infProt_xMotivo(String nfeProc_protNFe_infProt_xMotivo) {
		this.nfeProc_protNFe_infProt_xMotivo = nfeProc_protNFe_infProt_xMotivo;
	}

	public String getNfeProc_NFe_infNFe_Id() {
		return nfeProc_NFe_infNFe_Id;
	}

	public void setNfeProc_NFe_infNFe_Id(String nfeProc_NFe_infNFe_Id) {
		this.nfeProc_NFe_infNFe_Id = nfeProc_NFe_infNFe_Id;
	}

	public String getNfeProc_NFe_infNFe_versao() {
		return nfeProc_NFe_infNFe_versao;
	}

	public void setNfeProc_NFe_infNFe_versao(String nfeProc_NFe_infNFe_versao) {
		this.nfeProc_NFe_infNFe_versao = nfeProc_NFe_infNFe_versao;
	}

	public String getNfeProc_protNFe_versao() {
		return nfeProc_protNFe_versao;
	}

	public void setNfeProc_protNFe_versao(String nfeProc_protNFe_versao) {
		this.nfeProc_protNFe_versao = nfeProc_protNFe_versao;
	}

	@Override
	public int compareTo(NFeEntity other) {
		return this.chNFe.compareTo(other.chNFe);
	}

	public DashboardEntity createDashboard() throws JsonProcessingException, IOException {
		DashboardEntity dashboard = new DashboardEntity();

		dashboard.setUser(this.getUser());
		dashboard.setChNFe(getChNFe());
		dashboard.setNfeProc_NFe_infNFe_ide_dEmi(DataUtil.parseToDateXML(this.getNfeProc_NFe_infNFe_ide_dEmi()));
		dashboard.setMonth(DataUtil.getMonth(dashboard.getNfeProc_NFe_infNFe_ide_dEmi()));
		dashboard.setYear(DataUtil.getYear(dashboard.getNfeProc_NFe_infNFe_ide_dEmi()));
		dashboard.setYearMonth(Integer.parseInt(dashboard.getYear() + String.format("%02d", dashboard.getMonth())));
		dashboard.setNfeProc_NFe_infNFe_dest_xNome(this.getNfeProc_NFe_infNFe_dest_xNome());
		dashboard.setNfeProc_NFe_infNFe_dest_enderDest_UF(getNfeProc_NFe_infNFe_dest_enderDest_UF());
		dashboard.setNfeProc_NFe_infNFe_ide_indPag(Integer.parseInt(this.getNfeProc_NFe_infNFe_ide_indPag()));

		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vICMS(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vICMS));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vST(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vST));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vProd(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vProd));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vFrete(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vFrete));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vSeg(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vSeg));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vDesc(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vDesc));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vII(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vII));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vIPI(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vIPI));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vPIS(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vPIS));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vCOFINS(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vCOFINS));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vOutro(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vOutro));
		dashboard.setNfeProc_NFe_infNFe_total_ICMSTot_vNF(new BigDecimal(nfeProc_NFe_infNFe_total_ICMSTot_vNF));

		Coordinate geocode = GeocodingClient.geocode(this.getEndereco());
		dashboard.setLat(geocode.getLat());
		dashboard.setLng(geocode.getLng());

		List<DetEntity> dets = getDets();
		for (DetEntity det : dets) {
			DetDashboardEntity detDash = det.createDetDashboard(dashboard);
			// TODO <Betioli> Esse if foi pra resolver um problema de xProd
			// null. Verificar
			if (detDash.getNfeProc_NFe_infNFe_det_prod_xProd() != null) {
				detDash.setUser(this.getUser());
				dashboard.getDets().add(detDash);
			}
		}

		return dashboard;
	}

	/**
	 * Compatibilidade com api que popula a entidade
	 */
	public String getNfeProc_protNFe_infProt_chNFe() {
		return getChNFe();
	}

	/**
	 * Compatibilidade com api que popula a entidade
	 */
	public void setNfeProc_protNFe_infProt_chNFe(String nfeProc_protNFe_infProt_chNFe) {
		setChNFe(nfeProc_protNFe_infProt_chNFe);
	}

}
