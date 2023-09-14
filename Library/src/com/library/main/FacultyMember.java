package com.library.main;

public class FacultyMember extends LibraryMember  {
	@Override
	public void borrowItem(LibraryItem item) {
	
	System.out.println("Item borrowed by faculty are : ");
	item.displayInfo();
	
	}
	@Override
	public void reserveItem(LibraryItem item) {
		System.out.println("following item is reserved by faculty : ");
		item.displayInfo();
	}
}
