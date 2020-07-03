package com.ppoli.abas.bithumb;

import java.util.HashMap;

public class PrivateApi {
	
	
	final static Api_Client pvapi = new Api_Client("api connect key","api secret key");
	//https://api.bithumb.com/info/balance
	
	/**
	 * ȸ���� ������ �ڻ� ������ �����մϴ�.
	 * @param currency
	 * 	apiKey	����� API Key	String/�ʼ�
		secretKey	����� Secret Key	String/�ʼ�
		currency	�����ڻ� ���� �ڵ�, ALL(��ü)�⺻�� : BTC	String
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
