package com.excerise.day2.excerise2;

public class Book {
	
	private int id;
	private String bookName;
	private String authorName;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int id, String bookName, String authorName, double price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}

}
