package com.neotech.review05;

import java.util.Arrays;

public class ArrayParameter {

	public static void main(String[] args) {
		
		int[] array = {7, 3, 5, 9, 8};
		System.out.println(array[4]);
		
		// Print the array using Arrays.toString(array) method
		String str = Arrays.toString(array);
		System.out.println(str);
		
		ArrayParameter ap = new ArrayParameter();
		
		int result = ap.largestNumber(array);
		System.out.println("Largest number in the array --> " + result);
		
		
	}
	
	public int largestNumber(int[] arr){
		int largest = arr[0];
		for ( int el : arr) {
			if ( largest < el)
			largest = el;
		}
		return largest;
	}
	
}
