package com.bridgelabz.annotations;

import org.springframework.stereotype.Component;

//@Component("collegeBean") // id provided
@Component    //if not provided then use default bean name (class name in lower )
public class College {

	public void test(){
	System.out.println("Called test method");	
	}
	
}
