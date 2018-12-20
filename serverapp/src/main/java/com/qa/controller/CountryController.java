package com.qa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qa.entity.CountryBean;
import com.qa.entity.CountryIdRequest;
import com.qa.service.CountryService;
import com.qa.service.impl.CountryServiceImpl;

@RestController
public class CountryController {

	private CountryService countryService = new CountryServiceImpl();

	@RequestMapping(value = "/getCountries", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<CountryBean> getCountries() {
		List<CountryBean> listOfCountries = countryService.getAllCountries();
		return listOfCountries;
	}

	@RequestMapping(value = "/getCountry", method = RequestMethod.POST, headers = "Accept=application/json")
	public CountryBean getCountryById(@RequestBody CountryIdRequest countryIdReq) {
		return countryService.getCountry(countryIdReq.getId());
	}

	@RequestMapping(value = "/addCountry", method = RequestMethod.POST, headers = "Accept=application/json")
	public CountryBean addCountry(@RequestBody CountryBean country) {
		return countryService.addCountry(country);
	}

	@RequestMapping(value = "/modifyCountry", method = RequestMethod.PUT, headers = "Accept=application/json")
	public CountryBean updateCountry(@RequestBody CountryBean country) {
		return countryService.updateCountry(country);
	}

	@RequestMapping(value = "/deleteCountry", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@RequestBody CountryIdRequest countryIdReq) {
		countryService.deleteCountry(countryIdReq.getId());
	}

}
