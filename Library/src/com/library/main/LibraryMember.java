package com.library.main;

public abstract class LibraryMember implements Reservable{
	 
	 int memberID;
	 String name;
	
	 public abstract void borrowItem(LibraryItem item);
}
