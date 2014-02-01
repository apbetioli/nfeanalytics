package com.nfeanalytics.control.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.nfeanalytics.model.DashboardRepository;
import com.nfeanalytics.model.NFeRepository;
import com.nfeanalytics.model.XmlRepository;

@SuppressWarnings("serial")
public class DeleteAllRegistersServlet extends HttpServlet {

	private static final Logger	LOGGER	= Logger.getLogger(DeleteAllRegistersServlet.class.getName());

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userEmail = req.getParameter("userEmail");

		if (!StringUtils.isBlank(userEmail)) {
			LOGGER.log(Level.INFO, "##Start delete all");
			deleteXMLAll(userEmail);
			LOGGER.log(Level.INFO, "##Finish delete all ");
		}

	}

	private void deleteXMLAll(String user) {
		DashboardRepository.getInstance().deleteByUserWithChilds(user);
		NFeRepository.getInstance().deleteByUserWithChilds(user);
		XmlRepository.getInstance().deleteByUser(user);
	}

}
