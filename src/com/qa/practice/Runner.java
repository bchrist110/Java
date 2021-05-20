package com.qa.practice;

import com.qa.practice.javabeginner.constructors.Book;
import com.qa.practice.javabeginner.constructors.Person;
import com.qa.practice.javabeginner.inheritance.Trainee;

public class Runner {
	
	static Person Tom = new Person("Tom", 40, "Male");
	static Trainee Todd = new Trainee();
	
	public static void main(String[] args) {
		Todd.addSubject("Math");
		Todd.readSubjectsLearned();
	}
}
