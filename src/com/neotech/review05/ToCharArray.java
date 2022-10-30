package com.neotech.review05;

public class ToCharArray {

	public static void main(String[] args) {
		String longStr = "I am very happy today, because today is not Monday";
		
		System.out.println("String lane is --> " + longStr.length());
		
		char[] charArray = longStr.toCharArray();
		
		System.out.println("char[] length --> " + charArray.length);
		
		for ( char el : charArray) {
			System.out.print(el);
		}
		System.out.println("\n-------------------------");
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println("\n-------------------------");
		
		
		
		
		
		
		
		
		
		
	}
}
