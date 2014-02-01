package com.nfeanalytics.control.filter;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

import org.apache.commons.lang3.StringUtils;

public class LanguageFilter implements Filter {

	private static final String	LANG	= "lang";

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest sreq, ServletResponse sres, FilterChain chain) throws IOException,
			ServletException {
		HttpServletRequest req = (HttpServletRequest) sreq;
		HttpServletResponse res = (HttpServletResponse) sres;

		String language = req.getParameter(LANG);
		String langCookie = recuperarCookie(req, LANG);

		if (!StringUtils.isEmpty(language)) {
			setLanguage(sreq, res, req, language);

		} else if (!StringUtils.isEmpty(langCookie)) {
			setLanguage(sreq, res, req, langCookie);

		} else {
			setLanguage(sreq, res, req, req.getLocale().toString());
		}

		chain.doFilter(req, res);

	}

	private String recuperarCookie(HttpServletRequest req, String lang) {
		Cookie cookies[] = req.getCookies();

		if (cookies == null)
			return null;

		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals(lang)) {
				return cookies[i].getValue();
			}
		}

		return null;
	}

	private void setLanguage(ServletRequest sreq, HttpServletResponse res, HttpServletRequest req, String language) {
		Locale locale = new Locale(language);

		res.setLocale(locale);

		Config.set(sreq, Config.FMT_LOCALE, locale);
		Config.set(sreq, Config.FMT_FALLBACK_LOCALE, locale);

		Cookie cookie = new Cookie(LANG, language);
		cookie.setMaxAge(365 * 24 * 60 * 60);
		res.addCookie(cookie);

		req.setAttribute("language", language);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
