package com.neotech.review07_Polymorphism;

public class World {

	public static void main(String[] args) {
		Human.planet = "Earth";

		Human h1 = new Human();
		System.out.println(h1.name + " lives in " + Human.planet);

		Human h2 = new Human("Fatihcan");
		System.out.println(h2.name + " lives in " + Human.planet);

		Human.planet = "Mars"; // We are sending everyone to Mars
		System.out.println(h2.name + " lives in " + Human.planet);

		// Declaring a variable of type Human
		Human h3;
		// Creating an Albanian and assigning to h3
		h3 = (Human) new Albanian("Betim"); // Up-casting

		System.out.println(h3.name + " lives in " + Human.planet);

		Human h4 = new Turkish("Oktay"); // up-casting, automatically

		System.out.println("Let us make people talk, by giving money :) ");
		h1.talk();
		h2.talk();
		h3.talk();
		h4.talk();

		// Compile Error, because h4 is of type human
		// h4.makeBaklava();

		System.out.println("--------------------------------");
		// down-casting, manually
		Turkish t1 = (Turkish) h4;
		t1.makeBaklava();

		// This will give a runtime error
		// Turkish t2 = (Turkish) h3;
		// t2.makeBaklava();

		System.out.println("--------------------------------");

		// Polymorphism
		// Method overriding
		// Run time Polymorphism/late binding/dynamic binding

		// This is a safe way to down-cast
		if (h3 instanceof Turkish) {
			// Can cast/convert into Turkish
			Turkish tur = (Turkish) h3;
			tur.makeBaklava();
		} else if (h3 instanceof Albanian) {
			// Can cast/convert into Albanian
			Albanian alb = (Albanian) h3;
			alb.albanianDance();
		} else if (h3 instanceof American) {
			// Can cast/convert into American
			American amer = (American) h3;
			amer.taxReturn();
		}

System.out.println("--------------------------------");
		American us1 = new American("Donald", "420-85-1382");
		us1.talk();
		us1.taxReturn();

		Human h5 = us1; // up-casting, implicitly
		h5.talk();

		American us2 = (American) h5; // down-casting, explicitly
		us2.taxReturn();

		System.out.println("--------Power of Polymorphism--------");
		Human[] humans = new Human[6];
		humans[0] = h1;
		humans[1] = h2; // Human
		humans[2] = h3; // Albanian
		humans[3] = h4; // Turkish
		humans[4] = h5; // American
		humans[5] = new American("Barrack", "secret"); // up-casting
		// This is possible only because of inheritance

		for (Human element : humans) {
			System.out.println("----");
			element.talk();

			if (element instanceof Albanian) {
				Albanian alb = (Albanian) element;
				alb.albanianDance();
			} else if (element instanceof Turkish) {
				Turkish tur = (Turkish) element;
				tur.makeBaklava();
			} else if (element instanceof American) {
				((American) element).taxReturn();
			}
		}
	}
}
