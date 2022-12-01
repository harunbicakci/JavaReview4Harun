package com.neotech.review09;

import java.util.*;

public class CollectionDetails {

	public static void main(String[] args) {
		// 1. List preserves insertion order, BUT SET does NOT
		// 2. List contains duplicates, BUT SET contains UNIQUE objects

		// Collection Framework -- All interfaces and implementation
		// Collection Interface -- Only one interface
		// Collections -- It is a helper/utility class

		Set<Integer> numbers = new HashSet<>();
		numbers.add(63);
		numbers.add(98);
		numbers.add(54);
		numbers.add(34);
		numbers.add(40);
		numbers.add(95);

		System.out.println(numbers);

		Integer min = Collections.min(numbers);
		System.out.println("min -> " + min);

		System.out.println("max -> " + Collections.max(numbers));

		// SET cannot be sorted/ordered
		// Collections.sort(numbers);

		// LIST can be sorted
		List<Integer> numberList = new ArrayList<>(numbers);
		System.out.println("List before sorting -> " + numberList);

		Collections.sort(numberList);
		System.out.println("List after sorting -> " + numberList);

		System.out.println("--------------------------------");

		List<String> students = new LinkedList<>();
		students.add("Betim");
		students.add("Shirina");
		students.add("Dardan");
		students.add("Emine");
		students.add("Murad");
		students.add("Aykut");
		System.out.println(students);

		String first = Collections.min(students);
		System.out.println("first -> " + first);

		System.out.println("last -> " + Collections.max(students));

		System.out.println(students);

		Collections.sort(students);
		System.out.println(students);

		System.out.println("--------------------------------");

		int[] arr = { 9, 2, 8, 5, 1 };

		Arrays.sort(arr);

		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
