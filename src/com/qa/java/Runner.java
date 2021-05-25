package com.qa.java;

import com.qa.java.calculator.Calculator;

public class Runner {

	public static void main(String[] args) {
		double a = 4;
		double b = 0;

		try {
			if(b == 0) {
				throw new ArithmeticException("Cannot divide by 0"); 
			}
			Calculator.division(4, 0);
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finished assessment.");
		}

	}

}
