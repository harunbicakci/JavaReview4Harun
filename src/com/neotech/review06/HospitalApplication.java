package com.neotech.review06;

public class HospitalApplication {

	public static void main(String[] args) {
		Doctor d1 = new Doctor("Karen", 170000, "D123");
		d1.checkUp("Emine");

		// These are variables and methods of the child class
		// d1.dermId = "X";
		// d1.applySkinTreatment();

		// Creating a Dermatologist with NO initial information
		Dermatologist d2 = new Dermatologist();
		d2.name = "Alex";
		d2.salary = 500000;
		d2.licenceId = "D555";
		d2.dermId = "X987";

		d2.checkUp("Dardan");
		d2.applySkinTreatment();

		System.out.println("----------------");

		// Creating a Dermatologist with 3 parameter
		Dermatologist d3 = new Dermatologist("Kenan", 190000, "D482");
		d3.dermId = "X284";
		d3.salary = 210000; // We are re-assigning the salary
		d3.applySkinTreatment();

		System.out.println("----------------");

		// Creating a Dermatologist with 4 parameter
		Dermatologist d4 = new Dermatologist("Jennifer", 350000, "D195", "X951");
		d4.checkUp("Emine");
		d4.applySkinTreatment();

	}
}
