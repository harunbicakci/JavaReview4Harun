package com.neotech.review01;

public class TypeCasting {
	
	public static void main(String[] args) {
		// byte < short < int < long < float < double Primitive Data Types
		
		int intNumber = 50;
		
		// Widening/Implicit - Casting/Done Automatically
		double doubleNumber = intNumber;
		
		System.out.println("intNumber ->" + intNumber);
		System.out.println("doubleNumber ->" + doubleNumber);
		
		// narrowing/Explicit - Casting/Manually
		byte byteNumber = (byte) intNumber; // it is risky, you MAY loose data.
		System.out.println(byteNumber);
		
		intNumber = 870; // Re-Assigning value.
		byte b2 = (byte) intNumber;
		// In this case we MAY and we WILL lose data.
		System.out.println("b2 --> " + b2);
		
		byte b3 = 90;
		int i3 = b3; 
		System.out.println("i3 --> " + i3);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
