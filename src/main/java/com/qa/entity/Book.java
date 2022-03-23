package com.qa.entity;

public class Book {
	
	private int id;
	private String title;
	private String publisher;
	private String dateOfPublication;
	private String genre;
	private int numOfPages;
	
	
	public Book(int id, String title, String publisher, String dateOfPublication, String genre, int numOfPages) {
		super();
		this.id = id;
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
