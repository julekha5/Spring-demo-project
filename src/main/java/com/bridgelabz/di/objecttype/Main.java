package com.bridgelabz.di.objecttype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args){ 
		
//	Students students = new Students();
//    MathExam exam = new MathExam();
//    students.setMathExam(exam);
//    students.studentExam();
   
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("beans.xml loaded");
    Students stud = context.getBean("stud", Students.class);
    stud.studentExam();
	
    AnotherStudent anotherStud = context.getBean("anotherStud", AnotherStudent.class);
    anotherStud.studentExam();
	}
}
