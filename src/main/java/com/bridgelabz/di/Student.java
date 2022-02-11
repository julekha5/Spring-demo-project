package com.bridgelabz.di;

public class Student {

	private int id;
	private String studentName;

	// Using constructor dependency injection
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public Student(int id) {
		this.id = id;
	}
	// Using setter method dependency injection
//	public void setId(int id) {
//		this.id = id;
//		System.out.println("setter method called :" + ":setId");
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//		System.out.println("setter method called :" + ":setStudentName");
//
//	}

	public void displayInfo() {
		System.out.println("Student name is : " + studentName + " and id is : " + id);
	}

}
