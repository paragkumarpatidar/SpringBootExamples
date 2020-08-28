package com.spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpa.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
