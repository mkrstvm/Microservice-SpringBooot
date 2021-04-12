package com.mkrs.microservices.currencyexchangeservice.Controller;

import java.util.*;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mkrs.microservices.currencyexchangeservice.DTO.CurrencyExchangeRate;
import com.mkrs.microservices.currencyexchangeservice.Model.CcyPair;
import com.mkrs.microservices.currencyexchangeservice.Services.CashingService;
import com.mkrs.microservices.currencyexchangeservice.Services.ThirdPartyRateService;



@RestController
public class CurrencyExchangeController 
{
	 @Autowired
	 private CashingService cashService;
	 
	 @Autowired
	 private ThirdPartyRateService rateService;
	 
	 @Bean
     public RestTemplate restTemplate() 
	 {
         return new RestTemplate();
     }
	 
	 @PostConstruct
	 public void StartCcyRateSubsciption()
	 {
					
		 cashService.StartCashing();
	 }
	 
	 
	@GetMapping("/ccy-exchange/from/{from}/to/{to}")
	public CurrencyExchangeRate GetExchangeRate(@PathVariable String from, @PathVariable String to)
	{	
		CurrencyExchangeRate result = cashService.GetRate(from, to);
		if(result != null)return result;
		
		return rateService.GetRate(from, to);
	  
	}	
}