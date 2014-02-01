package com.nfeanalytics.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
		@NamedQuery(name = "ApiKeyEntity.findByUser", query = ""
				+ "select obj              "
				+ "  from ApiKeyEntity obj "
				+ " where obj.user = :user "),

		@NamedQuery(name = "ApiKeyEntity.findUserByKey", query = ""
				+ "select obj.user         "
				+ "  from ApiKeyEntity obj "
				+ " where obj.key = :key   ")
})
public class ApiKeyEntity extends SuperEntity {

	private String	key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
