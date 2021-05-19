package com.qa.practice.javabeginner.constructors;

public class Book {

	// Attributes
	private String title;
	private String author;
	private String genre;
	private String edition;
	private int pageCount;
	private boolean isOpen;

	// Constructor
	public Book(String title, int pageCount, String edition) {
		this.title = title;
		this.pageCount = pageCount;
		this.edition = edition;
	}
	public String getTitle() {
		return title;
	}
	// Methods
	public void open() {
		this.isOpen = true;
	}

	public void close() {
		this.isOpen = false;
	}
}
