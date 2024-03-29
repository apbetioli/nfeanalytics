package com.nfeanalytics.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
		@NamedQuery(name = "DetEntity.findByUser", query = ""
				+ "select obj               "
				+ "  from DetEntity obj     "
				+ " where obj.user = :user   "),
		@NamedQuery(name = "DetEntity.deleteByChNFe", query = ""
				+ "delete                     "
				+ "  from DetEntity obj       "
				+ " where obj.chNFe = :chNFe  "
				+ "   and obj.user  = :user   ")

})
public class DetEntity extends SuperEntity {

	private static final long	serialVersionUID	= -5987158628867415683L;

	private String				chNFe;

	private String				nfeProc_NFe_infNFe_det_prod_cProd;

	private String				nfeProc_NFe_infNFe_det_prod_xProd;

	private String				nfeProc_NFe_infNFe_det_prod_cEAN;

	private String				nfeProc_NFe_infNFe_det_prod_NCM;

	private String				nfeProc_NFe_infNFe_det_prod_EXTIPI;

	private String				nfeProc_NFe_infNFe_det_prod_CFOP;

	private String				nfeProc_NFe_infNFe_det_prod_uCom;

	private String				nfeProc_NFe_infNFe_det_prod_qCom;

	private String				nfeProc_NFe_infNFe_det_prod_vUnCom;

	private String				nfeProc_NFe_infNFe_det_prod_vProd;

	private String				nfeProc_NFe_infNFe_det_prod_cEANTrib;

	private String				nfeProc_NFe_infNFe_det_prod_uTrib;

	private String				nfeProc_NFe_infNFe_det_prod_qTrib;

	private String				nfeProc_NFe_infNFe_det_prod_vUnTrib;

	private String				nfeProc_NFe_infNFe_det_prod_vFrete;

	private String				nfeProc_NFe_infNFe_det_prod_vSeg;

	private String				nfeProc_NFe_infNFe_det_prod_vDesc;

	private String				nfeProc_NFe_infNFe_det_prod_vOutro;

	private String				nfeProc_NFe_infNFe_det_prod_indTot;

	private String				nfeProc_NFe_infNFe_det_prod_DI_nDI;

	private String				nfeProc_NFe_infNFe_det_prod_DI_dDI;

	private String				nfeProc_NFe_infNFe_det_prod_DI_xLocDesemb;

	private String				nfeProc_NFe_infNFe_det_prod_DI_UFDesemb;

	private String				nfeProc_NFe_infNFe_det_prod_DI_dDesemb;

	private String				nfeProc_NFe_infNFe_det_prod_DI_cExportador;

	private String				nfeProc_NFe_infNFe_det_prod_DI_adi_nAdicao;

	private String				nfeProc_NFe_infNFe_det_prod_DI_adi_nSeqAdic;

	private String				nfeProc_NFe_infNFe_det_prod_DI_adi_cFabricante;

	private String				nfeProc_NFe_infNFe_det_prod_DI_adi_vDescDI;

	private String				nfeProc_NFe_infNFe_det_prod_xPed;

	private String				nfeProc_NFe_infNFe_det_prod_nItemPed;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_tpOp;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_chassi;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_cCor;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_xCor;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_pot;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_cilin;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_pesoL;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_pesoB;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_nSerie;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_tpComb;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_nMotor;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_CMT;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_dist;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_anoMod;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_anoFab;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_tpPint;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_tpVeic;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_espVeic;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_VIN;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_condVeic;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_cMod;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_cCorDENATRAN;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_lota;

	private String				nfeProc_NFe_infNFe_det_prod_veicProd_tpRest;

	private String				nfeProc_NFe_infNFe_det_prod_med_nLote;

	private String				nfeProc_NFe_infNFe_det_prod_med_qLote;

	private String				nfeProc_NFe_infNFe_det_prod_med_dFab;

	private String				nfeProc_NFe_infNFe_det_prod_med_dVal;

	private String				nfeProc_NFe_infNFe_det_prod_med_vPMC;

	private String				nfeProc_NFe_infNFe_det_prod_arma_tpArma;

	private String				nfeProc_NFe_infNFe_det_prod_arma_nSerie;

	private String				nfeProc_NFe_infNFe_det_prod_arma_nCano;

	private String				nfeProc_NFe_infNFe_det_prod_arma_descr;

	private String				nfeProc_NFe_infNFe_det_prod_comb_cProdANP;

	private String				nfeProc_NFe_infNFe_det_prod_comb_CODIF;

	private String				nfeProc_NFe_infNFe_det_prod_comb_qTemp;

	private String				nfeProc_NFe_infNFe_det_prod_comb_UFCons;

	private String				nfeProc_NFe_infNFe_det_prod_comb_CIDE_qBCProd;

	private String				nfeProc_NFe_infNFe_det_prod_comb_CIDE_vAliqProd;

	private String				nfeProc_NFe_infNFe_det_prod_comb_CIDE_vCIDE;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_modBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_pICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pMVAST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pRedBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_modBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pRedBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_modBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pMVAST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pRedBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_vICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_motDesICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_modBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pRedBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vBCSTRet;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vICMSSTRet;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pMVAST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pMVAST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pMVAST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pBCOp;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_UFST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTRet;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTRet;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTDest;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTDest;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_CSOSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_pCredSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_vCredICMSSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_CSOSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_CSOSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_modBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pMVAST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pRedBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pCredSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vCredICMSSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_CSOSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_modBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pMVAST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pRedBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_CSOSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vBCSTRet;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vICMSSTRet;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_orig;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_CSOSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMS;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pMVAST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBCST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMSST;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pCredSN;

	private String				nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vCredICMSSN;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_clEnq;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_CNPJProd;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_cSelo;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_qSelo;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_cEnq;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_pIPI;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_qUnid;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vUnid;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vIPI;

	private String				nfeProc_NFe_infNFe_det_imposto_IPI_IPINT_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_II_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_II_vDespAdu;

	private String				nfeProc_NFe_infNFe_det_imposto_II_vII;

	private String				nfeProc_NFe_infNFe_det_imposto_II_vIOF;

	private String				nfeProc_NFe_infNFe_det_imposto_ISSQN_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_ISSQN_vAliq;

	private String				nfeProc_NFe_infNFe_det_imposto_ISSQN_vISSQN;

	private String				nfeProc_NFe_infNFe_det_imposto_ISSQN_cMunFG;

	private String				nfeProc_NFe_infNFe_det_imposto_ISSQN_cListServ;

	private String				nfeProc_NFe_infNFe_det_imposto_ISSQN_cSitTrib;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_pPIS;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vPIS;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_qBCProd;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vAliqProd;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vPIS;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISNT_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_pPIS;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_qBCProd;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vAliqProd;

	private String				nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vPIS;

	private String				nfeProc_NFe_infNFe_det_imposto_PISST_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_PISST_pPIS;

	private String				nfeProc_NFe_infNFe_det_imposto_PISST_qBCProd;

	private String				nfeProc_NFe_infNFe_det_imposto_PISST_vAliqProd;

	private String				nfeProc_NFe_infNFe_det_imposto_PISST_vPIS;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_pCOFINS;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vCOFINS;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_qBCProd;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vAliqProd;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vCOFINS;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSNT_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_CST;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_pCOFINS;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_qBCProd;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vAliqProd;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vCOFINS;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINSST_vBC;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINSST_pCOFINS;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINSST_qBCProd;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINSST_vAliqProd;

	private String				nfeProc_NFe_infNFe_det_imposto_COFINSST_vCOFINS;

	private String				nfeProc_NFe_infNFe_det_infAdProd;

	public DetEntity() {
	}

	public DetEntity(NFeEntity nfe) {
		this.setChNFe(nfe.getChNFe());
		this.setUser(nfe.getUser());
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public String getNfeProc_NFe_infNFe_det_prod_cProd() {
		return nfeProc_NFe_infNFe_det_prod_cProd;
	}

	public void setNfeProc_NFe_infNFe_det_prod_cProd(String nfeProc_NFe_infNFe_det_prod_cProd) {
		this.nfeProc_NFe_infNFe_det_prod_cProd = nfeProc_NFe_infNFe_det_prod_cProd;
	}

	public String getNfeProc_NFe_infNFe_det_prod_cEAN() {
		return nfeProc_NFe_infNFe_det_prod_cEAN;
	}

	public void setNfeProc_NFe_infNFe_det_prod_cEAN(String nfeProc_NFe_infNFe_det_prod_cEAN) {
		this.nfeProc_NFe_infNFe_det_prod_cEAN = nfeProc_NFe_infNFe_det_prod_cEAN;
	}

	public String getNfeProc_NFe_infNFe_det_prod_xProd() {
		return nfeProc_NFe_infNFe_det_prod_xProd;
	}

	public void setNfeProc_NFe_infNFe_det_prod_xProd(String nfeProc_NFe_infNFe_det_prod_xProd) {
		this.nfeProc_NFe_infNFe_det_prod_xProd = nfeProc_NFe_infNFe_det_prod_xProd;
	}

	public String getNfeProc_NFe_infNFe_det_prod_NCM() {
		return nfeProc_NFe_infNFe_det_prod_NCM;
	}

	public void setNfeProc_NFe_infNFe_det_prod_NCM(String nfeProc_NFe_infNFe_det_prod_NCM) {
		this.nfeProc_NFe_infNFe_det_prod_NCM = nfeProc_NFe_infNFe_det_prod_NCM;
	}

	public String getNfeProc_NFe_infNFe_det_prod_EXTIPI() {
		return nfeProc_NFe_infNFe_det_prod_EXTIPI;
	}

	public void setNfeProc_NFe_infNFe_det_prod_EXTIPI(String nfeProc_NFe_infNFe_det_prod_EXTIPI) {
		this.nfeProc_NFe_infNFe_det_prod_EXTIPI = nfeProc_NFe_infNFe_det_prod_EXTIPI;
	}

	public String getNfeProc_NFe_infNFe_det_prod_CFOP() {
		return nfeProc_NFe_infNFe_det_prod_CFOP;
	}

	public void setNfeProc_NFe_infNFe_det_prod_CFOP(String nfeProc_NFe_infNFe_det_prod_CFOP) {
		this.nfeProc_NFe_infNFe_det_prod_CFOP = nfeProc_NFe_infNFe_det_prod_CFOP;
	}

	public String getNfeProc_NFe_infNFe_det_prod_uCom() {
		return nfeProc_NFe_infNFe_det_prod_uCom;
	}

	public void setNfeProc_NFe_infNFe_det_prod_uCom(String nfeProc_NFe_infNFe_det_prod_uCom) {
		this.nfeProc_NFe_infNFe_det_prod_uCom = nfeProc_NFe_infNFe_det_prod_uCom;
	}

	public String getNfeProc_NFe_infNFe_det_prod_qCom() {
		return nfeProc_NFe_infNFe_det_prod_qCom;
	}

	public void setNfeProc_NFe_infNFe_det_prod_qCom(String nfeProc_NFe_infNFe_det_prod_qCom) {
		this.nfeProc_NFe_infNFe_det_prod_qCom = nfeProc_NFe_infNFe_det_prod_qCom;
	}

	public String getNfeProc_NFe_infNFe_det_prod_vUnCom() {
		return nfeProc_NFe_infNFe_det_prod_vUnCom;
	}

	public void setNfeProc_NFe_infNFe_det_prod_vUnCom(String nfeProc_NFe_infNFe_det_prod_vUnCom) {
		this.nfeProc_NFe_infNFe_det_prod_vUnCom = nfeProc_NFe_infNFe_det_prod_vUnCom;
	}

	public String getNfeProc_NFe_infNFe_det_prod_vProd() {
		return nfeProc_NFe_infNFe_det_prod_vProd;
	}

	public void setNfeProc_NFe_infNFe_det_prod_vProd(String nfeProc_NFe_infNFe_det_prod_vProd) {
		this.nfeProc_NFe_infNFe_det_prod_vProd = nfeProc_NFe_infNFe_det_prod_vProd;
	}

	public String getNfeProc_NFe_infNFe_det_prod_cEANTrib() {
		return nfeProc_NFe_infNFe_det_prod_cEANTrib;
	}

	public void setNfeProc_NFe_infNFe_det_prod_cEANTrib(String nfeProc_NFe_infNFe_det_prod_cEANTrib) {
		this.nfeProc_NFe_infNFe_det_prod_cEANTrib = nfeProc_NFe_infNFe_det_prod_cEANTrib;
	}

	public String getNfeProc_NFe_infNFe_det_prod_uTrib() {
		return nfeProc_NFe_infNFe_det_prod_uTrib;
	}

	public void setNfeProc_NFe_infNFe_det_prod_uTrib(String nfeProc_NFe_infNFe_det_prod_uTrib) {
		this.nfeProc_NFe_infNFe_det_prod_uTrib = nfeProc_NFe_infNFe_det_prod_uTrib;
	}

	public String getNfeProc_NFe_infNFe_det_prod_qTrib() {
		return nfeProc_NFe_infNFe_det_prod_qTrib;
	}

	public void setNfeProc_NFe_infNFe_det_prod_qTrib(String nfeProc_NFe_infNFe_det_prod_qTrib) {
		this.nfeProc_NFe_infNFe_det_prod_qTrib = nfeProc_NFe_infNFe_det_prod_qTrib;
	}

	public String getNfeProc_NFe_infNFe_det_prod_vUnTrib() {
		return nfeProc_NFe_infNFe_det_prod_vUnTrib;
	}

	public void setNfeProc_NFe_infNFe_det_prod_vUnTrib(String nfeProc_NFe_infNFe_det_prod_vUnTrib) {
		this.nfeProc_NFe_infNFe_det_prod_vUnTrib = nfeProc_NFe_infNFe_det_prod_vUnTrib;
	}

	public String getNfeProc_NFe_infNFe_det_prod_vFrete() {
		return nfeProc_NFe_infNFe_det_prod_vFrete;
	}

	public void setNfeProc_NFe_infNFe_det_prod_vFrete(String nfeProc_NFe_infNFe_det_prod_vFrete) {
		this.nfeProc_NFe_infNFe_det_prod_vFrete = nfeProc_NFe_infNFe_det_prod_vFrete;
	}

	public String getNfeProc_NFe_infNFe_det_prod_vSeg() {
		return nfeProc_NFe_infNFe_det_prod_vSeg;
	}

	public void setNfeProc_NFe_infNFe_det_prod_vSeg(String nfeProc_NFe_infNFe_det_prod_vSeg) {
		this.nfeProc_NFe_infNFe_det_prod_vSeg = nfeProc_NFe_infNFe_det_prod_vSeg;
	}

	public String getNfeProc_NFe_infNFe_det_prod_vDesc() {
		return nfeProc_NFe_infNFe_det_prod_vDesc;
	}

	public void setNfeProc_NFe_infNFe_det_prod_vDesc(String nfeProc_NFe_infNFe_det_prod_vDesc) {
		this.nfeProc_NFe_infNFe_det_prod_vDesc = nfeProc_NFe_infNFe_det_prod_vDesc;
	}

	public String getNfeProc_NFe_infNFe_det_prod_vOutro() {
		return nfeProc_NFe_infNFe_det_prod_vOutro;
	}

	public void setNfeProc_NFe_infNFe_det_prod_vOutro(String nfeProc_NFe_infNFe_det_prod_vOutro) {
		this.nfeProc_NFe_infNFe_det_prod_vOutro = nfeProc_NFe_infNFe_det_prod_vOutro;
	}

	public String getNfeProc_NFe_infNFe_det_prod_indTot() {
		return nfeProc_NFe_infNFe_det_prod_indTot;
	}

	public void setNfeProc_NFe_infNFe_det_prod_indTot(String nfeProc_NFe_infNFe_det_prod_indTot) {
		this.nfeProc_NFe_infNFe_det_prod_indTot = nfeProc_NFe_infNFe_det_prod_indTot;
	}

	public String getNfeProc_NFe_infNFe_det_prod_DI_nDI() {
		return nfeProc_NFe_infNFe_det_prod_DI_nDI;
	}

	public void setNfeProc_NFe_infNFe_det_prod_DI_nDI(String nfeProc_NFe_infNFe_det_prod_DI_nDI) {
		this.nfeProc_NFe_infNFe_det_prod_DI_nDI = nfeProc_NFe_infNFe_det_prod_DI_nDI;
	}

	public String getNfeProc_NFe_infNFe_det_prod_DI_dDI() {
		return nfeProc_NFe_infNFe_det_prod_DI_dDI;
	}

	public void setNfeProc_NFe_infNFe_det_prod_DI_dDI(String nfeProc_NFe_infNFe_det_prod_DI_dDI) {
		this.nfeProc_NFe_infNFe_det_prod_DI_dDI = nfeProc_NFe_infNFe_det_prod_DI_dDI;
	}

	public String getNfeProc_NFe_infNFe_det_prod_DI_xLocDesemb() {
		return nfeProc_NFe_infNFe_det_prod_DI_xLocDesemb;
	}

	public void setNfeProc_NFe_infNFe_det_prod_DI_xLocDesemb(String nfeProc_NFe_infNFe_det_prod_DI_xLocDesemb) {
		this.nfeProc_NFe_infNFe_det_prod_DI_xLocDesemb = nfeProc_NFe_infNFe_det_prod_DI_xLocDesemb;
	}

	public String getNfeProc_NFe_infNFe_det_prod_DI_UFDesemb() {
		return nfeProc_NFe_infNFe_det_prod_DI_UFDesemb;
	}

	public void setNfeProc_NFe_infNFe_det_prod_DI_UFDesemb(String nfeProc_NFe_infNFe_det_prod_DI_UFDesemb) {
		this.nfeProc_NFe_infNFe_det_prod_DI_UFDesemb = nfeProc_NFe_infNFe_det_prod_DI_UFDesemb;
	}

	public String getNfeProc_NFe_infNFe_det_prod_DI_dDesemb() {
		return nfeProc_NFe_infNFe_det_prod_DI_dDesemb;
	}

	public void setNfeProc_NFe_infNFe_det_prod_DI_dDesemb(String nfeProc_NFe_infNFe_det_prod_DI_dDesemb) {
		this.nfeProc_NFe_infNFe_det_prod_DI_dDesemb = nfeProc_NFe_infNFe_det_prod_DI_dDesemb;
	}

	public String getNfeProc_NFe_infNFe_det_prod_DI_cExportador() {
		return nfeProc_NFe_infNFe_det_prod_DI_cExportador;
	}

	public void setNfeProc_NFe_infNFe_det_prod_DI_cExportador(String nfeProc_NFe_infNFe_det_prod_DI_cExportador) {
		this.nfeProc_NFe_infNFe_det_prod_DI_cExportador = nfeProc_NFe_infNFe_det_prod_DI_cExportador;
	}

	public String getNfeProc_NFe_infNFe_det_prod_DI_adi_nAdicao() {
		return nfeProc_NFe_infNFe_det_prod_DI_adi_nAdicao;
	}

	public void setNfeProc_NFe_infNFe_det_prod_DI_adi_nAdicao(String nfeProc_NFe_infNFe_det_prod_DI_adi_nAdicao) {
		this.nfeProc_NFe_infNFe_det_prod_DI_adi_nAdicao = nfeProc_NFe_infNFe_det_prod_DI_adi_nAdicao;
	}

	public String getNfeProc_NFe_infNFe_det_prod_DI_adi_nSeqAdic() {
		return nfeProc_NFe_infNFe_det_prod_DI_adi_nSeqAdic;
	}

	public void setNfeProc_NFe_infNFe_det_prod_DI_adi_nSeqAdic(String nfeProc_NFe_infNFe_det_prod_DI_adi_nSeqAdic) {
		this.nfeProc_NFe_infNFe_det_prod_DI_adi_nSeqAdic = nfeProc_NFe_infNFe_det_prod_DI_adi_nSeqAdic;
	}

	public String getNfeProc_NFe_infNFe_det_prod_DI_adi_cFabricante() {
		return nfeProc_NFe_infNFe_det_prod_DI_adi_cFabricante;
	}

	public void setNfeProc_NFe_infNFe_det_prod_DI_adi_cFabricante(String nfeProc_NFe_infNFe_det_prod_DI_adi_cFabricante) {
		this.nfeProc_NFe_infNFe_det_prod_DI_adi_cFabricante = nfeProc_NFe_infNFe_det_prod_DI_adi_cFabricante;
	}

	public String getNfeProc_NFe_infNFe_det_prod_DI_adi_vDescDI() {
		return nfeProc_NFe_infNFe_det_prod_DI_adi_vDescDI;
	}

	public void setNfeProc_NFe_infNFe_det_prod_DI_adi_vDescDI(String nfeProc_NFe_infNFe_det_prod_DI_adi_vDescDI) {
		this.nfeProc_NFe_infNFe_det_prod_DI_adi_vDescDI = nfeProc_NFe_infNFe_det_prod_DI_adi_vDescDI;
	}

	public String getNfeProc_NFe_infNFe_det_prod_xPed() {
		return nfeProc_NFe_infNFe_det_prod_xPed;
	}

	public void setNfeProc_NFe_infNFe_det_prod_xPed(String nfeProc_NFe_infNFe_det_prod_xPed) {
		this.nfeProc_NFe_infNFe_det_prod_xPed = nfeProc_NFe_infNFe_det_prod_xPed;
	}

	public String getNfeProc_NFe_infNFe_det_prod_nItemPed() {
		return nfeProc_NFe_infNFe_det_prod_nItemPed;
	}

	public void setNfeProc_NFe_infNFe_det_prod_nItemPed(String nfeProc_NFe_infNFe_det_prod_nItemPed) {
		this.nfeProc_NFe_infNFe_det_prod_nItemPed = nfeProc_NFe_infNFe_det_prod_nItemPed;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_tpOp() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_tpOp;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_tpOp(String nfeProc_NFe_infNFe_det_prod_veicProd_tpOp) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_tpOp = nfeProc_NFe_infNFe_det_prod_veicProd_tpOp;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_chassi() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_chassi;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_chassi(String nfeProc_NFe_infNFe_det_prod_veicProd_chassi) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_chassi = nfeProc_NFe_infNFe_det_prod_veicProd_chassi;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_cCor() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_cCor;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_cCor(String nfeProc_NFe_infNFe_det_prod_veicProd_cCor) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_cCor = nfeProc_NFe_infNFe_det_prod_veicProd_cCor;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_xCor() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_xCor;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_xCor(String nfeProc_NFe_infNFe_det_prod_veicProd_xCor) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_xCor = nfeProc_NFe_infNFe_det_prod_veicProd_xCor;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_pot() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_pot;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_pot(String nfeProc_NFe_infNFe_det_prod_veicProd_pot) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_pot = nfeProc_NFe_infNFe_det_prod_veicProd_pot;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_cilin() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_cilin;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_cilin(String nfeProc_NFe_infNFe_det_prod_veicProd_cilin) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_cilin = nfeProc_NFe_infNFe_det_prod_veicProd_cilin;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_pesoL() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_pesoL;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_pesoL(String nfeProc_NFe_infNFe_det_prod_veicProd_pesoL) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_pesoL = nfeProc_NFe_infNFe_det_prod_veicProd_pesoL;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_pesoB() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_pesoB;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_pesoB(String nfeProc_NFe_infNFe_det_prod_veicProd_pesoB) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_pesoB = nfeProc_NFe_infNFe_det_prod_veicProd_pesoB;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_nSerie() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_nSerie;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_nSerie(String nfeProc_NFe_infNFe_det_prod_veicProd_nSerie) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_nSerie = nfeProc_NFe_infNFe_det_prod_veicProd_nSerie;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_tpComb() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_tpComb;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_tpComb(String nfeProc_NFe_infNFe_det_prod_veicProd_tpComb) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_tpComb = nfeProc_NFe_infNFe_det_prod_veicProd_tpComb;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_nMotor() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_nMotor;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_nMotor(String nfeProc_NFe_infNFe_det_prod_veicProd_nMotor) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_nMotor = nfeProc_NFe_infNFe_det_prod_veicProd_nMotor;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_CMT() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_CMT;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_CMT(String nfeProc_NFe_infNFe_det_prod_veicProd_CMT) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_CMT = nfeProc_NFe_infNFe_det_prod_veicProd_CMT;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_dist() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_dist;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_dist(String nfeProc_NFe_infNFe_det_prod_veicProd_dist) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_dist = nfeProc_NFe_infNFe_det_prod_veicProd_dist;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_anoMod() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_anoMod;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_anoMod(String nfeProc_NFe_infNFe_det_prod_veicProd_anoMod) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_anoMod = nfeProc_NFe_infNFe_det_prod_veicProd_anoMod;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_anoFab() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_anoFab;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_anoFab(String nfeProc_NFe_infNFe_det_prod_veicProd_anoFab) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_anoFab = nfeProc_NFe_infNFe_det_prod_veicProd_anoFab;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_tpPint() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_tpPint;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_tpPint(String nfeProc_NFe_infNFe_det_prod_veicProd_tpPint) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_tpPint = nfeProc_NFe_infNFe_det_prod_veicProd_tpPint;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_tpVeic() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_tpVeic;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_tpVeic(String nfeProc_NFe_infNFe_det_prod_veicProd_tpVeic) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_tpVeic = nfeProc_NFe_infNFe_det_prod_veicProd_tpVeic;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_espVeic() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_espVeic;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_espVeic(String nfeProc_NFe_infNFe_det_prod_veicProd_espVeic) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_espVeic = nfeProc_NFe_infNFe_det_prod_veicProd_espVeic;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_VIN() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_VIN;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_VIN(String nfeProc_NFe_infNFe_det_prod_veicProd_VIN) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_VIN = nfeProc_NFe_infNFe_det_prod_veicProd_VIN;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_condVeic() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_condVeic;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_condVeic(String nfeProc_NFe_infNFe_det_prod_veicProd_condVeic) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_condVeic = nfeProc_NFe_infNFe_det_prod_veicProd_condVeic;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_cMod() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_cMod;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_cMod(String nfeProc_NFe_infNFe_det_prod_veicProd_cMod) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_cMod = nfeProc_NFe_infNFe_det_prod_veicProd_cMod;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_cCorDENATRAN() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_cCorDENATRAN;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_cCorDENATRAN(
			String nfeProc_NFe_infNFe_det_prod_veicProd_cCorDENATRAN) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_cCorDENATRAN = nfeProc_NFe_infNFe_det_prod_veicProd_cCorDENATRAN;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_lota() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_lota;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_lota(String nfeProc_NFe_infNFe_det_prod_veicProd_lota) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_lota = nfeProc_NFe_infNFe_det_prod_veicProd_lota;
	}

	public String getNfeProc_NFe_infNFe_det_prod_veicProd_tpRest() {
		return nfeProc_NFe_infNFe_det_prod_veicProd_tpRest;
	}

	public void setNfeProc_NFe_infNFe_det_prod_veicProd_tpRest(String nfeProc_NFe_infNFe_det_prod_veicProd_tpRest) {
		this.nfeProc_NFe_infNFe_det_prod_veicProd_tpRest = nfeProc_NFe_infNFe_det_prod_veicProd_tpRest;
	}

	public String getNfeProc_NFe_infNFe_det_prod_med_nLote() {
		return nfeProc_NFe_infNFe_det_prod_med_nLote;
	}

	public void setNfeProc_NFe_infNFe_det_prod_med_nLote(String nfeProc_NFe_infNFe_det_prod_med_nLote) {
		this.nfeProc_NFe_infNFe_det_prod_med_nLote = nfeProc_NFe_infNFe_det_prod_med_nLote;
	}

	public String getNfeProc_NFe_infNFe_det_prod_med_qLote() {
		return nfeProc_NFe_infNFe_det_prod_med_qLote;
	}

	public void setNfeProc_NFe_infNFe_det_prod_med_qLote(String nfeProc_NFe_infNFe_det_prod_med_qLote) {
		this.nfeProc_NFe_infNFe_det_prod_med_qLote = nfeProc_NFe_infNFe_det_prod_med_qLote;
	}

	public String getNfeProc_NFe_infNFe_det_prod_med_dFab() {
		return nfeProc_NFe_infNFe_det_prod_med_dFab;
	}

	public void setNfeProc_NFe_infNFe_det_prod_med_dFab(String nfeProc_NFe_infNFe_det_prod_med_dFab) {
		this.nfeProc_NFe_infNFe_det_prod_med_dFab = nfeProc_NFe_infNFe_det_prod_med_dFab;
	}

	public String getNfeProc_NFe_infNFe_det_prod_med_dVal() {
		return nfeProc_NFe_infNFe_det_prod_med_dVal;
	}

	public void setNfeProc_NFe_infNFe_det_prod_med_dVal(String nfeProc_NFe_infNFe_det_prod_med_dVal) {
		this.nfeProc_NFe_infNFe_det_prod_med_dVal = nfeProc_NFe_infNFe_det_prod_med_dVal;
	}

	public String getNfeProc_NFe_infNFe_det_prod_med_vPMC() {
		return nfeProc_NFe_infNFe_det_prod_med_vPMC;
	}

	public void setNfeProc_NFe_infNFe_det_prod_med_vPMC(String nfeProc_NFe_infNFe_det_prod_med_vPMC) {
		this.nfeProc_NFe_infNFe_det_prod_med_vPMC = nfeProc_NFe_infNFe_det_prod_med_vPMC;
	}

	public String getNfeProc_NFe_infNFe_det_prod_arma_tpArma() {
		return nfeProc_NFe_infNFe_det_prod_arma_tpArma;
	}

	public void setNfeProc_NFe_infNFe_det_prod_arma_tpArma(String nfeProc_NFe_infNFe_det_prod_arma_tpArma) {
		this.nfeProc_NFe_infNFe_det_prod_arma_tpArma = nfeProc_NFe_infNFe_det_prod_arma_tpArma;
	}

	public String getNfeProc_NFe_infNFe_det_prod_arma_nSerie() {
		return nfeProc_NFe_infNFe_det_prod_arma_nSerie;
	}

	public void setNfeProc_NFe_infNFe_det_prod_arma_nSerie(String nfeProc_NFe_infNFe_det_prod_arma_nSerie) {
		this.nfeProc_NFe_infNFe_det_prod_arma_nSerie = nfeProc_NFe_infNFe_det_prod_arma_nSerie;
	}

	public String getNfeProc_NFe_infNFe_det_prod_arma_nCano() {
		return nfeProc_NFe_infNFe_det_prod_arma_nCano;
	}

	public void setNfeProc_NFe_infNFe_det_prod_arma_nCano(String nfeProc_NFe_infNFe_det_prod_arma_nCano) {
		this.nfeProc_NFe_infNFe_det_prod_arma_nCano = nfeProc_NFe_infNFe_det_prod_arma_nCano;
	}

	public String getNfeProc_NFe_infNFe_det_prod_arma_descr() {
		return nfeProc_NFe_infNFe_det_prod_arma_descr;
	}

	public void setNfeProc_NFe_infNFe_det_prod_arma_descr(String nfeProc_NFe_infNFe_det_prod_arma_descr) {
		this.nfeProc_NFe_infNFe_det_prod_arma_descr = nfeProc_NFe_infNFe_det_prod_arma_descr;
	}

	public String getNfeProc_NFe_infNFe_det_prod_comb_cProdANP() {
		return nfeProc_NFe_infNFe_det_prod_comb_cProdANP;
	}

	public void setNfeProc_NFe_infNFe_det_prod_comb_cProdANP(String nfeProc_NFe_infNFe_det_prod_comb_cProdANP) {
		this.nfeProc_NFe_infNFe_det_prod_comb_cProdANP = nfeProc_NFe_infNFe_det_prod_comb_cProdANP;
	}

	public String getNfeProc_NFe_infNFe_det_prod_comb_CODIF() {
		return nfeProc_NFe_infNFe_det_prod_comb_CODIF;
	}

	public void setNfeProc_NFe_infNFe_det_prod_comb_CODIF(String nfeProc_NFe_infNFe_det_prod_comb_CODIF) {
		this.nfeProc_NFe_infNFe_det_prod_comb_CODIF = nfeProc_NFe_infNFe_det_prod_comb_CODIF;
	}

	public String getNfeProc_NFe_infNFe_det_prod_comb_qTemp() {
		return nfeProc_NFe_infNFe_det_prod_comb_qTemp;
	}

	public void setNfeProc_NFe_infNFe_det_prod_comb_qTemp(String nfeProc_NFe_infNFe_det_prod_comb_qTemp) {
		this.nfeProc_NFe_infNFe_det_prod_comb_qTemp = nfeProc_NFe_infNFe_det_prod_comb_qTemp;
	}

	public String getNfeProc_NFe_infNFe_det_prod_comb_UFCons() {
		return nfeProc_NFe_infNFe_det_prod_comb_UFCons;
	}

	public void setNfeProc_NFe_infNFe_det_prod_comb_UFCons(String nfeProc_NFe_infNFe_det_prod_comb_UFCons) {
		this.nfeProc_NFe_infNFe_det_prod_comb_UFCons = nfeProc_NFe_infNFe_det_prod_comb_UFCons;
	}

	public String getNfeProc_NFe_infNFe_det_prod_comb_CIDE_qBCProd() {
		return nfeProc_NFe_infNFe_det_prod_comb_CIDE_qBCProd;
	}

	public void setNfeProc_NFe_infNFe_det_prod_comb_CIDE_qBCProd(
			String nfeProc_NFe_infNFe_det_prod_comb_CIDE_qBCProd) {
		this.nfeProc_NFe_infNFe_det_prod_comb_CIDE_qBCProd = nfeProc_NFe_infNFe_det_prod_comb_CIDE_qBCProd;
	}

	public String getNfeProc_NFe_infNFe_det_prod_comb_CIDE_vAliqProd() {
		return nfeProc_NFe_infNFe_det_prod_comb_CIDE_vAliqProd;
	}

	public void setNfeProc_NFe_infNFe_det_prod_comb_CIDE_vAliqProd(
			String nfeProc_NFe_infNFe_det_prod_comb_CIDE_vAliqProd) {
		this.nfeProc_NFe_infNFe_det_prod_comb_CIDE_vAliqProd = nfeProc_NFe_infNFe_det_prod_comb_CIDE_vAliqProd;
	}

	public String getNfeProc_NFe_infNFe_det_prod_comb_CIDE_vCIDE() {
		return nfeProc_NFe_infNFe_det_prod_comb_CIDE_vCIDE;
	}

	public void setNfeProc_NFe_infNFe_det_prod_comb_CIDE_vCIDE(String nfeProc_NFe_infNFe_det_prod_comb_CIDE_vCIDE) {
		this.nfeProc_NFe_infNFe_det_prod_comb_CIDE_vCIDE = nfeProc_NFe_infNFe_det_prod_comb_CIDE_vCIDE;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_CST(String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_modBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_modBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_modBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_modBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_modBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_modBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_pICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_pICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_pICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_pICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_pICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_pICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS00_vICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_CST(String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_modBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pMVAST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pMVAST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pMVAST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pMVAST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pMVAST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pMVAST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pRedBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pRedBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pRedBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pRedBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pRedBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pRedBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_pICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS10_vICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_CST(String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_modBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_modBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_modBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_modBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_modBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_modBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pRedBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pRedBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pRedBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pRedBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pRedBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pRedBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_pICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS20_vICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_CST(String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_modBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_modBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_modBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_modBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_modBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_modBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pMVAST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pMVAST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pMVAST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pMVAST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pMVAST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pMVAST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pRedBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pRedBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pRedBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pRedBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pRedBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pRedBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_pICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS30_vICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_CST(String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_vICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_vICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_vICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_vICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_vICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_vICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_motDesICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_motDesICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_motDesICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_motDesICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_motDesICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS40_motDesICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_CST(String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_modBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_modBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_modBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_modBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_modBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_modBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pRedBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pRedBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pRedBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pRedBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pRedBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pRedBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_pICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS51_vICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_CST(String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vBCSTRet() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vBCSTRet;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vBCSTRet(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vBCSTRet) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vBCSTRet = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vBCSTRet;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vICMSSTRet() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vICMSSTRet;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vICMSSTRet(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vICMSSTRet) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vICMSSTRet = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS60_vICMSSTRet;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_CST(String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_modBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pMVAST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pMVAST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pMVAST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pMVAST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pMVAST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pMVAST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pRedBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_pICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS70_vICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_CST(String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_modBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pMVAST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pMVAST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pMVAST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pMVAST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pMVAST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pMVAST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pRedBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_pICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMS90_vICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_CST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_modBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pMVAST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pMVAST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pMVAST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pMVAST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pMVAST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pMVAST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pRedBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_vICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pBCOp() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pBCOp;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pBCOp(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pBCOp) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pBCOp = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_pBCOp;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_UFST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_UFST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_UFST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_UFST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_UFST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSPart_UFST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_CST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_CST(String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_CST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTRet() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTRet;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTRet(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTRet) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTRet = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTRet;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTRet() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTRet;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTRet(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTRet) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTRet = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTRet;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTDest() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTDest;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTDest(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTDest) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTDest = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vBCSTDest;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTDest() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTDest;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTDest(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTDest) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTDest = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSST_vICMSSTDest;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_CSOSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_CSOSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_CSOSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_CSOSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_CSOSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_CSOSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_pCredSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_pCredSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_pCredSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_pCredSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_pCredSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_pCredSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_vCredICMSSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_vCredICMSSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_vCredICMSSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_vCredICMSSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_vCredICMSSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN101_vCredICMSSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_CSOSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_CSOSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_CSOSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_CSOSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_CSOSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN102_CSOSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_CSOSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_CSOSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_CSOSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_CSOSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_CSOSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_CSOSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_modBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_modBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_modBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_modBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_modBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_modBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pMVAST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pMVAST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pMVAST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pMVAST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pMVAST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pMVAST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pRedBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pRedBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pRedBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pRedBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pRedBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pRedBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pCredSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pCredSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pCredSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pCredSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pCredSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_pCredSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vCredICMSSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vCredICMSSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vCredICMSSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vCredICMSSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vCredICMSSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN201_vCredICMSSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_CSOSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_CSOSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_CSOSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_CSOSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_CSOSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_CSOSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_modBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_modBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_modBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_modBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_modBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_modBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pMVAST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pMVAST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pMVAST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pMVAST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pMVAST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pMVAST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pRedBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pRedBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pRedBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pRedBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pRedBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pRedBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_pICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN202_vICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_CSOSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_CSOSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_CSOSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_CSOSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_CSOSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_CSOSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vBCSTRet() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vBCSTRet;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vBCSTRet(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vBCSTRet) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vBCSTRet = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vBCSTRet;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vICMSSTRet() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vICMSSTRet;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vICMSSTRet(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vICMSSTRet) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vICMSSTRet = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN500_vICMSSTRet;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_orig() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_orig;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_orig(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_orig) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_orig = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_orig;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_CSOSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_CSOSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_CSOSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_CSOSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_CSOSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_CSOSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBC() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBC(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBC = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMS() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMS(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMS) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMS = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_modBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pMVAST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pMVAST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pMVAST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pMVAST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pMVAST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pMVAST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pRedBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBCST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBCST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBCST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBCST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBCST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vBCST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMSST() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMSST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMSST(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMSST) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMSST = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vICMSST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pCredSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pCredSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pCredSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pCredSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pCredSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_pCredSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vCredICMSSN() {
		return nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vCredICMSSN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vCredICMSSN(
			String nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vCredICMSSN) {
		this.nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vCredICMSSN = nfeProc_NFe_infNFe_det_imposto_ICMS_ICMSSN900_vCredICMSSN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_clEnq() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_clEnq;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_clEnq(String nfeProc_NFe_infNFe_det_imposto_IPI_clEnq) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_clEnq = nfeProc_NFe_infNFe_det_imposto_IPI_clEnq;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_CNPJProd() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_CNPJProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_CNPJProd(String nfeProc_NFe_infNFe_det_imposto_IPI_CNPJProd) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_CNPJProd = nfeProc_NFe_infNFe_det_imposto_IPI_CNPJProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_cSelo() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_cSelo;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_cSelo(String nfeProc_NFe_infNFe_det_imposto_IPI_cSelo) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_cSelo = nfeProc_NFe_infNFe_det_imposto_IPI_cSelo;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_qSelo() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_qSelo;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_qSelo(String nfeProc_NFe_infNFe_det_imposto_IPI_qSelo) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_qSelo = nfeProc_NFe_infNFe_det_imposto_IPI_qSelo;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_cEnq() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_cEnq;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_cEnq(String nfeProc_NFe_infNFe_det_imposto_IPI_cEnq) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_cEnq = nfeProc_NFe_infNFe_det_imposto_IPI_cEnq;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_CST() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_CST(String nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_CST = nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vBC(
			String nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vBC = nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_pIPI() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_pIPI;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_pIPI(
			String nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_pIPI) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_pIPI = nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_pIPI;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_qUnid() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_qUnid;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_qUnid(
			String nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_qUnid) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_qUnid = nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_qUnid;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vUnid() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vUnid;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vUnid(
			String nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vUnid) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vUnid = nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vUnid;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vIPI() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vIPI;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vIPI(
			String nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vIPI) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vIPI = nfeProc_NFe_infNFe_det_imposto_IPI_IPITrib_vIPI;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_IPI_IPINT_CST() {
		return nfeProc_NFe_infNFe_det_imposto_IPI_IPINT_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_IPI_IPINT_CST(String nfeProc_NFe_infNFe_det_imposto_IPI_IPINT_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_IPI_IPINT_CST = nfeProc_NFe_infNFe_det_imposto_IPI_IPINT_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_II_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_II_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_II_vBC(String nfeProc_NFe_infNFe_det_imposto_II_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_II_vBC = nfeProc_NFe_infNFe_det_imposto_II_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_II_vDespAdu() {
		return nfeProc_NFe_infNFe_det_imposto_II_vDespAdu;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_II_vDespAdu(String nfeProc_NFe_infNFe_det_imposto_II_vDespAdu) {
		this.nfeProc_NFe_infNFe_det_imposto_II_vDespAdu = nfeProc_NFe_infNFe_det_imposto_II_vDespAdu;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_II_vII() {
		return nfeProc_NFe_infNFe_det_imposto_II_vII;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_II_vII(String nfeProc_NFe_infNFe_det_imposto_II_vII) {
		this.nfeProc_NFe_infNFe_det_imposto_II_vII = nfeProc_NFe_infNFe_det_imposto_II_vII;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_II_vIOF() {
		return nfeProc_NFe_infNFe_det_imposto_II_vIOF;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_II_vIOF(String nfeProc_NFe_infNFe_det_imposto_II_vIOF) {
		this.nfeProc_NFe_infNFe_det_imposto_II_vIOF = nfeProc_NFe_infNFe_det_imposto_II_vIOF;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ISSQN_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_ISSQN_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ISSQN_vBC(String nfeProc_NFe_infNFe_det_imposto_ISSQN_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_ISSQN_vBC = nfeProc_NFe_infNFe_det_imposto_ISSQN_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ISSQN_vAliq() {
		return nfeProc_NFe_infNFe_det_imposto_ISSQN_vAliq;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ISSQN_vAliq(String nfeProc_NFe_infNFe_det_imposto_ISSQN_vAliq) {
		this.nfeProc_NFe_infNFe_det_imposto_ISSQN_vAliq = nfeProc_NFe_infNFe_det_imposto_ISSQN_vAliq;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ISSQN_vISSQN() {
		return nfeProc_NFe_infNFe_det_imposto_ISSQN_vISSQN;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ISSQN_vISSQN(String nfeProc_NFe_infNFe_det_imposto_ISSQN_vISSQN) {
		this.nfeProc_NFe_infNFe_det_imposto_ISSQN_vISSQN = nfeProc_NFe_infNFe_det_imposto_ISSQN_vISSQN;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ISSQN_cMunFG() {
		return nfeProc_NFe_infNFe_det_imposto_ISSQN_cMunFG;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ISSQN_cMunFG(String nfeProc_NFe_infNFe_det_imposto_ISSQN_cMunFG) {
		this.nfeProc_NFe_infNFe_det_imposto_ISSQN_cMunFG = nfeProc_NFe_infNFe_det_imposto_ISSQN_cMunFG;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ISSQN_cListServ() {
		return nfeProc_NFe_infNFe_det_imposto_ISSQN_cListServ;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ISSQN_cListServ(String nfeProc_NFe_infNFe_det_imposto_ISSQN_cListServ) {
		this.nfeProc_NFe_infNFe_det_imposto_ISSQN_cListServ = nfeProc_NFe_infNFe_det_imposto_ISSQN_cListServ;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_ISSQN_cSitTrib() {
		return nfeProc_NFe_infNFe_det_imposto_ISSQN_cSitTrib;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_ISSQN_cSitTrib(String nfeProc_NFe_infNFe_det_imposto_ISSQN_cSitTrib) {
		this.nfeProc_NFe_infNFe_det_imposto_ISSQN_cSitTrib = nfeProc_NFe_infNFe_det_imposto_ISSQN_cSitTrib;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_CST() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_CST(String nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_CST = nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vBC(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vBC = nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_pPIS() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_pPIS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_pPIS(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_pPIS) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_pPIS = nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_pPIS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vPIS() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vPIS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vPIS(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vPIS) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vPIS = nfeProc_NFe_infNFe_det_imposto_PIS_PISAliq_vPIS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_CST() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_CST(String nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_CST = nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_qBCProd() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_qBCProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_qBCProd(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_qBCProd) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_qBCProd = nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_qBCProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vAliqProd() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vAliqProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vAliqProd(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vAliqProd) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vAliqProd = nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vAliqProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vPIS() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vPIS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vPIS(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vPIS) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vPIS = nfeProc_NFe_infNFe_det_imposto_PIS_PISQtde_vPIS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISNT_CST() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISNT_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISNT_CST(String nfeProc_NFe_infNFe_det_imposto_PIS_PISNT_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISNT_CST = nfeProc_NFe_infNFe_det_imposto_PIS_PISNT_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_CST() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_CST(String nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_CST = nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vBC(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vBC = nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_pPIS() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_pPIS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_pPIS(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_pPIS) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_pPIS = nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_pPIS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_qBCProd() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_qBCProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_qBCProd(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_qBCProd) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_qBCProd = nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_qBCProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vAliqProd() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vAliqProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vAliqProd(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vAliqProd) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vAliqProd = nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vAliqProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vPIS() {
		return nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vPIS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vPIS(
			String nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vPIS) {
		this.nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vPIS = nfeProc_NFe_infNFe_det_imposto_PIS_PISOutr_vPIS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PISST_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_PISST_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PISST_vBC(String nfeProc_NFe_infNFe_det_imposto_PISST_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_PISST_vBC = nfeProc_NFe_infNFe_det_imposto_PISST_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PISST_pPIS() {
		return nfeProc_NFe_infNFe_det_imposto_PISST_pPIS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PISST_pPIS(String nfeProc_NFe_infNFe_det_imposto_PISST_pPIS) {
		this.nfeProc_NFe_infNFe_det_imposto_PISST_pPIS = nfeProc_NFe_infNFe_det_imposto_PISST_pPIS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PISST_qBCProd() {
		return nfeProc_NFe_infNFe_det_imposto_PISST_qBCProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PISST_qBCProd(String nfeProc_NFe_infNFe_det_imposto_PISST_qBCProd) {
		this.nfeProc_NFe_infNFe_det_imposto_PISST_qBCProd = nfeProc_NFe_infNFe_det_imposto_PISST_qBCProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PISST_vAliqProd() {
		return nfeProc_NFe_infNFe_det_imposto_PISST_vAliqProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PISST_vAliqProd(
			String nfeProc_NFe_infNFe_det_imposto_PISST_vAliqProd) {
		this.nfeProc_NFe_infNFe_det_imposto_PISST_vAliqProd = nfeProc_NFe_infNFe_det_imposto_PISST_vAliqProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_PISST_vPIS() {
		return nfeProc_NFe_infNFe_det_imposto_PISST_vPIS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_PISST_vPIS(String nfeProc_NFe_infNFe_det_imposto_PISST_vPIS) {
		this.nfeProc_NFe_infNFe_det_imposto_PISST_vPIS = nfeProc_NFe_infNFe_det_imposto_PISST_vPIS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_CST() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_CST(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_CST = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vBC(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vBC = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_pCOFINS() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_pCOFINS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_pCOFINS(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_pCOFINS) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_pCOFINS = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_pCOFINS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vCOFINS() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vCOFINS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vCOFINS(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vCOFINS) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vCOFINS = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSAliq_vCOFINS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_CST() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_CST(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_CST = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_qBCProd() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_qBCProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_qBCProd(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_qBCProd) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_qBCProd = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_qBCProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vAliqProd() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vAliqProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vAliqProd(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vAliqProd) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vAliqProd = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vAliqProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vCOFINS() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vCOFINS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vCOFINS(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vCOFINS) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vCOFINS = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSQtde_vCOFINS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSNT_CST() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSNT_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSNT_CST(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSNT_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSNT_CST = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSNT_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_CST() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_CST;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_CST(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_CST) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_CST = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_CST;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vBC(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vBC = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_pCOFINS() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_pCOFINS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_pCOFINS(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_pCOFINS) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_pCOFINS = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_pCOFINS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_qBCProd() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_qBCProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_qBCProd(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_qBCProd) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_qBCProd = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_qBCProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vAliqProd() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vAliqProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vAliqProd(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vAliqProd) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vAliqProd = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vAliqProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vCOFINS() {
		return nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vCOFINS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vCOFINS(
			String nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vCOFINS) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vCOFINS = nfeProc_NFe_infNFe_det_imposto_COFINS_COFINSOutr_vCOFINS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINSST_vBC() {
		return nfeProc_NFe_infNFe_det_imposto_COFINSST_vBC;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINSST_vBC(String nfeProc_NFe_infNFe_det_imposto_COFINSST_vBC) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINSST_vBC = nfeProc_NFe_infNFe_det_imposto_COFINSST_vBC;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINSST_pCOFINS() {
		return nfeProc_NFe_infNFe_det_imposto_COFINSST_pCOFINS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINSST_pCOFINS(
			String nfeProc_NFe_infNFe_det_imposto_COFINSST_pCOFINS) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINSST_pCOFINS = nfeProc_NFe_infNFe_det_imposto_COFINSST_pCOFINS;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINSST_qBCProd() {
		return nfeProc_NFe_infNFe_det_imposto_COFINSST_qBCProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINSST_qBCProd(
			String nfeProc_NFe_infNFe_det_imposto_COFINSST_qBCProd) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINSST_qBCProd = nfeProc_NFe_infNFe_det_imposto_COFINSST_qBCProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINSST_vAliqProd() {
		return nfeProc_NFe_infNFe_det_imposto_COFINSST_vAliqProd;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINSST_vAliqProd(
			String nfeProc_NFe_infNFe_det_imposto_COFINSST_vAliqProd) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINSST_vAliqProd = nfeProc_NFe_infNFe_det_imposto_COFINSST_vAliqProd;
	}

	public String getNfeProc_NFe_infNFe_det_imposto_COFINSST_vCOFINS() {
		return nfeProc_NFe_infNFe_det_imposto_COFINSST_vCOFINS;
	}

	public void setNfeProc_NFe_infNFe_det_imposto_COFINSST_vCOFINS(
			String nfeProc_NFe_infNFe_det_imposto_COFINSST_vCOFINS) {
		this.nfeProc_NFe_infNFe_det_imposto_COFINSST_vCOFINS = nfeProc_NFe_infNFe_det_imposto_COFINSST_vCOFINS;
	}

	public String getNfeProc_NFe_infNFe_det_infAdProd() {
		return nfeProc_NFe_infNFe_det_infAdProd;
	}

	public void setNfeProc_NFe_infNFe_det_infAdProd(String nfeProc_NFe_infNFe_det_infAdProd) {
		this.nfeProc_NFe_infNFe_det_infAdProd = nfeProc_NFe_infNFe_det_infAdProd;
	}

	public DetDashboardEntity createDetDashboard(DashboardEntity dashboard) {
		DetDashboardEntity det = new DetDashboardEntity();
		det.setUser(dashboard.getUser());
		det.setChNFe(dashboard.getChNFe());

		det.setNfeProc_NFe_infNFe_ide_dEmi(dashboard.getNfeProc_NFe_infNFe_ide_dEmi());
		det.setMonth(dashboard.getMonth());
		det.setYear(dashboard.getYear());
		det.setYearMonth(dashboard.getYearMonth());
		det.setNfeProc_NFe_infNFe_dest_xNome(dashboard.getNfeProc_NFe_infNFe_dest_xNome());
		det.setNfeProc_NFe_infNFe_dest_enderDest_UF(dashboard.getNfeProc_NFe_infNFe_dest_enderDest_UF());

		det.setNfeProc_NFe_infNFe_det_prod_cProd(nfeProc_NFe_infNFe_det_prod_cProd);
		det.setNfeProc_NFe_infNFe_det_prod_qCom(createBigDecimal(nfeProc_NFe_infNFe_det_prod_qCom));
		det.setNfeProc_NFe_infNFe_det_prod_uCom(nfeProc_NFe_infNFe_det_prod_uCom);
		det.setNfeProc_NFe_infNFe_det_prod_vProd(createBigDecimal(nfeProc_NFe_infNFe_det_prod_vProd));
		det.setNfeProc_NFe_infNFe_det_prod_vUnCom(createBigDecimal(nfeProc_NFe_infNFe_det_prod_vUnCom));
		det.setNfeProc_NFe_infNFe_det_prod_xProd(nfeProc_NFe_infNFe_det_prod_xProd);

		return det;
	}

	private BigDecimal createBigDecimal(String valor) {
		if (valor == null)
			return new BigDecimal(0);
		return new BigDecimal(valor);
	}
}
