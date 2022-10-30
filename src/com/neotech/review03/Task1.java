package com.neotech.review03;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		// Ask the user: How many numbers do you want to store in the array?
		// Ask him to enter the number: Read the number and enter them into the array
		// Print the numbers from the array
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to store in array?");
		int answer = scan.nextInt();
		int[] array = new int [answer];
		
		System.out.println("Please enter " + answer + " numbers:");
		
		for (int i = 0; i < answer; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("Numbers you entered in array are: ");
		for ( int num : array) {
			System.out.print(num + " ");
		}
	}
}
