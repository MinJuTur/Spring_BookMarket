package com.springboot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.domain.Book;
import com.springboot.service.BookService;



@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String requestBookList(Model model) {
		List<Book> list = bookService.getAllBookList();
		model.addAttribute("bookList", list);
		return "books";
	}
}
