package com.neotech.review07_Abstraction;

public class Turkish extends Human {

	public Turkish(String name) {
		super(name);
	}

	@Override
	public void talk() {
		// implementing talk method
		System.out.println(name + " says Merhaba");
	}

	public void makeBaklava() {
		System.out.println("I am making baklava");
	}

	// Task until 2:40
	// Create an array of 5 Humans, and fill it.
	// Iterate the array with an enhanced for loop
	// execute the talk and sleep method for all of them


}
