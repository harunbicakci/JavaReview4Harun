package com.neotech.review03;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
		// Combined Interview Question Homework
		// Ask the user: How many numbers do you want to store in the array?
		// Ask him to enter the number: Read the number and enter them into the array
		// Print the numbers from the array
		// Print the sum of the numbers in the array
		// 1. Using normal For Loop
		// 2. Using Enchanced/Advanced For Loop
		// 3. Find the max, min and second max number.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to store in the array?");
		int numbers = scan.nextInt();
		int[] arr = new int[numbers];
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println("Please enter the number:");
			arr[i] = scan.nextInt();
		}
		System.out.println("Your array of integers is: ");
		for ( int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int sum = 0;
		for ( int single : arr) {
			sum += single;
		}
		System.out.println("The sum of the numbers is: " + sum);
		
		int maxNo = arr[0];
		int minNo = arr[0];
		int secondMaxNo = arr[0];
		for ( int i = 0; i < arr.length; i++) {
				if ( maxNo < arr[i]) {
					maxNo = arr[i];
				}
				if ( minNo > arr[i]) {
					minNo = arr[i];
				}	
		}
		for ( int i = 0; i < arr.length; i++) {
				if ( secondMaxNo < arr[i] && arr[i] < maxNo) {
					secondMaxNo = arr[i];
				}
		}
		System.out.println("The max number in array is: " + maxNo + "\nThe min number in array is: " + minNo + 
				"\nThe second largest number in array is: " + secondMaxNo);
		
	}
}
