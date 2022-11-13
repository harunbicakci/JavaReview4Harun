package com.neotech.review05_other;

import com.neotech.review05.USA;

public class Mexico {

	public static void main(String[] args) {
		USA us = new USA();

		System.out.println("Accessing the variables from inside Mexico");

		System.out.println("public -> " + us.bestSchool);
		// private, default, and protected variables
		// System.out.println("default -> " + us.normalState);
		// System.out.println("protected -> " + us.mainState);
		// System.out.println("private -> " + us.capitalCity);

		System.out.println();

		System.out.println("Accessing the methods from inside Mexico");

		us.speakEnglish();;

		// playNBA() is protected
		// us.playNBA();

		// selectPresident() is private
		// us.selectPresident();
	}

}
