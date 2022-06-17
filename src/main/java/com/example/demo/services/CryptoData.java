package com.example.demo.services;

import org.springframework.web.client.RestTemplate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CryptoData {

	public String getCryptoDataFromMessari(String symbol) {
		String messariUrlBase = "https://data.messari.io/api/v1/assets";
		RestTemplate restTemplate = new RestTemplate();
		String uri = messariUrlBase + "/" + symbol + "/metrics/market-data";
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}
	
	public String computeRatios(String data) {
		JSONObject json = new JSONObject(data);
		JSONArray cryptoData = json.getJSONArray();
		for (int i = 0; i < cryptoData.length(); i++) {
			JSONObject price = cryptoData.getJSONObject(i);
		}
	}
}
