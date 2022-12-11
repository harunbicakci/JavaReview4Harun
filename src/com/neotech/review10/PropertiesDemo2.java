package com.neotech.review10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) throws IOException {
		
		String fullPath = System.getProperty("user.dir") + "/extra/demo2.properties";
		FileInputStream fis = new FileInputStream(fullPath);
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop);
		
		String firstName = prop.getProperty("FirstName");
		System.out.println(firstName);
		
		String age = prop.getProperty("Age");
		System.out.println(age);
		
		prop.setProperty("Age", "41");
		prop.setProperty("HighSchool", "CAL");
		
		
		FileOutputStream fileOS = new FileOutputStream(fullPath);
		
		prop.store(fileOS, "New Changes 1.0");
		
		
		
	}

}
