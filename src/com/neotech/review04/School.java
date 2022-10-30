package com.neotech.review04;

public class School {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Harun";
		s1.studentNr = 12345;
		s1.gradeLevel = 92;
		
		s1.sleep();
		
		s2.name = "Yagmur";
		s2.studentNr = 54321;
		s2.gradeLevel = 100;
		
		s2.study();
		
		Teacher t1 = new Teacher();
		
		t1.name = "Elion";
		t1.salary = 99000;
		t1.subject = "Java";
		
		t1.teach();
		t1.yellAtStudent(s1.name);
		
	}
}
