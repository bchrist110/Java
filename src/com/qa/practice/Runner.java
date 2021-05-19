package com.qa.practice;

import com.qa.practice.javabeginner.constructors.Book;
import com.qa.practice.javabeginner.constructors.Person;

public class Runner {
	
	static Person Tom = new Person("Tom", 40, "Male");
	
	public static void main(String[] args) {
		Tom.read(new Book("Stuff", "Someone", 56, "Someone"));
		
	}
}
