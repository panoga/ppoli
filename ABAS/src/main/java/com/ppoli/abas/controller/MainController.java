package com.ppoli.abas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ppoli.abas.bithumb.PublicApi;

@Controller
public class MainController {

	@Autowired
	PublicApi papi;
	
	@RequestMapping(value = "/allselect", method = RequestMethod.POST)
	public String coinselect() {
	
		String coinlist = papi.ticker("BTC", "KRW");
		
		System.out.println("coinlist  : " + coinlist);
		
		return "coinList";
		
	}
	
}
