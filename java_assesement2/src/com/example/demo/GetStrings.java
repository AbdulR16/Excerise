package com.example.demo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class GetStrings {
	
interface Arithmetic {
		
		int operation(int a, int b);
		}
	
	public static List<String> getlist(){
	
	List<String> words = new ArrayList<String>();
	
	words.add("Doll");
	words.add("Cat");
	words.add("Table");
	words.add("Dog");
	words.add("Delhi");
	words.add("Pencil");
	
	return words;
	
}
	public static List<String>getChar(Collection<String> list, Predicate<String> condition) {
		list.stream().filter(condition).forEach(System.out::println);
		return null;

		}
	public static void main(String[] args) {
		
		List<String> list = GetStrings.getlist();

		Predicate<Date> sameString = str->str.equals(new Date(1999,08,08));
		getChar(list,sameString);
		

		Arithmetic add = (int a, int b) -> (a + b);
		System.out.println("Addition = " + add.operation(5, 6));
		Arithmetic sub = (int a, int b) -> (a - b);
		System.out.println("Subtraction = " + sub.operation(5, 3));
		Arithmetic multiply = (int a, int b) -> (a * b);
		System.out.println("Multiplication = " + multiply.operation(4, 6));
		Arithmetic division = (int a, int b) -> (a / b);
		System.out.println("Division = " + division.operation(12, 6));

		

		
	}
}
