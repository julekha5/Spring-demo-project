package com.bridgelabz.di_looseCoupling;

public class StudentExam {
	
	private IExam exam;

	public void setExam(IExam exam) {
		this.exam = exam;
	}
	
	public void studentExamination() {
		exam.examStarted();
	}
}
