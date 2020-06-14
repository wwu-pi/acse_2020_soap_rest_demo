package de.wwu.acse2020.soap_rest_example.service;

import org.springframework.stereotype.Service;

import de.wwu.acse2020.soap_rest_example.soap.MyNumber;
import de.wwu.acse2020.soap_rest_example.soap.MySum;

@Service
public class AdderServiceImpl implements AdderService {

	@Override
	public MySum add(MyNumber n1, MyNumber n2) {
		MySum result = new MySum();
		result.setN1(n1);
		result.setN2(n2);
		result.setSum(n1.getVal() + n2.getVal());
		return result;
	}

}
