package com.neotech.review09;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		
		// Collection
		// List | Set | Queue (Three interfaces inheriting Collection Interfaces)
		// ArrayList | LinkedList (Two classes implementing the List interface)
		// HashSet | LinkedHasSet | TreeSet (Tree classes implementing the Set interface)
		
		Set<String> africaLinked = new LinkedHashSet<>();
		
		africaLinked.add("Egypt");
		africaLinked.add("Niger");
		africaLinked.add("Morrocco");
		africaLinked.add("Gana");
		
		System.out.println(africaLinked);
		System.out.println("Size --> "  + africaLinked.size());
		
		// it will not add in the set because it already exist
		africaLinked.add("Morrocco");
		africaLinked.add("Niger");
		System.out.println("LinkedSet Size --> "  + africaLinked.size());
		
		// Can I add with an index in a SET? --> NO
		// africaLinked.add(2, "Zambia");
		
		System.out.println("LinkedHashSet --> " + africaLinked);
		
		Set<String> africaTree = new TreeSet<>(africaLinked);
		
		System.out.println("TreeSet       --> " + africaTree);
		
		Set<String> africaHash = new HashSet<>();
		africaHash.addAll(africaLinked);
		System.out.println("HashSet --> " + africaHash);
		
		int size = africaHash.size();
		System.out.println("HashSet Size -> " + size);
		boolean contains = africaHash.contains("Turkey");
		boolean isEmpty = africaHash.isEmpty();
		africaHash.remove("Turkey");
		
		System.out.println("\n----------For Loop--------");
		
		for (String country : africaHash) {
			System.out.print(country + " ");
		}
		
		
		
		System.out.println("\n-----------Iterator--------");
		Iterator<String> iter = africaHash.iterator();
		while (iter.hasNext()) {
			String country = iter.next();
			System.out.print(country + " ");
		}
		
	}

}
