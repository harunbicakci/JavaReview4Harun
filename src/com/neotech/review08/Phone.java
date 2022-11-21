package com.neotech.review08;

public class Phone {

	private String serialNumber;
	private String brand;
	private String password;
	
	public Phone(String serialNumber, String brand, String password) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.password = password;
		
	}
	
	public void displayInfo() {
		System.out.println("This is a " + brand + " phone with seral number " + serialNumber);
	}

	// I will give you the serial number, 
	// only if you provide the correct password
	public String getSerialNumber(String password) {
		String result = "";
		
		if (this.password.equals(password)) {
			result = serialNumber;
		}else {
			result = "Access Denied!!!";
		}
		
		return result;
	}

	// You will be able to change serialNumber
	// only if it is 7 charachers long
	public void setSerialNumber(String serialNumber) {
		if ( serialNumber.length() >= 7) {
			this.serialNumber = serialNumber;
		}
		
	}

	// Brand should be view ONLY
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	// Getters and Setters - methods that ables us to reach private data types, like password
	
	
	
	
}
