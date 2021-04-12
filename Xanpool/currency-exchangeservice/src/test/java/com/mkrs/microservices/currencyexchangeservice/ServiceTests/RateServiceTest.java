package com.mkrs.microservices.currencyexchangeservice.ServiceTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.mkrs.microservices.currencyexchangeservice.Controller.CurrencyExchangeController;
import com.mkrs.microservices.currencyexchangeservice.DTO.CurrencyExchangeRate;
import com.mkrs.microservices.currencyexchangeservice.Services.ThirdPartyRateService;

@TestInstance(value = Lifecycle.PER_CLASS)
class RateServiceTest 
{
	@Spy
	private RestTemplate restTemplate = new RestTemplate();
	
	@InjectMocks
	private ThirdPartyRateService rateService;

	@BeforeAll
	public void Init()
	{
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void GetrateTest() 
	{
		CurrencyExchangeRate rate =  rateService.GetRate("EUR", "USD");
		
		assertNotNull(rate);
		
		assertEquals("EUR",rate.getBase());
		assertEquals("USD",rate.getTerm());
		assertNotNull(rate.getRates());
		
	}

}
