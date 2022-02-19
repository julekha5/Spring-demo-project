package com.bridgelabz.annotations.beans_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	//@Value("${college.Name}")
	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scienceTeacher")
	private ITeacher teacher;
    
	
	
	/* we can use @autowired at field side also */
//	public void setTeacher(ITeacher teacher) {
//		this.teacher = teacher;
//	}
//
//	public void setPrincipal(Principal principal) {
//		this.principal = principal;
//		System.out.println("Using setter method");
//	}

	// Using constructor
//	public College(Principal principal) {
//		super();
//		this.principal = principal;
//	System.out.println("Using constructor call ....");

//	}
    
	@SuppressWarnings("deprecation")
	@Required
	@Value("${college.Name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My college name is : " +collegeName);;
		System.out.println("Called test method of College class");
	}
}
