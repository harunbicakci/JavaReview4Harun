package com.neotech.review07_Abstraction;

//In Java we don't allow multiple inheritance
//In Java we achieve multiple inheritance through interfaces
//:(
public class Coconut extends Fruit implements Crackable {

	public Coconut(String color) {
		super(color);
	}

	public void crack() {
		System.out.println("Cracking the Coconut.");
	}

}
