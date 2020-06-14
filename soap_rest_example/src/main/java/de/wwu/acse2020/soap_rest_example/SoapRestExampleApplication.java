package de.wwu.acse2020.soap_rest_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapRestExampleApplication {
	
	public static void main(String[] args) {
		// Starts the REST and configured SOAP-web services.
		SpringApplication.run(SoapRestExampleApplication.class, args);
	}
}