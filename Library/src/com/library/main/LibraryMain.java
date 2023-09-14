package com.library.main;

public class LibraryMain {
public static void main(String[] args) {
	LibraryItem l1=new LibraryItem("Abc",101);
	LibraryItem l2=new LibraryItem("PQR",102);
	
	StudentMember sm =new StudentMember();
	sm.borrowItem(l1);
	sm.reserveItem(l1);
	
	FacultyMember fm =new FacultyMember();
	fm.borrowItem(l2);
	fm.reserveItem(l2);
	
}
}
