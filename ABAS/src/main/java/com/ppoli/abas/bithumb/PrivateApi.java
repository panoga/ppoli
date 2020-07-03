package com.ppoli.abas.bithumb;

import java.util.HashMap;

public class PrivateApi {
	
	
	final static Api_Client pvapi = new Api_Client("api connect key","api secret key");
	//https://api.bithumb.com/info/balance
	
	/**
	 * 회원이 보유한 자산 정보를 제공합니다.
	 * @param currency
	 * 	apiKey	사용자 API Key	String/필수
		secretKey	사용자 Secret Key	String/필수
		currency	가상자산 영문 코드, ALL(전체)기본값 : BTC	String
	 * @return
	 */
	public String balance(String currency) {
		
		HashMap<String, String> rgParams = new HashMap<String, String>();
		
		String result = "";
		
		rgParams.put("currency", currency);
		
		result = pvapi.callApi("/info/balance/", rgParams);
		
		return "";
	}
	
}
