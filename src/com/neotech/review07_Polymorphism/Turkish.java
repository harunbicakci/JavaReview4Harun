package com.neotech.review07_Polymorphism;

public class Turkish extends Human {

	public Turkish(String name) {
		super(name);
	}

	// When overriding the method signature must be the same
	@Override
	public void talk() {
		System.out.println("Ben turkce konusuyorum. Benim adim " + name);
	}

	public void makeBaklava() {
		System.out.println("I am making baklava");
	}
}
