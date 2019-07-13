package com.example.demo.junit;

public class Calculator {
	
	public static double divide(int num1, int num2) {
		if(num2 == 0) throw new IllegalArgumentException("divide by zero");
		return (double)num1 / (double)num2;
	}

}
