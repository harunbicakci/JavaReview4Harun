package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {

		// Declaring a variable
		String firstName;
		// System.out.println("My first name is " + firstName);
		
		// Assign a value (initialize)
		firstName = "Cesur";
		System.out.println("My first name is " + firstName);
		
		// Declare the variable & Assigning a value
		String lastName = "Unsur";
		
		int age = 28; 
		
		System.out.println(firstName + " " + lastName + " " + age + 1);
		System.out.println(firstName + " " + lastName + " " + (age + 1));
		System.out.println(age);
		
		// After 5 years --> Re-Assign a new value to the container.
		// age = age + 5; old way
		age += 5; // easy way
		lastName = "Aniston";
		lastName += "Pitt"; // adding lastName Pitt at the end...
		
		System.out.println("After getting married!");
		System.out.println(firstName + " " + lastName + " " + age);
		
		
	}

}
