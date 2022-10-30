package com.neotech.review02;

public class ContinueDemo {
	public static void main(String[] args) {
		
		// task - 5 min
		// I want to celebrate my son`s birthdays from 11 to 20 (use for loop)
		// but not 13th birthday because we are scared
		// Let's use for loop
		
		for (int age = 11; age <=20; age++) {
			if (age == 13) {
				continue;
			}
			System.out.println("His age is :" + age);
		}
			
		System.out.println("--------Same thing with WHILE LOOP---------");
		
		int age2 = 11;
		
		while (age2 <=20) {
			age2++;
			if ( age2 == 13) {
				System.out.println("No celebration, we are scared!");
				continue;
			}
			System.out.println("Happy Birthday: " + age2);
			age2++;
		}
		
		
		
		
	}
}
