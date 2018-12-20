package com.qa.service.impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.qa.entity.CountryBean;
import com.qa.service.CountryService;
public class CountryServiceImpl implements CountryService {

	static HashMap<Integer, CountryBean> countryIdMap = getCountryIdMap();

	public CountryServiceImpl() {
		super();

		if (countryIdMap == null) {
			countryIdMap = new HashMap<Integer, CountryBean>();
			// Creating some objects of Country while initializing
			CountryBean indiaCountry = new CountryBean(1, "India", 10000);
			CountryBean bhutanCountry = new CountryBean(2, "Bhutan", 7000);
			CountryBean nepalCountry = new CountryBean(3, "Nepal", 8000);
			CountryBean chinaCountry = new CountryBean(4, "China", 20000);

			countryIdMap.put(1, indiaCountry);
			countryIdMap.put(2, bhutanCountry);
			countryIdMap.put(3, nepalCountry);
			countryIdMap.put(4, chinaCountry);
		}
	}

	public List<CountryBean> getAllCountries() {
		List<CountryBean> countries = new ArrayList<CountryBean>(countryIdMap.values());
		return countries;
	}

	public CountryBean getCountry(int id) {
		CountryBean country = countryIdMap.get(id);
		return country;
	}

	public CountryBean addCountry(CountryBean country) {
		country.setId(getMaxId() + 1);
		countryIdMap.put(country.getId(), country);
		return country;
	}

	public CountryBean updateCountry(CountryBean country) {
		if (country.getId() <= 0)
			return null;
		countryIdMap.put(country.getId(), country);
		return country;

	}

	public void deleteCountry(int id) {
		countryIdMap.remove(id);
	}

	public static HashMap<Integer, CountryBean> getCountryIdMap() {
		return countryIdMap;
	}

	// Utility method to get max id
	public static int getMaxId() {
		int max = 0;
		for (int id : countryIdMap.keySet()) {
			if (max <= id)
				max = id;

		}
		return max;
	}
}
