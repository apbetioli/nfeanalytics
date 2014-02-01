package com.nfeanalytics.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.nfeanalytics.core.EMF;

public abstract class TransactionalFragment {

	protected abstract void doInTransaction() throws Exception;

	public TransactionalFragment() {
	}

	public void execute() {
		EntityManager entityManager = EMF.em();
		EntityTransaction tx = entityManager.getTransaction();
		try {
			tx.begin();

			doInTransaction();

			if (tx.isActive())
				tx.commit();

		} catch (Exception e) {
			e.printStackTrace();

			if (tx.isActive())
				tx.rollback();

			throw new RuntimeException(e);

		} finally {
			if (tx.isActive())
				tx.rollback();

			EMF.close();
		}
	}

}
