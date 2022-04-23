package com.example.demo.services;

import org.springframework.web.client.RestTemplate;

public class CryptoData {

	public String getCryptoDataFromMessari(String symbol) {
		String messariUrlBase = "https://data.messari.io/api/v1/assets";
		RestTemplate restTemplate = new RestTemplate();
		String uri = messariUrlBase + "/" + symbol + "/metrics/market-data";
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}
}
