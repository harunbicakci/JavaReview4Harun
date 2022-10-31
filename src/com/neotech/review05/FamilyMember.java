package com.neotech.review05;

public class FamilyMember {

	String firstName; // instance variable, belongs to the instance/object
	static String lastName; // static/class variable, belongs to the class --> dont need a object
	int age; // instance variable, belongs to the instance/object
	
	// with non-static methods you can access ALL the variables
	void printFullName() {
		System.out.println("Full name is: " + firstName + " " + lastName);
	}
	
	// with static methods you can access ONLY static variables
	static void printFamilyName() {
		// System.out.println("Full name is: " + firstName + " " + lastName);
		System.out.println("Family name is: " + lastName);
	}
	
}
