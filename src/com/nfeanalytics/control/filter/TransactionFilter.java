package com.nfeanalytics.control.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.nfeanalytics.util.TransactionalFragment;

public class TransactionFilter implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(final ServletRequest req, final ServletResponse res,
			final FilterChain chain) throws IOException, ServletException {

		TransactionalFragment tx = new TransactionalFragment() {

			@Override
			protected void doInTransaction() throws IOException, ServletException {
				chain.doFilter(req, res);
			}
		};

		tx.execute();

	}

}
