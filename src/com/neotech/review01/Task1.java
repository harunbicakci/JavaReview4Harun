package com.neotech.review01;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		// Ask the user to enter 2 numbers
		// Ask the user for operator (+,-,*,/)
		// Use it using if-else if AND using switch
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		System.out.println("Now select an operator (+,-,*,/) : ");
		char operator = scan.next().charAt(0);
		
		// String operator = scan.next(); // this is for String instead of char.
		// if (operator.equals("+")) --> this is how you do == on String condition. operator.equals("-")
		
		if ( operator == '+') {
			System.out.println("The addition of "+ num1 + " and " + num2 + " is: " + (num1 + num2));
		} else if (operator == '-') {
			System.out.println("The subtraction of "+ num1 + " and " + num2 + " is: " + (num1 - num2));
		} else if (operator == '*') {
			System.out.println("The multiplication of "+ num1 + " and " + num2 + " is: " + (num1 * num2));
		} else if (operator == '/') {
			System.out.println("The division of "+ num1 + " and " + num2 + " is: " + (num1 / num2));
		} else {
			System.out.println("Invalid operation.");
		}
		
		System.out.println("-----------------------------------------");
		
		switch (operator) {
		case '+':
			System.out.println("The addition of "+ num1 + " and " + num2 + " is: " + (num1 + num2));
			break;
		case '-':
			System.out.println("The subtraction of "+ num1 + " and " + num2 + " is: " + (num1 - num2));
			break;
		case '*':
			System.out.println("The multiplication of "+ num1 + " and " + num2 + " is: " + (num1 * num2));
			break;
		case '/':
			System.out.println("The division of "+ num1 + " and " + num2 + " is: " + (num1 / num2));
			break;
		default: 
			System.out.println("Invalid operation.");
		}
	}
}
