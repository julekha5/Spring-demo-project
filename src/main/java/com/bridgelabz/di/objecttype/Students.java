package com.bridgelabz.di.objecttype;

public class Students {
	private int id;
	private MathExam mathExam;
	
	//setter method
	public void setId(int id) {
		this.id = id;
	}

	public void setMathExam(MathExam mathExam) {
		this.mathExam = mathExam;
	}
	
	// Method studentExam()
	public void studentExam() {
		mathExam.examStarted();
		System.out.println("Hey Id number " + id + " start writing the paper");
	}
}
