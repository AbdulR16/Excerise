package com.training;

public class Book {
	
	private String authorName;
	private int bookId;
	private double price;
	
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(String authorName, int bookId, double price) {
		super();
		//this.authorName refer to the field private String authorName
		//authorName refers to the method argument authorName
		this.authorName = authorName;
		this.bookId = bookId;
		this.price = price;
	}
	
	public Book() {
		//super() either super or this first never both
		//this("hi",102,123.00);
		// TODO Auto-generated constructor stub
		super();
	}

}
