package com.bridgelabz.ioc;

public class Jio implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using Jio mobile");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Jio sim");
	}

}
