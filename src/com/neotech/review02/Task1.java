package com.neotech.review02;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		// Break + Task -> Breask until 12:30
		// Ask the user to enter a positive number and add it to the total
		// He should enter -1 to STOP. -1 will not be added to the total
		
		Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0;
		
		do {
			System.out.println("Please enter a positive number! To STOP enter -1");
			num = scan.nextInt(); 
			if ( num != -1) {
			sum += num;
			}
		} while (num != -1);
		
		System.out.println("The sum of numbers is: " + sum);
		
		System.out.println("\n-------------FOR LOOP------------\n");
	
		// 1st iteration -> 1. initilization; 2. check condition
		// next iterations -> 1. increment; 2. check condition
		int num1;
		System.out.println("Please enter a positive number! To STOP enter -1");
		num1 = scan.nextInt(); 
		for (; num1 != -1;) {
			System.out.println("Please enter a positive number! To STOP enter -1");
			sum += num1;
		}
		System.out.println("The sum of numbers is: " + sum);
		
		
		System.out.println("\n-------------WHILE LOOP------------\n");
		
		int num2;
		System.out.println("Please enter a positive number! To STOP enter -1");
		num2 = scan.nextInt();
		
		while (num2 != -1) {
			sum +=num2;
			
			System.out.println("Please enter a positive number! To STOP enter -1");
			num2 = scan.nextInt();
			}
		System.out.println("The sum is: " + sum);
	}
}
