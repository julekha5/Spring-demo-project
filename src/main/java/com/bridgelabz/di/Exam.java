package com.bridgelabz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    Student student1 = context.getBean("student1", Student.class);
	    student1.displayInfo();
	    
	    Student student2 = context.getBean("student2", Student.class);
	    student2.displayInfo();	}

}
