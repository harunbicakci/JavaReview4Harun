package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void studentInfo() {
		System.out.println("Student name is -> " + name);
	}

}

public class StudentList {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();

		Student s1 = new Student("Baris");

		studentList.add(s1);
		studentList.add(new Student("Emine"));
		studentList.add(0, new Student("Burcu"));

		System.out.println("Size -> " + studentList.size());

		System.out.println("----Enhanced for loop----");
		for (Student element : studentList) {
			element.studentInfo();
		}

		System.out.println("----Iterator----");
		Iterator<Student> it = studentList.iterator();

		while (it.hasNext()) {
			Student s = it.next();
			s.studentInfo();
		}
	}
}
