package com.sunbeam;

import org.springframework.stereotype.Service;

@Service
public class CalService {
	
	public CalService() {
		System.out.println("CalService() called here"+getClass().getName());
	}
	
	public int calculate(int num1, int num2, String operation)
	{
		switch (operation) {
		case "+":
			return num1+num2;
			
		case "-":
			return num1-num2;

		case "*":
			return num1*num2;
			
		case "/":
			return num1/num2;
		}
		return 0;
	}

}
