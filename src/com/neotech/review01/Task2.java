package com.neotech.review01;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		//Task until 2:45
		//If you are a boy
		//If you are rich -- Buy a Ferrari
		//otherwise -- Play soccer

		//If you are a girl
		//If you are rich -- Buy a LV bag
		//otherwise -- Read a book
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your gender (Male / Female): ");
		char gender = scan.next().charAt(0);
		System.out.println("Are you rich? (True / False) :");
		boolean rich = scan.nextBoolean();
		
		
		if (gender == 'M' || gender == 'm')	{
				System.out.println("Yayy, its a boy.");
				if (rich) {
					System.out.println("Buy a Ferrari.");
				} else {
					System.out.println("Play soccer.");
				}
			} else if (gender ==  'F' || gender == 'f'){
				System.out.println("Ohh no, its a girl.");
				if (rich) {
					System.out.println("Buy a LV bag.");
				} else {
					System.out.println("Read a book.");
				}
			} else {
				System.out.println("Invalid gender.");
			}
		
		
		
	}
}
