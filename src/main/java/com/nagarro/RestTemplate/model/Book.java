package com.nagarro.RestTemplate.model;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties
/**
 * Book Entity Class
 * Mapping book details to the database
 * 
 * @author maibu
 *
 */
public class Book {
	
	private Integer bookcode;
	
	private String bookname;
	
	private String author;

	private String date;
	public Integer getBookcode() {
		return bookcode;
	}
	public void setBookcode(Integer bookcode) {
		this.bookcode = bookcode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", author=" + author + ", date=" + date + "]";
	}
	
	//Parameterized Constructor 
	public Book(Integer bookcode, String bookname, String author, String date) {
		super();
		this.bookcode = bookcode;
		this.bookname = bookname;
		this.author = author;
		this.date = date;
	}
	
	//Constructor from super class
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
