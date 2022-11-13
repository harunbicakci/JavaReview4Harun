package com.neotech.review07_Polymorphism;

public class German extends Human{

	public German(String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println("Ich spreche deutsch. Ich heisse " + name);
	}
	
	public void drinkBeer() {
		System.out.println("Two beer or not two beer, Shakesbeer.");
	}
}
