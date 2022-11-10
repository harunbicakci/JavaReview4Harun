package com.neotech.review06;

public class Student {

	// instance variables
	String name;
	int age;

	// static/class variable
	static String school;

	// Constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// instance method
	public void displayStudentInfo() {
		System.out.println(
				"My name is " + this.name +
				" AND my age is " + this.age +
				" AND I study at " + Student.school);
	}

	// static method
	public static void main(String[] args) {

		Student.school = "NeoTech";

		// We don't have the default Constructor
		// Student s1 = new Student();

		Student s2 = new Student("Aykut", 15);
		s2.displayStudentInfo();

		Student s3 = new Student("Sema", 23);
		s3.displayStudentInfo();

	}

}
