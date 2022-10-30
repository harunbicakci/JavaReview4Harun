package com.neotech.review03;

public class TwoD_ArrayIntro3 {
	public static void main(String[] args) {
		
		int[][] nums = {
				{3, 6},
				{5, 2, 9, 7},
				{8}
		};
		System.out.println(nums[1][3]);
		System.out.println(nums[2][0]);
		// System.out.println(nums[0][2]); // run-time error
		
		System.out.println("The number of rows is --> " + nums.length);
		System.out.println("The length of the row index 1 is --> " + nums[1].length);
		System.out.println("The length of the row index 0 is --> " + nums[0].length);
		
		System.out.println("**************************");
		
		for ( int row = 0; row < nums.length; row++) {
			// nums[row].length willgive me the length of that specific row
			
			for ( int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("**************************");
		
		for ( int[] row2 : nums) {
			for ( int num : row2) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
