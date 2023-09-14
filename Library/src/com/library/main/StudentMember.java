package com.library.main;

public class StudentMember extends LibraryMember  {

	@Override
	public void borrowItem(LibraryItem item) {
		System.out.println("following Item are borrowed by Student  : ");
				item.displayInfo();
					}

	@Override
	public void reserveItem(LibraryItem item) {
		System.out.println("following item is reserved by Student : ");
		item.displayInfo();
	}

}
