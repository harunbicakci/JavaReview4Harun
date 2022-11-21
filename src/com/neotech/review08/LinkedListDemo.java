package com.neotech.review08;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> asia = new LinkedList<>();
		
		asia.add("Japan");
		asia.add("Vietnam");
		asia.add("Turkey");
		asia.add(0, "Cambodia");
		asia.add("Japan");
		asia.add("Taiwan");
		
		System.out.println(asia);
		
		// 	Iterate the ASia List and remove duplicate
		//	hint: you can create new List, add the elements one by one
		//	but first check if the new list CONTAINS the country
		
		// Create a new empty list
		List<String> asia2 = new LinkedList<>();
		
		for (String country : asia) {
			if(asia2.contains(country)) {
				System.out.println("The " + country + " country exists in the list");
			}else {
			asia2.add(country);
			}
		}
		
		System.out.println("asia2 -> " + asia2);
		
		System.out.println("-----------------------");
		
		List<String> asia3 = new LinkedList<>();
		Iterator<String> iter = asia.iterator();
		
		while (iter.hasNext()) {
			String country = iter.next();
			
			if(!asia3.contains(country)) {
				asia3.add(country);
			}
		}
		System.out.println("asia3 -> " + asia3);
		
	}

}
