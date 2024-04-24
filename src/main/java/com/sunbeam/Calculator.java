package com.sunbeam;

public class Calculator {
	
	private int num1;
	
	private int num2;
	
     String operation;
	
	private String result;
	
	public Calculator() {
		System.out.println("Calculator() called here"+getClass().getName());
		this.operation="+";
	}

	
	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + ", operation=" + operation + ", result=" + result + "]";
	}


	
	
	

	
	
}
