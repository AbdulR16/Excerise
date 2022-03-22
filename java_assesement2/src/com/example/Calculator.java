package com.example;

public class Calculator {
	
	interface Arithmetic {
		
		int operation(int a, int b);
		}

	
		public static void main(String[] args) {

		
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


