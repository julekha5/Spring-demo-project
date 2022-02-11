package com.bridgelabz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// using setter injection
//	    Student student1 = context.getBean("student1", Student.class);
//	    student1.displayInfo();
//	    
//	    Student student2 = context.getBean("student2", Student.class);
//	    student2.displayInfo();	

		// using constructor injection
		System.out.println("Two parameterized constructor called ");
		Student student3 = context.getBean("student3", Student.class);
		student3.displayInfo();
		
		System.out.println("single parameterized constructor called ");
		Student student4 = context.getBean("student4", Student.class);
		student4.displayInfo();
	}
}
