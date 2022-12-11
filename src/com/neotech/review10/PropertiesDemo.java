package com.neotech.review10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir"); // user.name
		System.out.println(projectPath);
		
		// I created the full path to the file
		String filePath = projectPath + "/extra/demo.properties";
		System.out.println(filePath);
		
		// fileIS will help me read the file
		FileInputStream fileIS = new FileInputStream(filePath);
		
		// proper is a MAP (Key-Value pairs)
		Properties proper = new Properties();
		
		// load method will help me read from the file to the proper-map
		proper.load(fileIS);
		
		System.out.println(proper);
		
		// 1st way --> get() returns object
		// to get an integer, use this method and downcast it to integer
		Object firstName = proper.get("FirstName");
		System.out.println(firstName);
		
		// 2nd way, the correct way --> getProperty() returns String
		String school = proper.getProperty("School");
		System.out.println(school);
		
		String age = proper.getProperty("Age");
		System.out.println(age);
		
		// add more key->value pairs
		proper.setProperty("SSN", "674-21-9034");
		
		// re-assign the Age
		proper.setProperty("Age", "60");
		System.out.println(proper);
		
		// now let us save into a new file
		
		// the path to the new file
		String newPath = System.getProperty("user.dir") + "/extra/NewFile.txt";
		
		FileOutputStream fileOS = new FileOutputStream(newPath);
 		
		proper.store(fileOS, "Dardan is waiting for us");
		
		
		
	}

}
