package com.neotech.review04;

public class SubStringDemo {
	public static void main(String[] args) {
		
		String longStr = "I am very happy today because today is not Monday";
		
		String anotherStr = longStr.substring(5, 7);
		System.out.println(anotherStr);
		
		String anotherStr2 = longStr.substring(5);
		System.out.println(anotherStr2);
		
		System.out.println("longStr --> " + longStr); // No change
		
		longStr = longStr.substring(10); // reassigning
		System.out.println("longStr --> " + longStr);
		
		// Runtime error
		// longStr.substring(8,  5);
		// longStr.substring(5, 100);
		// longStr.substring(-5, 10);
	
	}
}
