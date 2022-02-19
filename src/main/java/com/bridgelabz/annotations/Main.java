package com.bridgelabz.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans-annot.xml");
        // use of configuration class
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

		System.out.println("configuration class loaded");
	    College college = context.getBean("college", College.class);
	    System.out.println("The college object created by beans" + college);
	    college.test();
	}

}
