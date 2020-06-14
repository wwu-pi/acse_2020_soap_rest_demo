package de.wwu.acse2020.soap_rest_example.service;

import de.wwu.acse2020.soap_rest_example.soap.MyNumber;
import de.wwu.acse2020.soap_rest_example.soap.MySum;

public interface AdderService {
	
	MySum add(MyNumber n1, MyNumber n2);
	
}
