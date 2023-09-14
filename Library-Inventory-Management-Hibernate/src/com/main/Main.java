package com.main;

import java.util.List;

import com.entity.Book;
import com.operation.BookOperation;

public class Main {

	public static void main(String[] args) {
		BookOperation bookOperation = new BookOperation();

		
		  Book newBook = new Book(); newBook.setTitle("Sample Book");
		  newBook.setAuthor("John Doe"); newBook.setPublicationYear(2020);
		  newBook.setIsbn("1234567890");
		  
		  bookOperation.insertBook(newBook);
		  
		  
		  
		  
		  List<Book> list=bookOperation.searchBooksByPublicationYearRange(1990 , 2000);
		  for (Book book : list) { System.out.println(book); }
		  
		  List<Book> list2=bookOperation.searchBooksByAuthor("J.K. Rowling"); for (Book
		  book : list2) { System.out.println(book); }
		  
		  
		  List<Book> list3=bookOperation.searchBooksByTitleOrKeywords("Pride"); for
		  (Book book : list3) { System.out.println(book); }
		  
		  Book book2=bookOperation.searchBookByISBN("2345678901");
		  System.out.println(book2);
		  
		  List<Book> list4= bookOperation.getAllBooksInInventory(); for (Book book :
		  list4) { System.out.println(book); }
		 

		Book updateBook = new Book("The Moon", "Sandip", 2022, "1");
		bookOperation.updateBookDetails(updateBook, "9934567899");

		bookOperation.deleteBook("88");
	}

}
