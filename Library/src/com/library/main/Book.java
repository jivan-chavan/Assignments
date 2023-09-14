package com.library.main;

public class Book  extends LibraryItem{

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void displayInfo() {
		System.out.println("The Author name is : "+author);
	}
	
	
}
