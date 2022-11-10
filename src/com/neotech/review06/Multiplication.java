package com.neotech.review06;

public class Multiplication {
	// Method overloading: The name of the method should be the same
	// Method signature = method name + parameters (should be unique)

	// Access modifier is NOT part of Method signature
	// Return type is NOT part of Method signature
	public static void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}

	// Is it method overloading if the method is not static? YES
	// Is it method overloading if the method is not private? YES
	private static void multiply(int num1, int num2, int num3) {
		System.out.println(num1 * num2 * num3);
	}

	public static void multiply(double d1, double d2) {
		double result = d1 * d2;
		System.out.println(result);
	}

	// TASK
	public static void multiply(int[] numbers) {
		int result = 1;
		
		for (int num : numbers) {
			result *= num;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {

		Multiplication.multiply(5, 2); // We don't need to specify the class name

		multiply(4, 5, 2);

		multiply(4.0, 1.5);

		// TASK
		int[] array = { 5, 2, 3, 4 };
		multiply(array);
	}
}
