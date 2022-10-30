package com.neotech.review03;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		
		// Ask the user create an array (String[][] names)
		// Fill the array
		// Print the array
		// Print the sum of the numbers in the array
		// Using normal For Loop
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many rows do you want in the array?");
		int rows = input.nextInt();
		System.out.println("How many columns do you want in the array?");
		int cols = input.nextInt();
		
		String[][] names = new String[rows][cols];
		
		for ( int i = 0; i < rows; i++) {
			for ( int j = 0; j < cols; j++) {
				System.out.println("Pleaes enter names in to the array " + i + " " + j + " :");
				names[i][j] = input.next();
			}
		}	System.out.println("\nThe names you entered are -->");
		
		for ( String[] col2 : names) {
			for ( String name : col2) {
				System.out.print(name + " ");
			}
			System.out.println();
		}
		
	}
}
