package org.java;

public class Calculator {

	//methods
	public float add(float num1, float num2) {
		
		float result = num1 + num2;
		
		return result;
	}
	
	public float subtract(float num1, float num2) {
		
		float result = num1 - num2;
		
		return result;
	}
	
	public float divide(float num1, float num2) throws Exception {
		
		if(num2 == 0) throw new Exception();
		
		float result = num1 / num2;
		
		return result;
	}

	public float multiply(float num1, float num2) {
		
		float result = num1 * num2;
		
		return result;
	}
}
