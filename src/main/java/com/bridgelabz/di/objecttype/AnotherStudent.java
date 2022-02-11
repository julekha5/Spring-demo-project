package com.bridgelabz.di.objecttype;

public class AnotherStudent {
	
	private MathExam math;
    
	//setter method
	public void setMath(MathExam math) {
		this.math = math;
	}
	
	public void studentExam() {
		math.examStarted();
	}
	
}
