package com.restclient.restclient.resttemplates;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateDemo {
	
	public static void main(String[] args) {
		
		/**
		 * Fetch data in the form of plain JSON
		 */
		String url = "http://localhost:9999/api/v1/users";
		
		RestTemplate restTempplate = new RestTemplate();
		ResponseEntity<String> response = restTempplate.getForEntity(url, String.class);
		System.out.println("<------------JSON Format------------->");
		System.out.println(response.getBody());
	}
}
