package com.bridgelabz.di_looseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml loaded");
		StudentExam student = context.getBean("studentExam", StudentExam.class);
		student.studentExamination();
	}
}