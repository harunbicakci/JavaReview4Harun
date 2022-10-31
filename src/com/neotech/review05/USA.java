package com.neotech.review05;

public class USA {

	// Access modifier, we define where variable/methods can bee accessed from
	private String capitalCity = "Washington DC";
	protected String mainState = "New York";
	String normalState = "Texas";
	public String bestSchool = "NeoTech";

	private void selectPresident() {
		System.out.println("Selecting the president only within USA");
	}

	protected void playNBA() {
		System.out.println("There are US and Canada teams in NBA");
	}

	public void speakEnglish() {
		System.out.println("English is spoken everywhere");
	}

	public static void main(String[] args) {
		USA us = new USA();

		System.out.println("Accessing the variables from inside USA");

		System.out.println("public -> " + us.bestSchool);
		System.out.println("default -> " + us.normalState);
		System.out.println("protected -> " + us.mainState);
		System.out.println("private -> " + us.capitalCity);

		System.out.println();

		System.out.println("Accessing the methods from inside USA");

		us.speakEnglish();
		us.playNBA();
		us.selectPresident();
	}

}
