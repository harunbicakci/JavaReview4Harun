package com.neotech.review02;

public class WhileDemo {
	public static void main(String[] args) {
		
		String greeting = "AsSalamualkum";
		
		int count = 1; 
		
		while (count <= 5) {
			count++;
			System.out.println(count + " - " +greeting);
		}
		
		System.out.println("-------------------------");
		
		int i = 0;
		while(true) {
			
			if (i>3) {
			break;
			}
			System.out.println(greeting);
			i++;
			
		}
	}
}
