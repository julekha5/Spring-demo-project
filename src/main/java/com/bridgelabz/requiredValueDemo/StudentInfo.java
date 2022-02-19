package com.bridgelabz.requiredValueDemo;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;


public class StudentInfo {
    
	@Value("${studentInfo.name}")
	private String name;
	
	@Value("${studentInfo.course}")
	private String course;
	private String hobby;
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
	
//	public void setCourse(String course) {
//		this.course = course;
//	}
	
	@Required
	@Value("${studentInfo.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void display() {
		System.out.println("Student name : " + name);
		System.out.println("Student course : " + course);
		System.out.println("Student hobby : " + hobby);
	}	
}
