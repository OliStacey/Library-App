package com.qa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.entity.Book;

@Service
public class BookService {
	
	private List<Book> books = new ArrayList<>();
	
	public Book createdBook(Book b) {
		
	this.books.add(b);
	
	return this.books.get(books.size() -1);
		
	}
	
	public List<Book> getAllBooks() {
		return this.books;
	}
	
	public Book getById(Integer id) {
		return this.books.get(id);
	}
	
	public Book updateBook(Integer id, Book b) {
		return this.books.set(id, b);
	}
	
	public Book deleteBook(Integer id) {
		return this.books.remove(id.intValue());
	}

}
