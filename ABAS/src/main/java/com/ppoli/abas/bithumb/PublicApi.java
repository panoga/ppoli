package com.ppoli.abas.bithumb;

import java.util.HashMap;

public class PublicApi {

	final static Api_Client api = new Api_Client("api connect key","api secret key");
	
	static String PUBLIC = "public";
	
	/**
	 * ticker 요청 당시 빗썸 거래소 가상자산 현재가 정보를 제공합니다.
	 * @param order_currency
	 * @param payment_currency
	 * @return
	 */
	public String ticker(String order_currency, String payment_currency) {
		
		HashMap<String, String> rgParams = new HashMap<String, String>();
		
		rgParams.put("order_currency", order_currency);	//"BTC"
		rgParams.put("payment_currency", payment_currency);	//"KRW"	
	
		try {
		    String result = api.callApi("/public/ticker", rgParams);
		    System.out.println(result);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		return "";
	}
	
}
