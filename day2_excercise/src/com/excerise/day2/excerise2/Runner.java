package com.excerise.day2.excerise2;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter  BookId");
		int bookId= a.nextInt();
		
		System.out.println("Enter the BookName");
		String bookName=a.next();
		
		System.out.println("Enter Author Name");
		String bookAuthor=a.next();
		
		System.out.println("Enter price");
		double price = a.nextDouble();
		
		System.out.println("enter the customer type");
		String type = a.next();
		
		Book myBook = new Book(bookId,bookName,bookAuthor,price);
		
		System.out.println("Discount"+ bookService.discountCalcluate(myBook));
		System.out.println("Discount for Customer Type"+ bookService.discountCalculate(myBook, type));
		

	}

}
