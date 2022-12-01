package com.neotech.review09;

import java.util.*;

public class WorldMap {

	public static void main(String[] args) {

		Map<String,String> europe = new TreeMap<>();

		europe.put("Spain", "Madrid");
		europe.put("Germany", "Berlin");
		europe.put("Italy", "Rome");
		
		System.out.println(europe);
		
		Map<String, String> africa = new LinkedHashMap<>();
		africa.put("Morrocco", "Rabat");
		africa.put("Egypt", "Cario");
		africa.put("South Africa", "Johannesburg");
		System.out.println(africa);
		
		Map<String, String> asia = new HashMap<>();
		asia.put("Japan", "Tokyo");
		asia.put("Iran", "Tehran");
		asia.put("Tajikistan", "Dushanbe");
		System.out.println(asia);
		
		// HW1 iterate europe by getting keys
		// HW2 iterate africa by getting values
		
		System.out.println("--------WORLD----------");
		
		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);
		System.out.println(world);
		System.out.println("World size --> " + world.size());
		
		Map<String, String> map1 = world.get(1);
		System.out.println(map1);

		System.out.println("--------LET US ITERATE THE WORLD----------");
		
		for (Map<String, String> continent : world) {
			// System.out.println(continent);
			Set<String> countryNames = continent.keySet();
			
			for (String country : countryNames) {
				String capitalCity = continent.get(country);
				System.out.println(country + " -> " + capitalCity);
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
