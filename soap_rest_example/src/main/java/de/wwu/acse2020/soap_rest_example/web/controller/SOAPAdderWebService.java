package de.wwu.acse2020.soap_rest_example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import de.wwu.acse2020.soap_rest_example.service.AdderService;
import de.wwu.acse2020.soap_rest_example.soap.AddRequest;
import de.wwu.acse2020.soap_rest_example.soap.AddResponse;
import de.wwu.acse2020.soap_rest_example.soap.MyNumber;
import de.wwu.acse2020.soap_rest_example.soap.MySum;

@Endpoint
public class SOAPAdderWebService {	
	
	@Autowired
	private AdderService adderService;
	
	@PayloadRoot(namespace = "soap.soap_rest_example.acse2020.wwu.de", localPart = "addRequest")
	@ResponsePayload
	public AddResponse add(@RequestPayload AddRequest request) {
		MyNumber n1 = new MyNumber();
		n1.setVal(request.getN1());
		MyNumber n2 = new MyNumber();
		n2.setVal(request.getN2());
		
		MySum sum = adderService.add(n1, n2);
		AddResponse response = new AddResponse();
		response.setSum(sum);
		return response;
	}
}
