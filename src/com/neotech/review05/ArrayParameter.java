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
		
		System.out.println("-----------------------------");
		
		result = ap.sumArray(array);
		System.out.println("The sum of the array --> " + result);
		
		double d = ap.avrArray(array);
		System.out.println("The average of the array --> " + d);
		
		
	}
	
	
	protected int sumArray (int[] arr) {
		int sum = 0;
		for (int el : arr) {
			sum += el;
		}
		
		return sum;
	}
	
	private double avrArray (int[] arr) {
		
		double sum = sumArray(arr);
		double avr = sum / arr.length;
		
		return avr;
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
