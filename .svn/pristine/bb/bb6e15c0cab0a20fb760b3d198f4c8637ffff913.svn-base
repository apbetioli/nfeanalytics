package com.nfeanalytics.model.charts;

import java.util.Map;

import com.nfeanalytics.model.DashboardRepository;

public abstract class SuperChart extends DashboardRepository {

	private final String	name;

	public SuperChart(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return getName();
	}

	public abstract String generateJson(String userEmail, Map<String, String[]> parameters);

}
