package com.bridgelabz.annotations.beans_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		// use of configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

		System.out.println("configuration class loaded");
		College college = context.getBean("college", College.class);
		System.out.println("The college object created by beans" + college);
		college.test();
		context.close();

	}
}
