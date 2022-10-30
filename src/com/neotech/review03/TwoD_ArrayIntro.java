package com.neotech.review03;

public class TwoD_ArrayIntro {
	public static void main(String[] args) {
		
		int[][] numbers = new int [3][4];
		
		numbers[1][2] = 9;
		numbers[0][1] = 5;
		numbers[0][0] = 3;
		numbers[2][2] = 8;
		
		// re-assigning value
		numbers[0][0] = 6;
		
		numbers[2][0] = 4;
		numbers[0][3] = 8;
		numbers[1][0] = 1;
		
		// numbers[3][0] = 6; --> run-time error
		
		int rows = numbers.length;	// shows the row length.
		System.out.println("The number of rows is --> " + rows);
		
		int cols = numbers[1].length;
		System.out.println("The number of columns in row index number 1 is --> " + cols);
		
		for ( int row = 0; row < numbers.length; row++) {
			for ( int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();
		}
	}
}
