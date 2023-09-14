package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Book {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;

    
    public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int publicationYear, String isbn) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

	@Override
	public String toString() {
		return "Book [id=" + id + ", " + (title != null ? "title=" + title + ", " : "")
				+ (author != null ? "author=" + author + ", " : "") + "publicationYear=" + publicationYear + ", "
				+ (isbn != null ? "isbn=" + isbn : "") + "]";
	}

  
    
}
