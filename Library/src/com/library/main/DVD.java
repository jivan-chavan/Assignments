package com.library.main;

public class DVD  extends LibraryItem{

	private int duration;

	@Override
	public void displayInfo() {
		System.out.println("The duration is "+duration+ " hour");
	}
	
}
