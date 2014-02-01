package com.nfeanalytics.control.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserServiceFactory;
import com.nfeanalytics.model.DashboardRepository;
import com.nfeanalytics.model.charts.CompanyPerformanceChart;
import com.nfeanalytics.model.charts.DistributionOfSalesMapChart;
import com.nfeanalytics.model.charts.FretePorEstadoChart;
import com.nfeanalytics.model.charts.ImpostosChart;
import com.nfeanalytics.model.charts.PaymentMethodChart;
import com.nfeanalytics.model.charts.ReceitaDespesaChart;
import com.nfeanalytics.model.charts.TopCustomersChart;
import com.nfeanalytics.model.charts.TopProdutosChart;

public class DashboardServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		DashboardRepository repository = DashboardRepository.getInstance();
		repository.registerChart(new PaymentMethodChart());
		repository.registerChart(new TopCustomersChart());
		repository.registerChart(new CompanyPerformanceChart());
		repository.registerChart(new DistributionOfSalesMapChart());
		repository.registerChart(new ImpostosChart());
		repository.registerChart(new ReceitaDespesaChart());
		repository.registerChart(new FretePorEstadoChart());
		repository.registerChart(new TopProdutosChart());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = UserServiceFactory.getUserService().getCurrentUser();

		DashboardRepository.getInstance().updateChannels(user.getEmail(), req.getParameterMap());
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		User user = UserServiceFactory.getUserService().getCurrentUser();

		req.setAttribute("token", DashboardRepository.getInstance().createToken(user.getEmail()));
		req.setAttribute("customers",
				new ArrayList<String>(DashboardRepository.getInstance().listCustomers(user.getEmail())));
		req.setAttribute("ufs", new ArrayList<String>(DashboardRepository.getInstance().listUFs(user.getEmail())));

		req.getRequestDispatcher("/jsp/dashboard.jsp").forward(req, resp);
	}

}
