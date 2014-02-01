package com.nfeanalytics.control.servlet;

import java.io.IOException;

import javax.persistence.NoResultException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserServiceFactory;
import com.nfeanalytics.model.ApiKeyEntity;
import com.nfeanalytics.model.ApiKeyRepository;

public class ApiKeyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = UserServiceFactory.getUserService().getCurrentUser();
		final String userEmail = user.getEmail();

		ApiKeyEntity apiKey = null;
		if (req.getParameterMap().containsKey("generate")) {
			apiKey = ApiKeyRepository.getInstance().createOrReplaceApiKey(userEmail);

		} else {
			try {
				apiKey = ApiKeyRepository.getInstance().findByUser(userEmail);
			} catch (NoResultException e) {
			}
		}

		req.setAttribute("apiKey", apiKey);

		req.getRequestDispatcher("/jsp/api_key.jsp").forward(req, resp);
	}

}
