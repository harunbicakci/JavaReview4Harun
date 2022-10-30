package com.neotech.review04;

import java.util.Scanner;

public class deleteThisLater {
	public static void main(String[] args) {
		
	// 	1) Writing a program that fills an array with n integers entered by the user.
	//	2) Writing a program that fills an array with n Points entered by the user.
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the number between 1-20 you want to store in your array:");
		int num = scan.nextInt();
		
		while (num > 20 || num < 1) {
			System.out.println("Invalid number, please enter a number between 1-20.");
			num = scan.nextInt();
		}
		
		int[] arr = new int[num];
		
		System.out.println("Please enter your numbers:");
		
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = scan.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}	System.out.println();
		

	}
}
