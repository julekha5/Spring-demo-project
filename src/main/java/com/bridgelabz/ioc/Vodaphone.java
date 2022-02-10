package com.bridgelabz.ioc;

public class Vodaphone implements Sim {
	
	@Override
	public void calling() {
		System.out.println("Calling using vodaphone mobile");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using vodaphone sim");
	}
}
