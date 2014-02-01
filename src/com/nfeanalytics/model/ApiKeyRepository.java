package com.nfeanalytics.model;

import java.util.UUID;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.apache.commons.lang3.StringUtils;

public class ApiKeyRepository extends SuperRepository {

	private static final ApiKeyRepository	instance	= new ApiKeyRepository();

	public static ApiKeyRepository getInstance() {
		return instance;
	}

	private String gerar() {
		return UUID.randomUUID().toString();
	}

	public ApiKeyEntity createOrReplaceApiKey(String user) {
		try {
			ApiKeyEntity apikey = findByUser(user);
			apikey.setKey(gerar());
			return apikey.merge();
		} catch (NoResultException e) {
			ApiKeyEntity apikey = new ApiKeyEntity();
			apikey.setKey(gerar());
			apikey.persist();
			return apikey;
		}
	}

	public ApiKeyEntity findByUser(String user) {
		Query query = em().createNamedQuery("ApiKeyEntity.findByUser");
		query.setParameter("user", user);
		return (ApiKeyEntity) query.getSingleResult();
	}

	public String findUserByKey(String key) {
		if (StringUtils.isBlank(key))
			throw new NoResultException(key);

		Query query = em().createNamedQuery("ApiKeyEntity.findUserByKey");
		query.setParameter("key", key);
		return (String) query.getSingleResult();
	}
}
