package com.neotech.review01;

import java.util.Scanner;

public class ScannerReview {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		// command + shift + o 
		
		// .next() reads one word until space/enter.
//		System.out.println("Please enter your first name:");
//		String firstName = scan.next();
//		
//		System.out.println("Please enter your last name:");
//		String lastName = scan.next();
//		
//		System.out.println("Your full name is " + firstName + " " + lastName);
		System.out.println("------------------------------------");
		// nextLine() reads whole line until enter.
//		System.out.println("Please enter your first name:");
//		String firstName = scan.nextLine();
//		
//		System.out.println("Please enter your last name:");
//		String lastName = scan.nextLine();
//		System.out.println("Your full name is " + firstName + " " + lastName);
		System.out.println("------------------------------------");
		
//		System.out.println("Please enter an int, boolean and double.");
//		int num = scan.nextInt();
//		boolean b = scan.nextBoolean();
//		double d = scan.nextDouble();
//		
//		System.out.println("You entered: " + num + " " + b + " " + d);
		System.out.println("------------------------------------");
		
		System.out.println("Please enter a long sentence!");
		String str1 = scan.next();
		String str2 = scan.next();
		String str3 = scan.nextLine();
		
		System.out.println("str1 --> " + str1);
		System.out.println("str2 --> " + str2);
		System.out.println("str3 --> " + str3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
