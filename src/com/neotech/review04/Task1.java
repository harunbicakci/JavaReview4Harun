package com.neotech.review04;

public class Task1 {
	// Create a method sayGreetingWithNumber that accepts 
	// the greeting and how many times it should be printed
	
	void sayGreetingWithNumber(String greeting, int a) {
		
		for ( int i = 1; i <= a; i++ ) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Task1 t1 = new Task1();
		
		t1.sayGreetingWithNumber("Hola!", 5);
		
		
		
		
	}
	
}
