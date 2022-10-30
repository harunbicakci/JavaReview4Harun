package com.neotech.review05;

public class Task1 {
	
	public static void main(String[] args) {
		
	System.out.println("\tPrint the whole array, but \"a\" with \"e\"");
		
	String str = "I am very happy today, because today is not Monday";
	
	char[] charArray = str.toCharArray();
	
	for ( int i = 0; i < charArray.length; i++) {

		if (charArray[i] == 'a') {
			charArray[i] ='e';
		}
	}
	for (char e : charArray) {
		System.out.print(e);
	}
	
	System.out.println();
	System.out.print(str.replaceAll("[a]","e"));
	
	
	
	
	}
}
