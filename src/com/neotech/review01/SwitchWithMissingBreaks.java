package com.neotech.review01;

public class SwitchWithMissingBreaks {
	public static void main(String[] args) {
	
		int number = 4;
		
		switch (number) {
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
	
			// Limitations of switch: 
			// 1. You cant have duplicate cases. (Cant be case 2 and another case 2)
			// 2. You should be carefull with brakes.
			// 3. You cannot use Logical Operators like if-else if
		if (number == 3 || number ==4) {
			
		}
			// 4. You cannot use double, you can only use integer, String, char  
		double d = 4.5;
		if (d == 4.0) {
			
		}
		}
	}
}
