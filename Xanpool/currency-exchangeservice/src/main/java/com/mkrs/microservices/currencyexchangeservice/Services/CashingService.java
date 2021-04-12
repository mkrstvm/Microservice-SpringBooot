package com.mkrs.microservices.currencyexchangeservice.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;

import com.mkrs.microservices.currencyexchangeservice.DTO.CurrencyExchangeRate;
import com.mkrs.microservices.currencyexchangeservice.Model.CcyPair;

public class CashingService 
{
	 @Autowired
	 private CashingService cashService;
	 
	private HashMap<CcyPair, CurrencyExchangeRate> CachedCcyRates;
	
	private int Subscriptiontimer = 1;
	
	private List<CcyPair> CachedCcys = new ArrayList<CcyPair>()
	 {
		 {
			 add(new CcyPair("USD", "SGD"));
			 add(new CcyPair("SGD", "USD"));
			 add(new CcyPair("USD", "HKD"));
			 add(new CcyPair("HKD", "USD"));
		 }	 
		 
	};

	public CurrencyExchangeRate GetRate(String base, String term) 
	{
		if(CachedCcyRates == null  || CachedCcyRates.size() == 0)
		{
			return null;
		}
		CcyPair cachKey = new CcyPair(base, term);
		if(CachedCcyRates.containsKey(cachKey))
			return CachedCcyRates.get(cachKey);
		return null;
	}
	
	 public void StartCashing()
	 {
					
		 TimerTask task = new TimerTask() 
		 {
		        public void run() 
		        {
		            SubscribeForRates();
		        }
		    };
		    Timer timer = new Timer("Timer");
		    
		    long delay = Subscriptiontimer * 60 * 60 *1000;
		    timer.schedule(task, 0, delay);
	 }
	 
	 private void SubscribeForRates()
	 {		 
		 if(CachedCcyRates == null) CachedCcyRates = new HashMap<CcyPair, CurrencyExchangeRate>();
		 
		 CachedCcys.forEach( ccyPair -> 
		 {
			 CurrencyExchangeRate  newRate = cashService.GetRate(ccyPair.getBase(), ccyPair.getTerm());
			 
			 CachedCcyRates.put(ccyPair, newRate);
			 
		 });
		 ;
	 }
		

}
