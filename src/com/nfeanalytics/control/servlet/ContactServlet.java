package com.nfeanalytics.control.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactServlet extends HttpServlet {

	private static final Logger	LOGGER	= Logger.getLogger(ContactServlet.class.getName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/jsp/contact.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String comment = req.getParameter("comment");

		String msgBody = "Name: " + name + "\nEmail: " + email + "\nComment: " + comment;
		String subject = "Contact " + name + " - " + email;

		sendEmail(name, "nfeanalytics@gmail.com", subject, msgBody, req);

		if ("pt_BR".equals(req.getLocale().toString()))
			sendEmail(name, email, "Contato NFe Analytics",
					"Obrigado pelo seu contato,\nem breve estaremos entrando em contato!\n\nEquipe NFe Analytics.",
					req);
		else
			sendEmail(name, email, "NFe Analytics Contact",
					"Thanks for your contact,\nwe will soon be getting in touch!\n\nNFe Analytics team.", req);

		req.setAttribute("sucessSend", "true");
		req.getRequestDispatcher("/jsp/contact.jsp").forward(req, resp);
	}

	private void sendEmail(String name, String email, String subject, String msgBody, HttpServletRequest req)
			throws UnsupportedEncodingException {

		Properties props = new Properties();
		Session session = Session.getDefaultInstance(props, null);
		try {
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress("nfeanalytics@gmail.com", "NFe Analytics Contact"));
			msg.addRecipient(Message.RecipientType.TO,
					new InternetAddress(email, "NFe Analytics"));
			msg.setSubject(subject);
			msg.setText(msgBody);
			Transport.send(msg);

		} catch (AddressException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			req.setAttribute("sucessSend", "false");
		} catch (MessagingException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			req.setAttribute("sucessSend", "false");
		}
	}
}
