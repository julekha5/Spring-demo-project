package com.bridgelabz.di_looseCoupling;

public class MathExam implements IExam{

	@Override
	public void examStarted() {
		System.out.println("Math Exam Started...");
	}
}
