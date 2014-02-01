package com.nfeanalytics.core;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EMF {

	private static final Logger					LOGGER		= Logger.getLogger(EMF.class.getName());

	private static final EntityManagerFactory	factory		= Persistence
																	.createEntityManagerFactory("transactions-optional");

	private static ThreadLocal<EntityManager>	threadLocal	= new ThreadLocal<EntityManager>();

	public static EntityManager em() {
		EntityManager entityManager = threadLocal.get();
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
			threadLocal.set(entityManager);
			// LOGGER.info("EntityManager created");
		}
		return entityManager;
	}

	public static void close() {
		EntityManager entityManager = threadLocal.get();
		if (entityManager != null) {
			threadLocal.remove();
			if (entityManager.isOpen()) {
				entityManager.close();
				// LOGGER.info("EntityManager closed");
			}
		}
	}

}