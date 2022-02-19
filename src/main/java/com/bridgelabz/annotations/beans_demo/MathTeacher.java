package com.bridgelabz.annotations.beans_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MathTeacher implements ITeacher{

	@Override
	public void teach() {
		System.out.println("Hi, I'm your math teacher");
		System.out.println("My name is Julekha");
	}

}
