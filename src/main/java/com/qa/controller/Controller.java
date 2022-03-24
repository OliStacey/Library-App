package com.qa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.entity.Book;
import com.qa.service.BookService;


@RestController
public class Controller {
	
	private BookService service;
	
	@Autowired
	public Controller(BookService service) {
		this.service = service;
	}
	
	
	
	
	
	@PostMapping("/create")
	public ResponseEntity<Book> createBook(@RequestBody Book book) {
		
		return new ResponseEntity<Book>(this.service.createdBook(book), HttpStatus.CREATED);
	}
	
	@GetMapping("/getALL")
	public ResponseEntity<List<Book>> getALL() {
		return new ResponseEntity<List<Book>>(this.service.getAllBooks(), HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Book> getByIndex(@PathVariable Integer id) {
		return new ResponseEntity<Book>(this.service.getById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteByIndex(@PathVariable Integer id) {
		return new ResponseEntity<>(this.service.deleteBook(id), HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/updateBook/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book book) {
	return new ResponseEntity<Book>(this.service.updateBook(id, book), HttpStatus.ACCEPTED);
		
}	

}
