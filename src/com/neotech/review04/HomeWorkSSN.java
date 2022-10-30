package com.neotech.review04;

public class HomeWorkSSN {
	public static void main(String[] args) {
		
	
	// A task for hard working students
	// Hide all the numbers and leave the last four digits of ssn
	// ***-***-8745
	
	String ssn = "123-456-8745";
	
	String ssnLastPart = ssn.substring(8, ssn.length());
	String ssnStars = ssn.substring(0, 8).replaceAll("[0-9]", "*");
	
	String hiddenSsn = ssnStars + ssnLastPart;
	
	System.out.println(hiddenSsn);
	
	}
}
