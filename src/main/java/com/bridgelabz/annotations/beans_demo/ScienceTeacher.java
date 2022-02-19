package com.bridgelabz.annotations.beans_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements ITeacher {

	@Override
	public void teach() {
		System.out.println("Hi, I'm your Science teacher");
		System.out.println("My name is Alexa");
	}
}
