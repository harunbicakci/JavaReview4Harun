package com.neotech.review07_Polymorphism;

public class Albanian extends Human {

	Albanian() {

	}

	public Albanian(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println("Une flas shqip. Une quhem " + name);
	}

	public void albanianDance() {
		System.out.println("Dancing Valle Kosovare!");
	}

}
