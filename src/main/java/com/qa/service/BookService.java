package com.qa.service;


import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.qa.entity.Book;
import com.qa.repo.BookRepository;


@Service
public class BookService {
	
	private BookRepository repo;
	
	public BookService(BookRepository repo) {
		this.repo = repo;
	}
	
	public Book createdBook(Book b) {
		
	return this.repo.save(b);
		
	}
	
	public List<Book> getAllBooks() {
		return this.repo.findAll();
	}
	
	public Book getById(Integer id) {
		
		
		return this.repo.findById(id).orElseThrow(() -> new EntityNotFoundException("Can't find that book")); // if a book isnt in the repo, it will throw this exception
	}
	
	public Book updateBook(Integer id, Book b) {
		
				Book foundBook = this.getById(id); // finds the book
				
				foundBook.setPublisher(b.getPublisher());
				foundBook.setDateOfPublication(b.getDateOfPublication());
				foundBook.setTitle(b.getTitle());
				foundBook.setGenre(b.getGenre());
				foundBook.setNumOfPages(b.getNumOfPages());
				
				return this.repo.save(foundBook); // this will save the new info back to the database
	}
	
	public Boolean deleteBook(Integer id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
