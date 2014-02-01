package com.nfeanalytics.control.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest sreq, ServletResponse sres,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) sreq;
		HttpServletResponse res = (HttpServletResponse) sres;

		UserService userService = UserServiceFactory.getUserService();

		User user = userService.getCurrentUser();

		if (user != null) {
			chain.doFilter(req, res);

		} else {
			res.sendRedirect(userService.createLoginURL(req.getRequestURI()));
		}

	}

}
