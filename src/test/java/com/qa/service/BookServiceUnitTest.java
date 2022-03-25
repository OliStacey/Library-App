package com.qa.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.entity.Book;
import com.qa.repo.BookRepository;

@SpringBootTest
public class BookServiceUnitTest {
	
	@Autowired
	private BookService service;
	
	@MockBean
	private BookRepository repo;
	
	@Test
	void getById() {
		
		int id = 1;
		Book foundBook = new Book("The Lord of the Rings", "Allen & Unwin", "1955", "Adventure", 1500); 
		
		Mockito.when(this.repo.findById(id)).thenReturn(Optional.of(foundBook));
		
		assertThat(this.service.getById(id)).isEqualTo(foundBook);
		
		Mockito.verify(this.repo, Mockito.times(1)).findById(Mockito.anyInt());
	}
	
	@Test
	void createBookTest() {
		
		Book bookToSave = new Book("The Lord of the Rings", "Allen & Unwin", "1955", "Adventure", 1500);
		Book bookSaved = new Book("The Lord of the Rings", "Allen & Unwin", "1955", "Adventure", 1500);
		
		Mockito.when(this.repo.save(bookToSave)).thenReturn(bookSaved);
		
		assertThat(this.service.createdBook(bookToSave)).isEqualTo(bookSaved);
		
		Mockito.verify(this.repo, Mockito.times(1)).save(Mockito.any(Book.class));
	}
	
	
	
	@Test
	void testDelete() {
		int id = 1;
		
		Mockito.when(this.repo.existsById(id)).thenReturn(false);
		
		Assertions.assertThat(this.service.deleteBook(id)).isTrue();
		
		Mockito.verify(this.repo, Mockito.times(1)).deleteById(Mockito.anyInt());
		Mockito.verify(this.repo, Mockito.times(1)).existsById(Mockito.anyInt());
	}

}
