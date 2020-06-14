package de.wwu.acse2020.soap_rest_client_example;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import de.wwu.acse2020.soap_rest_client_example.soap_generated.AddRequest;
import de.wwu.acse2020.soap_rest_client_example.soap_generated.AddResponse;
import de.wwu.acse2020.soap_rest_client_example.soap_generated.MySum;

public class RESTClient {
	
	private final RestTemplate restTemplate = new RestTemplate();
	
	// Run exemplary client
	public static void main(String[] args) throws RestClientException, URISyntaxException, MalformedURLException {
		RESTClient app = new RESTClient();
		app.adderRequestWithGet();
		app.adderRequestWithPost();
	}
	
	public void adderRequestWithGet() throws RestClientException, URISyntaxException {			
		MySum result = 
			restTemplate.getForObject(new URI("http://localhost:8080/add1?n1=2&n2=3"), MySum.class);
		// Mapping is "dynamic", check: restTemplate.getForObject(new URI("http://localhost:8080/add1?n1=2&n2=3"), Map.class);
		// Also check out @JsonIgnoreProperties!
		
		System.out.println("For REST-request with GET: MySum{" +
				"n1=MyNumber{val=" + result.getN1().getVal() + "}," + 
				"n2=MyNumber{val=" + result.getN2().getVal() + "}," +
				"sum=" + result.getSum() + "}");		
	}
	
	public void adderRequestWithPost() throws RestClientException, URISyntaxException {
		AddRequest addRequest = new AddRequest();
		addRequest.setN1(2);
		addRequest.setN2(5);
				
		AddResponse response = restTemplate.postForObject(
				new URI("http://localhost:8080/postAdd"), 
				addRequest, 
				AddResponse.class);
		
		MySum result = response.getSum();
		
		System.out.println("For REST-request with POST: MySum{" +
				"n1=MyNumber{val=" + result.getN1().getVal() + "}," + 
				"n2=MyNumber{val=" + result.getN2().getVal() + "}," +
				"sum=" + result.getSum() + "}");
	}
}
