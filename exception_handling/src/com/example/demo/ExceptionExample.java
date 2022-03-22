package com.example.demo;

public class ExceptionExample {

	public static void main(String[] args) {
		
		try {
			System.out.println(args[0].toLowerCase());
		} catch (Exception e) {
			System.err.println("You have to add a commad line argument-check the input");
			e.printStackTrace();
		}
		
	}

}
