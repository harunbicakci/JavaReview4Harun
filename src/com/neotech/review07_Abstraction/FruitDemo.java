package com.neotech.review07_Abstraction;

public class FruitDemo {
		
			public static void main(String[] args) {
				Apple a = new Apple("Yellow");
				a.peel();
				a.wash();
		
				Coconut c = new Coconut("Green");
				c.crack();
		
				Fruit f = new Apple("Red"); // up-casting
				// f.peel();
				// f.wash();
		
				Apple a2 = (Apple) f; // down-casting
				a2.peel();
				a2.wash();
		
				// Trump, no we can't create an object
				// Peelable p = new Peelable();
				Peelable p2 = new Apple("Green"); // up-casting
				p2.peel();
				// p2.wash();
		
				// Tasks are only for good students
		
				// Task 1
				// Create an Orange class that extends Fruit and implement Peelable
		
				// Task 2
				// Create an array of Peelable with 3 elements, one apple and two oranges
				// Iterate the array and execute the peel method
				// Try to execute wash method???
			}
}
