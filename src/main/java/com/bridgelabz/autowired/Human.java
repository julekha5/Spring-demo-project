package com.bridgelabz.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {


	// default constructor
//	public Human() {
//		System.out.println("Default Constructor called");
//	}
//
//	public Human(Heart heart) {
//		this.heart = heart;
//		System.out.println("Constructor called");
//	}

	@Autowired
	@Qualifier("octopousHeart")	
	private Heart heart;

//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("setter method called");
//	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("Name of the animal: " + heart.getNameOfAnimal() + 
					" Number of heart present : " + heart.getNoOfHeart());
		} else {
			System.out.println("Not alive...");
		}
	}

}
