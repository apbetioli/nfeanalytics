package com.nfeanalytics.control.servlet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserServiceFactory;
import com.nfeanalytics.model.DashboardRepository;
import com.nfeanalytics.model.NFeRepository;
import com.nfeanalytics.model.XmlEntity;
import com.nfeanalytics.model.XmlRepository;

@SuppressWarnings("serial")
public class XMLServlet extends HttpServlet {

	private static final int	BUFFER_SIZE	= 12228;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		User user = UserServiceFactory.getUserService().getCurrentUser();

		Queue queue = QueueFactory.getDefaultQueue();
		queue.add(TaskOptions.Builder.withUrl("/deleteAll").method(TaskOptions.Method.POST)
				.param("userEmail", user.getEmail()));

		resp.sendRedirect("/xml?deleteAll=true");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String chNFe = req.getParameter("param_chNFe");
		String action = req.getParameter("param_action");
		String user = UserServiceFactory.getUserService().getCurrentUser().getEmail();

		if (!StringUtils.isBlank(chNFe) && !StringUtils.isBlank(action)) {
			if ("download".equals(action)) {
				downloadXML(resp, chNFe, user);
			} else if ("delete".equals(action)) {
				deleteXML(chNFe, user);
				resp.sendRedirect("/xml");
			}
			return;
		}

		List<XmlEntity> listXML = XmlRepository.getInstance().findByUser(
				user);

		List<XmlEntity> listXMLSemVazio = new ArrayList<XmlEntity>();

		for (XmlEntity xmlEntity : listXML) {

			if (!StringUtils.isBlank(xmlEntity.getChNFe()))
				listXMLSemVazio.add(xmlEntity);

		}

		req.setAttribute("listXML", listXMLSemVazio);

		req.getRequestDispatcher("/jsp/nfe_imported.jsp").forward(req, resp);
	}

	private void deleteXML(String chNFe, String user) {
		DashboardRepository.getInstance().deleteByChNFeWithChilds(chNFe, user);
		NFeRepository.getInstance().deleteByChNFeWithChilds(chNFe, user);
		XmlRepository.getInstance().deleteByChNFe(chNFe, user);
	}

	private void downloadXML(HttpServletResponse resp, String chNFe, String user) throws IOException {
		try {
			XmlEntity xml = XmlRepository.getInstance().findByChNFe(chNFe, user);

			String fileName = xml.getChNFe() + "-procNFe.xml";
			InputStream inputStream = new ByteArrayInputStream(xml.getXml().getBytes());
			int fileLength = inputStream.available();
			ServletContext context = getServletContext();
			String mimeType = context.getMimeType(fileName);

			if (mimeType == null) {
				mimeType = "application/octet-stream";
			}

			resp.setContentType(mimeType);
			resp.setContentLength(fileLength);
			String headerKey = "Content-Disposition";
			String headerValue = String.format("attachment; filename=\"%s\"", fileName);
			resp.setHeader(headerKey, headerValue);

			OutputStream outStream = resp.getOutputStream();

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead = -1;

			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outStream.write(buffer, 0, bytesRead);
			}

			inputStream.close();
			outStream.close();

		} catch (NoResultException e) {
			return;
		}
	}

}
