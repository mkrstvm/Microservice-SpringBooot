package com.mkrs.microservices.currencyexchangeservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mkrs.microservices.currencyexchangeservice.Controller.CurrencyExchangeController;

@SpringBootTest
class CurrencyExchangeserviceApplicationTests 
{
	@Autowired
	private CurrencyExchangeController ccyCOntroller;

	@Test
	void contextLoads()
	{
		assertThat(ccyCOntroller).isNotNull();
	}

}
