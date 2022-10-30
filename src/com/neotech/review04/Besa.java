package com.neotech.review04;

public class Besa {

	// A method with NO parameters and NO return type
	void addTwoNumbers() {
		System.out.println("I am inside addTwoNumbers");
		int result = 2 + 5;
	}
	// A method with 2 parameters and NO return type
	void addTwoNumbersThatIGive(int a, int b) {
		System.out.println("I am inside addTwoNumbersThatIGive");
		int result = a + b;
	}
	// A method with NO parameters and WITH return type
	int addTwoNumbersAndGiveMeTheResult() {
		System.out.println("I am inside addTwoNumbersAndGiveMeThe Result");
		int result = 2 + 5;
		return result;
	}
	// A method with 2 parameters and WITH return type
	int twoNumbersThatIGiveAndGiveMeTheResult(int num1, int num2) {
		System.out.println("I am inside addTwoNumbersThatIGiveAndGiveMeTheResult");
		int result = num1 + num2;
		return result;
	}
	
}
