package com.neotech.review02;

public class Task2 {
	public static void main(String[] args) {
		
		// Add Even numbers
		// Also add Odd numbers
		// Also add All numbers
		// Between 1 && 50
		// Using for loop
		
		int oddNumbers = 0;
		int evenNumbers = 0; 
		int allNumbers = 0;
		
		for (int i = 1; i <= 50; i++) {
			if( i % 2 == 0) {
				evenNumbers += i;
			} else if ( i % 2 == 1) {
				oddNumbers += i;
			}
		} 
		System.out.println("Sum of Odd Numbers is: " + oddNumbers);
		System.out.println("Sum of Even Numbers is: " + evenNumbers);
		System.out.println("Sum of All Numbers is: " + (evenNumbers + oddNumbers));
	}
}
