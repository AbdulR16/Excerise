package com.example.demo.services;
import java.util.*;

import javax.management.RuntimeErrorException;

import com.example.demo.model.*;

public class BookService {
	
	private static BookService instance = new BookService();
	private static HashSet<Book>  books;

	private BookService() {
		books = new HashSet<>();
		books.add(new Book(101, "Book One",450,"kathy sierra"));
	}

	public static BookService getInstance() {
	return instance;
}
	
	public List<Book> getAll(){
		
		return new ArrayList<>(books);
	}
	
	public boolean add(Book entity) {
		
		return books.add(entity);
		
	}
	
	public Book findById(int id) {
		
		Iterator<Book> itr = books.iterator();
		
		Book found = null;
		
		while(itr.hasNext()) {
			
			Book currentElement = itr.next();
			
			if(currentElement.getId()==id) {
				
				found=currentElement;
			}
		}
		
		return found;
	}
	public void removeById(int id) {

		Iterator<Book> itr = books.iterator();
		boolean found = false;
		Book elementToDelete =null;
		while(itr.hasNext()) {
		Book currentElement = itr.next();
		if(currentElement.getId()==id) {
		found = true;
		elementToDelete = currentElement;

		}}if(found) books.remove(elementToDelete);
		else {
		throw new RuntimeException("Element not found");
		}
		
		}
	

	public Book updateById(int id,Book entity)
	{
	
		Iterator<Book> itr = books.iterator();
	 boolean found = false;
	 Book elementToUpdate = null;
	
	 while (itr.hasNext()) {
	Book currentElement = itr.next();

	if (currentElement.getId() == id) {
	found = true;
	elementToUpdate = currentElement;
	}
	}
	if(found) {

	elementToUpdate.setAuthor(entity.getAuthor());
	elementToUpdate.setBookName(entity.getBookName());
	elementToUpdate.setPrice(entity.getPrice());

	}
	return elementToUpdate;
	}

}