package com.neotech.review02;

public class MagicDollar {
	public static void main(String[] args) {
		
		// Task until 2:10
		// $$$$$
		// $$$$$
		// $$$$$
		// $$$$$
	
		
//		for ( int row = 1; row <= 4; row++) {
//			for (int dollar = 1; dollar <=5; dollar++) {
//				System.out.print("$");
//			}System.out.println();
//		}
		
		// $$$$$
		// $   $
		// $   $
		// $$$$$
		
		for ( int row = 1; row <= 4; row++) {
			for (int dollar = 1; dollar <=5; dollar++) {
				if (row == 1 || row == 4 || dollar == 1 || dollar ==5) { // in or statement if one of them is true, it will do
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		
	}
}
