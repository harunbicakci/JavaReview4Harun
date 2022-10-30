package com.neotech.review04;

public class Baby {
	// variables / attributes// properties
	String name;
	char gender;
	int weight;
	String hairColor;
	
	// methods / behaviors / actions
	void talk() {
		System.out.println( name + " is talking.");
	}
	
	void eat() {
		System.out.println( name + " is eating.");
	}

	void cry () {
		System.out.println( name + " is crying.");
	}
	
	void displayInformation() {
		System.out.println( name + ", gender is " + gender + ", weight is " + weight);
	}
	
	
	
}
