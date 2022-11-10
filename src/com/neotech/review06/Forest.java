package com.neotech.review06;

public class Forest {
	public static void main(String[] args) {
		Wolf w = new Wolf("Wolfy", 4);
		w.sleep();
		w.displayInfo();

		System.out.println("----------------");

		Fox f = new Fox("Foxy", 4, "Orange");
		f.sleep();
		f.displayInfo();

		System.out.println("----------------");

		Bear b = new Bear("Teddy", 2);
		b.sleep();
		b.displayInfo();
		b.roar();
	}

}
