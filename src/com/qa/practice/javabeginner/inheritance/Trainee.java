package com.qa.practice.javabeginner.inheritance;

import java.util.ArrayList;
import java.util.List;



public class Trainee extends Person {
	private double bursary;
	private List<String> subjectsLearned;
	
	public Trainee() {
		this.bursary = 0;
		this.subjectsLearned = new ArrayList<>();
	}
	
	public void addSubject(String subject) {
		this.subjectsLearned.add(subject);
	}
	
	public double getBursary() {
		return this.bursary;
	}
	
	public void setBursary(double bursary) {
		this.bursary = bursary;
	}
	
	public void readSubjectsLearned() {
		for (int i=0; i<this.subjectsLearned.size(); i++) {
			System.out.println(this.subjectsLearned.get(i));
		}
	}
}
