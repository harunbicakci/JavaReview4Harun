package com.neotech.review08;

public class PhoneDemo {

	public static void main(String[] args) {
		
		Phone p = new Phone("S1234", "Samsung" , "pass@123");
		
		p.displayInfo();
		
		String serial = p.getSerialNumber("pass123");
		System.out.println("The serial is " + serial);

		p.setSerialNumber("Sam1234");
		p.displayInfo();
		
		System.out.println(p.getSerialNumber("pass@123"));
		
		String phoneBrand = p.getBrand();
		System.out.println("The brand is " + phoneBrand);
		
		
	}

}
