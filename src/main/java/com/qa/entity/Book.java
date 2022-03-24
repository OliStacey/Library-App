package com.qa.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //this will create book as a table
public class Book {
	
	@Id // creates primary key of table
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this will auto increments  the id
	private int id;
	
	
	private String title;
	
	private String publisher;
	private String dateOfPublication;
	private String genre;
	private int numOfPages;
	
	public Book() {}
	
	
	public Book(String title, String publisher, String dateOfPublication, String genre, int numOfPages) {
		super();
		
		this.title = title;
		this.publisher = publisher;
		this.dateOfPublication = dateOfPublication;
		this.genre = genre;
		this.numOfPages = numOfPages;
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


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getDateOfPublication() {
		return dateOfPublication;
	}


	public void setDateOfPublication(String dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getNumOfPages() {
		return numOfPages;
	}


	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", publisher=" + publisher + ", dateOfPublication="
				+ dateOfPublication + ", genre=" + genre + ", numOfPages=" + numOfPages + "]";
	}
	
	

}
