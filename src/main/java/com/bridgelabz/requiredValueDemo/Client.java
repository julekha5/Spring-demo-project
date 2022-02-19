package com.bridgelabz.requiredValueDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.annotations.beans_demo.CollegeConfig;

public class Client {

	public static void main(String[] args) {
        
		ApplicationContext context = new ClassPathXmlApplicationContext("studentInfo.xml");
		System.out.println("xml file loaded");
		StudentInfo info = context.getBean("studentInfo", StudentInfo.class);
		info.display();
	}
}
