package com.qa.entity;

public class CountryBean {

	private int id;
	private String countryName;
	private long population;

	public CountryBean() {
		super();
	}

	public CountryBean(int i, String countryName, long population) {
		super();
		this.id = i;
		this.countryName = countryName;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

}