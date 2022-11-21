package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIntro {

	public static void main(String[] args) {
		
		// List is an Interface
		// List<String> names = new List<>();
		
		List<String> africa = new ArrayList<>(); // Up-casting
		africa.add("Kenya");// cant store integers
		africa.add("Morocco");
		africa.add("Chad");
		africa.add(1, "Ghana"); // adding by index no
		
		System.out.println(africa);
		
		// 2nd way of filling an ArrayList
		List<String> africa2 = new ArrayList<>();
		
		africa2.addAll(africa);
		System.out.println(africa2);
		
		// 3rd way of filling an ArrayList
		List<String> africa3 = new ArrayList<>(africa); // creating a filled list
		System.out.println(africa3);
		
		System.out.println("------------FOR LOOP----------");
		// there are 3 ways to iterate a list FOR LOOP
		for ( int i = 0; i < africa.size(); i++) {
			String country = africa.get(i);
			System.out.print(country + " ");
		}
		
		System.out.println("\n------------FOR EACH LOOP----------");
		// 2nd way to iterate FOR EACH LOOP
		for (String country : africa) {
			System.out.print(country + " ");
			
		}
		
		System.out.println("\n------------USING ITERATOR----------");
		// 3rd way is using an ITERATOR
		Iterator<String> iterator = africa.iterator();
		
		while (iterator.hasNext()) {
			String country = iterator.next();
			System.out.print(country + " ");
			
		}
		System.out.println();
		System.out.println("-----------------------------------");
		
		// ArrayList<Object> europe = new ArrayList<>();
		
		ArrayList europe = new ArrayList(); // Non-Generic
		europe.add("Italy");
		europe.add(4);
		europe.add(4.5);
		europe.add(true);
		
		for (Object element : europe) {
			System.out.print(element + " ");
		}
		
	}
	
}
