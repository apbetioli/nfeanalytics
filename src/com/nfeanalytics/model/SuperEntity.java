package com.nfeanalytics.model;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gson.annotations.Expose;
import com.nfeanalytics.core.EMF;

@MappedSuperclass
public abstract class SuperEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key		id;

	@Expose
	private String	user;

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SuperEntity))
			return false;
		SuperEntity other = (SuperEntity) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}

	protected EntityManager em() {
		return EMF.em();
	}

	public void persist() {
		User user = UserServiceFactory.getUserService().getCurrentUser();
		if (this.getUser() == null && user != null)
			this.setUser(user.getEmail());

		em().persist(this);
	}

	public <T extends SuperEntity> T merge() {
		return (T) em().merge(this);
	}

	public void remove() {
		em().remove(this);
	}

	public <T extends SuperEntity> T find() {
		return (T) em().find(getClass(), getId());
	}

}
