package com.nfeanalytics.control.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserServiceFactory;
import com.nfeanalytics.model.DashboardRepository;
import com.nfeanalytics.model.XmlRepository;

public class AjaxUploadServlet extends HttpServlet {

	private static final Logger	LOGGER	= Logger.getLogger(AjaxUploadServlet.class.getName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = UserServiceFactory.getUserService().getCurrentUser();

		DashboardRepository.getInstance().updateChannels(user.getEmail(), req.getParameterMap());
	}

	@Override
	protected void doPost(final HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		User user = UserServiceFactory.getUserService().getCurrentUser();
		final String userEmail = user.getEmail();

		try {

			FileItemIterator iterator = new ServletFileUpload().getItemIterator(req);
			while (iterator.hasNext()) {
				final FileItemStream item = iterator.next();

				if (!"text/xml".equals(item.getContentType()))
					continue;

				final byte[] xml = IOUtils.toByteArray(item.openStream());

				XmlRepository.getInstance().processar(userEmail, xml, item.getName());
			}

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			throw new ServletException(e);
		}
	}

}
