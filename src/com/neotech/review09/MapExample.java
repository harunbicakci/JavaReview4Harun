package com.neotech.review09;

import java.util.*;

public class MapExample {
	// Map
	// HashMap | LinkedHashMap | TreeMap | HashTable

	public static void main(String[] args) {
		Map<Integer, String> phoneBook = new HashMap<>();

		phoneBook.put(123456789, "James Smith");
		phoneBook.put(234567890, "Julia Roberts");
		phoneBook.put(456789012, "Donald Trump");
		phoneBook.put(111111111, "Obama");
		phoneBook.put(777777777, "Cristiano Ronaldo");

		// It will replace Julia Roberts with Ahmet
		phoneBook.replace(234567890, "Ahmet");
		
		// Another way to replace
		phoneBook.put(123456789, "Sedat");

		System.out.println(phoneBook);

		// Map is one directional, from key to value

		String name = phoneBook.get(111111111);
		// get the value by using the key
		System.out.println(name + " is calling...");

		name = phoneBook.get(666);
		System.out.println(name + " is calling...");

		boolean containsK = phoneBook.containsKey(666);
		System.out.println("666 is in my phone book -> " + containsK);

		boolean containsV = phoneBook.containsValue("Obama");
		System.out.println("Obama is in my phone book -> " + containsV);

		phoneBook.remove(456789012); // Will remove the pair/entry from my map
		System.out.println(phoneBook);

		System.out.println("The size of my phoneBook is -> " + phoneBook.size());

		// Let's get all the keys and store them in a SET
		System.out.println("--------phoneBook.keySet()--------");

		Set<Integer> numbers = phoneBook.keySet();
		System.out.println(numbers);

		Iterator<Integer> itNumbers = numbers.iterator();
		while (itNumbers.hasNext()) {
			Integer number = itNumbers.next();

			// Find the name/value by using the number/key
			String personName = phoneBook.get(number);
			
			System.out.println(number + " -> " + personName);
		}

		System.out.println("-----------------------------");
		
		// Lets get all the values and store them in a COLLECTION
		Collection<String> names = phoneBook.values();
		System.out.println(names);
		
		for ( String element : names) {
			System.out.print(element + " ");
			
			// maps are one-directional, from key to value
			// phoneBook.get(element);
		}
		
		
		
	}
}
