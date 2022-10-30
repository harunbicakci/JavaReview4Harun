package com.neotech.review04;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Pershendetje";
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str); // The original has not changed
		
		boolean equal = str.equals("pershendetje");
		System.out.println(equal);
		
		boolean equal1 = str.equalsIgnoreCase("pershendetje");
		System.out.println(equal1);
		
		System.out.println("---------------------");
		
		System.out.println(str.contains("SH"));
		System.out.println("SH".toLowerCase());
		
		boolean starts = str.startsWith("p");
		System.out.println(starts);
		
		System.out.println("Does Pershendetje start with Per?");
		System.out.println(str.startsWith("Per"));
		
		System.out.println("Does Pershendetje start with Per?");
		System.out.println(str.startsWith("Pershendetje"));
		
		System.out.println("-----------------------");
		
		String name = "Viktor" + "-" + "Bondar";
		System.out.println(name);
		
		String name2 = "Viktor".concat("=").concat("Bondar"); // Method chaining
		System.out.println(name2);
		
		String name3 = "Viktor".toUpperCase().concat("-").concat("Bondar");
		System.out.println(name3);
		
		// "Viktor".length().concat("Bondar"); // compile error
		// 6.concat("Bondar");
		
		
		System.out.println("Viktor".length() + 2);
		
		System.out.println("---------------------");
		
		String str2 = "      Ferdi       Turk      ";
		System.out.println(str2.trim());
		System.out.println(str2.trim().length());
		System.out.println("---------------------");
		
		String str3 = "Baris Yasar";
		char letter = str3.charAt(3);
		System.out.println(letter);
		
		System.out.println("---------------------");
		
		System.out.println(str3.indexOf('s'));
		
		int indexOfSecondS = str3.indexOf('s' , 6);
		System.out.println("indexOfSecondS --> " + indexOfSecondS);
		
		
		
		
		
	}
}
