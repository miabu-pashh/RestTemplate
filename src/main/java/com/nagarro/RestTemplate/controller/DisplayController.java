package com.nagarro.RestTemplate.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.nagarro.RestTemplate.model.Book;

/**
 * Display Controller Class to display the jsp pages
 * @author maibu
 *
 */
@Controller
public class DisplayController {

	@Autowired
	private BookController bookController;
	
	//Add book and display 
	@RequestMapping(path = "/addBookAndRedirect", method = RequestMethod.POST)
	public String addBookAndRedirect(@ModelAttribute("book") Book book, Model model) {

		try {
			this.bookController.addBook(book);
			return "booklist";
		} catch (Exception e) {
			e.printStackTrace();
			return "home";
		}
	}

	@RequestMapping(path = "/addAnother", method = RequestMethod.POST)
	public String addAnother(Model model) {
		return "addbook";
	}
	
	//Display List of books 
	@RequestMapping(path = "/getAllBooks", method = RequestMethod.POST)
	public String getAllBooks(Model model) {

		List<Book> list = this.bookController.getBooks(model);
		model.addAttribute("list", list);

		return "booklist";
	}
	
	//Delete book
	@RequestMapping(path = "/deleteBookAndRedirect/{bookcode}")
	public String deleteBook(@PathVariable("bookcode") int bookcode) {

		try {
			this.bookController.deleteBook(bookcode);
			return "deletebook";
		} catch (Exception e) {
			e.printStackTrace();
			return "home";
		}
	}

	//Edit boot
	@RequestMapping(path = "/editBookAndRedirect/{bookcode}",method = RequestMethod.PUT)
	public String editBook(@PathVariable("bookcode") int bookcode, @RequestBody Book book) {

		try {
			this.bookController.editBook(bookcode, book);
			return "editbook";
		} catch (Exception e) {
			e.printStackTrace();
			return "home";
		}
	}
	
	@RequestMapping(path = "/editBook/{bookcode}", method = RequestMethod.PUT)
	public String editBook(Model model) {
		return "editbook";
	}
	
	
	@RequestMapping(path = "/list", method = RequestMethod.POST)
	public String list() {
		return "booklist";
	}
}
