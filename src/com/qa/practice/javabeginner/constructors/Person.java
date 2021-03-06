package com.qa.practice.javabeginner.constructors;

public class Person {
	private String name; //
	private int age; //
	private String gender; //
	private boolean isBreathing;
	private int walkSpeed = 30; // in feet
	
	//Constructor
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public void read(Book book) {
		System.out.println(this.name + " is reading the book titled: " + book.getTitle());
	}
	
	public boolean isStillBreathing() {
		return isBreathing;
	}
	
	public String speak(String msg) {
		return this.name + " says: " + msg;
	}
	
	public int walk() {
		return walkSpeed;
	}
}
