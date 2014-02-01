package com.nfeanalytics.model;

import javax.persistence.EntityManager;

import com.nfeanalytics.core.EMF;

public abstract class SuperRepository<T extends SuperEntity> {

	protected EntityManager em() {
		return EMF.em();
	}

}
