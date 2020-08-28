package com.spring.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.jpa.model.Books;

@Controller
public class LibraryThymleafController {

	@PostMapping("/books")
	private ModelAndView saveBook(@ModelAttribute Books book) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("books-data");
		modelAndView.addObject("book", book);
		return modelAndView;
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
