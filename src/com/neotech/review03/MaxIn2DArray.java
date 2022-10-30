package com.neotech.review03;

public class MaxIn2DArray {

	public static void main(String[] args) {
		
		// Task: find the biggest number in a 2D Array
		
		int[][] b = {
				{-2, 3, 5},
				{2, 4, 7},
				{8, 1,-9},
				{3, 5, 1}
		};
		
		int biggest = b[0][0]; // we dont start with zero, numbers might be negative
		for ( int row = 0; row < b.length; row++) {
			
			for ( int col = 0; col < b[row].length; col++) {
				int element = b[row][col];
				
				if ( element > biggest) {
					// I found a bigger element
					// I have to reassign the biggest
					biggest = element;
				}
			}
			
		}
			System.out.println("The biggest number in array is --> " + biggest);
	
			System.out.println("**********************");

			int max = b[0][0];
			for ( int[] row : b) {
				
				for ( int element : row) {
					
					if ( element > max) {
						max = element;
					}
				}
				
			}
			System.out.println("The max number is --> " + max);
	}

}
