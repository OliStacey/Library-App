package com.qa.controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.entity.Book;


@RestController
public class Controller {
	
	private List<Book> books = new ArrayList<>();
	
	@GetMapping("/hw")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@PostMapping("/create")
	public ResponseEntity<Book> createBook(@RequestBody Book book) {
		
		this.books.add(book);
		
		Book responseBody = this.books.get(books.size() -1);
		
		return new ResponseEntity<Book>(responseBody, HttpStatus.CREATED);
	}
	
	@GetMapping("/getALL")
	public ResponseEntity<List<Book>> getALL() {
		return new ResponseEntity<List<Book>>(this.books, HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Book> getByIndex(@PathVariable Integer id) {
		return new ResponseEntity<Book>(this.books.get(id),HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteByIndex(@PathVariable Integer id) {
		return new ResponseEntity<>(this.books.remove(id.intValue()), HttpStatus.ACCEPTED);
	}
		
		

}
