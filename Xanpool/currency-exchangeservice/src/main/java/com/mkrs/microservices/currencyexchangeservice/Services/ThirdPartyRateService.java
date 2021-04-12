package com.mkrs.microservices.currencyexchangeservice.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.mkrs.microservices.currencyexchangeservice.DTO.CurrencyExchangeRate;

public class ThirdPartyRateService {
	
	private String access_key = "078b73c33bd0d123c7f7825f2ca9f8eb";
	
	 @Autowired
	 private RestTemplate restTemplate;
	 
	 @Bean
     public RestTemplate restTemplate() 
	 {
         return new RestTemplate();
     }

	public CurrencyExchangeRate GetRate(String base, String term)
	{
		String url = "http://data.fixer.io/api/latest?access_key=" + access_key +"&base="+ base+ "&symbols=" + term;
	    ResponseEntity<CurrencyExchangeRate> response =   restTemplate.getForEntity(url, CurrencyExchangeRate.class); 
	    CurrencyExchangeRate ccyRate = response.getBody();
	    ccyRate.setEnvironment("Dev");
	    ccyRate.setTerm(term);
	    return ccyRate;
	}

}
