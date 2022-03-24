package com.qa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
