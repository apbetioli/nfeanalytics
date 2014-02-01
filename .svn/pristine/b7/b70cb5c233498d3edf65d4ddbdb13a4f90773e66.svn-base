package com.nfeanalytics.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.google.appengine.api.datastore.Blob;
import com.google.gson.annotations.Expose;
import com.nfeanalytics.util.DataUtil;

/**
 * @author Alexandre
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "XmlEntity.findPendentes", query = ""
				+ "select obj               "
				+ "  from XmlEntity obj     "
				+ " where obj.chNFe is null "),
		@NamedQuery(name = "XmlEntity.findByUser", query = ""
				+ "select obj               "
				+ "  from XmlEntity obj     "
				+ " where obj.user =:user"),
		@NamedQuery(name = "XmlEntity.findByChNFe", query = ""
				+ "select obj               "
				+ "  from XmlEntity obj     "
				+ " where obj.chNFe =:chNFe"
				+ "   and obj.user  = :user"),
		@NamedQuery(name = "XmlEntity.deleteByChNFe", query = ""
				+ "delete                       "
				+ "  from XmlEntity obj         "
				+ " where obj.chNFe is not null "
				+ "   and obj.chNFe = :chNFe    "
				+ "   and obj.user  = :user")
})
public class XmlEntity extends SuperEntity {

	@Expose
	private String	chNFe;

	@Basic
	private Blob	xml;

	@Expose
	private Date	uploadDate;

	@Expose
	private boolean	processingError;

	public XmlEntity() {
	}

	public XmlEntity(String user, Blob xml) {
		super();
		setUser(user);
		this.xml = xml;
	}

	public Blob getXml() {
		return xml;
	}

	public void setXml(Blob xml) {
		this.xml = xml;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public boolean isProcessingError() {
		return processingError;
	}

	public void setProcessingError(boolean processingError) {
		this.processingError = processingError;
	}

	public String getUploadDateString() {
		return DataUtil.parseToString(uploadDate);
	}

	@Override
	public void persist() {
		setUploadDate(new Date());

		super.persist();
	}

	@Override
	public String toString() {

		return this.getChNFe();
	}

}
