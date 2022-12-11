package com.neotech.review10;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TurkishSpanishDictionary {

	public static void main(String[] args) {
	
		Map<String, String> dictionary = new TreeMap<>();
		dictionary.put("ev", "casa");
		dictionary.put("kedi", "gato");
		dictionary.put("esek", "burro");
		dictionary.put("bayrak", "bandera");
		dictionary.put("carsaf", "bandera");
	// 	dictionary.put("carsaf", "sabana"); // replacing

		System.out.println("map --> " + dictionary);
		
		// Set --> No duplicates
		// List --> Insertion order is preserved
		Set<String> turkishWords = dictionary.keySet();
		System.out.println("keys --> " + turkishWords);
		
		// because it may have duplicates, so it is a Collection or a List 
		Collection<String> spanishWords = dictionary.values();
		System.out.println("values --> " + spanishWords);
		
//		Iterator< String> ite = spanishWords.iterator();
//		
//		while(ite.hasNext()) {
//			String key = ite.next();
//			System.out.println(key);
//		}
		
	 	Set<Entry<String,String>> entries = dictionary.entrySet();
		System.out.println("entries --> " + entries);
		
		System.out.println("------------FOR EACH LOOP--------------");
		
		// enhanced/advanced/for-each loop
		for (Entry<String,String> pair : entries) {
			String k = pair.getKey();
			String v = pair.getValue();
			System.out.println(k + " --> " + v);
		}
		
		System.out.println("------------ITERATOR------------");
		Iterator<Entry<String, String>> it = entries.iterator();
		
		while (it.hasNext()) {
			Entry<String, String> pair = it.next();
			pair.getClass();
			pair.getValue();
			System.out.println(pair.getKey() + " ::: " + pair.getValue());
		}
		
	}

}
