package com.neotech.review07_Abstraction;

//abstract - abstrakte - soyut - referat - mahvum
//abstarcto - abstraktnyy - chouxiang - aroubei
public abstract class Human {
	String name;
	static String planet;

	public Human(String name) {
		this.name = name;
	}

	public abstract void talk(); // unimplemented method

	public void sleep() {
		// implemented method, has a method body
		System.out.println("Every human sleeps the same.");
	}
}
