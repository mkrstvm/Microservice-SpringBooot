package com.mkrs.microservices.currencyexchangeservice.DTO;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashMap;

import com.mkrs.microservices.currencyexchangeservice.Model.CcyPair;

public class CurrencyExchangeRate 
{
	private String base;
	private String term;
	private HashMap<String, Double> rates;
	private BigDecimal timestamp;
	private String environment;
	private Boolean success;
	private Date date;
	
    public CurrencyExchangeRate() {
		// TODO Auto-generated constructor stub
	}

	
    public CurrencyExchangeRate(Boolean success, BigDecimal timestamp, String base, Date date, HashMap<String, Double> rate) 
    {
    	this.success = success;
    	this.setBase(base);
    	this.setRates(rate);;
    	this.timestamp = timestamp;
    	this.setEnvironment("Dev");
    	this.setDate(date);
	}

	public HashMap<String, Double> getRates() {
		return rates;
	}

	public void setRates(HashMap<String, Double> rate) {
		this.rates = rate;
	}


	/*
	public String getEnvironment() {
		return environment;
	}


	public void setEnvironment(String environment) {
		this.environment = environment;
	}
*/

	public BigDecimal getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(BigDecimal timestamp) {
		this.timestamp = timestamp;
	}


	public Boolean getSuccess() {
		return success;
	}


	public void setSuccess(Boolean success) {
		this.success = success;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getBase() {
		return base;
	}


	public void setBase(String base) {
		this.base = base;
	}


	public String getTerm() {
		return term;
	}


	public void setTerm(String term) {
		this.term = term;
	}


	public String getEnvironment() {
		return environment;
	}


	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	public CcyPair Pair()
	{
		return new CcyPair(this.base, this.term);
	}
	
	

}
