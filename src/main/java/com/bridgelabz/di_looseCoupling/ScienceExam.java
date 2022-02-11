package com.bridgelabz.di_looseCoupling;

public class ScienceExam implements IExam {

	@Override
	public void examStarted() {
		System.out.println("Science Exam Started...");
	}

}
