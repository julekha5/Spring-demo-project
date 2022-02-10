package com.bridgelabz.ioc;

public class Airtel implements Sim {
	
	public Airtel() {
		System.out.println("airtel constructor called");
	}

	@Override
	public void calling() {
		System.out.println("Calling using airtel mobile");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using airtel sim");
	}

}
