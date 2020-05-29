package com.ppoli.abas.bithumb;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class PublicApi {

	final static Api_Client api = new Api_Client("api connect key","api secret key");
	
	static String PUBLIC = "public";
	
	/**
	 * ticker ��û ��� ���� �ŷ��� �����ڻ� ���簡 ������ �����մϴ�.
	 * @param order_currency
	 * @param payment_currency
	 * @return
	 */
	public String ticker(String order_currency, String payment_currency) {
		
		HashMap<String, String> rgParams = new HashMap<String, String>();
		
		String result = "";
		
		try {
		    result = api.callApi("/public/ticker/"+order_currency+"_"+payment_currency, rgParams);
		    System.out.println(result);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		return result;
	}
	
}
