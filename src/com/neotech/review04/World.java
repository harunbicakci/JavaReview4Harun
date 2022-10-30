package com.neotech.review04;

public class World {
	public static void main(String[] args) {
		// Declaring and assigning /initializing a variable
		Baby baby1 = new Baby();
		baby1.name = "Pedro";
		baby1.weight = 18;
		
		System.out.println("The name of baby1 is: " + baby1.name);
		System.out.println("The hair color of baby1 is: " + baby1.hairColor);
		
		baby1.hairColor = "Black";
		baby1.gender = 'M';
		System.out.println("The hair color of baby1 is: " + baby1.hairColor);

		System.out.println("---------------------------");
		
		// Declaring a variable of type baby
		Baby baby2;
	
		// System.out.println("The name of baby1 is " + baby2.name);
		
		// Creating a baby a assigning it to the variable
		baby2 = new Baby();
		System.out.println("The name of baby2 is: " + baby2.name);
		
		baby2.name = "Aykut";
		baby2.gender = 'M';
		baby2.hairColor = "Red";
		baby2.weight = 5;
		
		System.out.println("The hair color of baby2 is: " + baby2.hairColor);
		
		baby1.cry();
		baby2.cry();
		
		baby1.talk();
		
		System.out.println("----------------------------");
		
		baby1.displayInformation();
		baby2.displayInformation();
		
	}
}
