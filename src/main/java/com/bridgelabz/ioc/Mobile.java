package com.bridgelabz.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); // configure beans.xml
		System.out.println("config loaded");

		System.out.println("Using airtel class reference");
		Airtel air = (Airtel) context.getBean("airtel"); // type casting
		air.calling();
		air.data();

		System.out.println("Using vodaphone class reference");
		Vodaphone voda = context.getBean("vodaphone", Vodaphone.class); // without type-casting
		voda.calling();
		voda.data();

		System.out.println("Using interface reference");
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();

	}
}
