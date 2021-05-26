package com.qa.java;

import java.util.Scanner;

import com.qa.java.calculator.Calculator;

public class Runner {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Type two numbers for Division");
		int a = 0;
		int b = 0;
		try {
			System.out.println("What is the first number?");
			a = Integer.parseInt(scanner.nextLine());
			b = Integer.parseInt(scanner.nextLine());
		} catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			if (b == 0) {
				throw new ArithmeticException("Cannot divide by 0");
			}

			System.out.println(Calculator.division(a, b));
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finished assessment.");
		}
		scanner.close();
	}

}
