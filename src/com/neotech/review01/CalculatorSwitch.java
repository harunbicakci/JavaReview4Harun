package com.neotech.review01;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
		
		// Ask the user to enter 2 numbers
		// Ask the user for operator (+,-,*,/)
		// Use it using if-else if AND using switch
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		System.out.println("Now select an operator (+,-,*,/) : ");
		String operator = scan.next();
		double result = 0;
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid Operator.");
			break;
		}
		
		if ( operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") ) {
			System.out.println("The result is -> " + result);
		}
	}
}
