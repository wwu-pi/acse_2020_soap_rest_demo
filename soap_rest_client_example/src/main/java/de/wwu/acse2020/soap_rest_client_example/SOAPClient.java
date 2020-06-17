package de.wwu.acse2020.soap_rest_client_example;

import java.net.MalformedURLException;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import de.wwu.acse2020.soap_rest_client_example.soap_generated.AddRequest;
import de.wwu.acse2020.soap_rest_client_example.soap_generated.AddResponse;
import de.wwu.acse2020.soap_rest_client_example.soap_generated.MySum;

public class SOAPClient extends WebServiceGatewaySupport {
	
	public static final String URL = "http://localhost:8080/ws";
	
	// Run exemplary client
	public static void main(String[] args) throws MalformedURLException {
		SOAPClient s = new SOAPClient();
		AddResponse response = s.adderRequest(1, 2);
		MySum result = response.getSum();
		System.out.println("For SOAP-request: MySum{" +
				"n1=MyNumber{val=" + result.getN1().getVal() + "}," + 
				"n2=MyNumber{val=" + result.getN2().getVal() + "}," +
				"sum=" + result.getSum() + "}");
	}
		
	public SOAPClient() { 
		// The following configurations are used by WebServiceTemplate to 
		// automatically (de-)marshall the SOAP messags.
		// Point marshaller to generated classes for (de-)marshalling of SOAP-messages 
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in pom.xml
	    marshaller.setContextPath("de.wwu.acse2020.soap_rest_client_example.soap_generated");
		this.setDefaultUri(URL);
		// Set marshaller for this client
		this.setMarshaller(marshaller);
		this.setUnmarshaller(marshaller);
	}
	
	public AddResponse adderRequest(int i1, int i2) throws MalformedURLException {
		AddRequest request = new AddRequest();
		request.setN1(i1);
		request.setN2(i2);
		AddResponse response = 
				(AddResponse) getWebServiceTemplate()
					.marshalSendAndReceive(request); // We use the default Uri
		return response;
	}
}
