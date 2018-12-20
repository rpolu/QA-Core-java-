package com.qa.service;
import java.util.List;
import com.qa.entity.CountryBean;
public interface CountryService {
	public List<CountryBean> getAllCountries() ;
	public CountryBean getCountry(int id);
	public CountryBean addCountry(CountryBean country);
	public CountryBean updateCountry(CountryBean country);
	public void deleteCountry(int id);
}
