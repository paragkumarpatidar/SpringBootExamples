package com.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.Books;
import com.spring.jpa.service.LibraryService;

@RestController
public class LibraryController {

	@Autowired
	private LibraryService service;

	@GetMapping("/books")
	public List<Books> getAllBooks() {
		return service.getAllBooks();
	}

	@PostMapping("/books")
	private int saveBook(@RequestBody Books books) {
		service.saveOrUpdate(books);
		return books.getBookid();
	}

	@GetMapping("/book/{bookid}")
	private Books getBooks(@PathVariable("bookid") int bookid) {
		return service.getBooksById(bookid);
	}

	@DeleteMapping("/book/{bookid}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	private void deleteBook(@PathVariable("bookid") int bookid) {
		service.delete(bookid);
	}


}
