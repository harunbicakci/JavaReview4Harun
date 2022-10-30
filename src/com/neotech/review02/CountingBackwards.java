package com.neotech.review02;

public class CountingBackwards {
	public static void main(String[] args) {
		
		// 4321
		// 4321
		// 4321
		// 4321
		
		for (int row = 1; row <=4; row++) {
			
			for (int col = 4; col >= 1; col--) {
				System.out.print(col);
			}
			System.out.println();
		}
		
		System.out.println("***********************");
		// 4444
		// 3333
		// 2222
		// 1111
		
		for (int row = 4; row >= 1; row--) {
			
			for (int col = 1; col <= 4; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		
		
	}
}
