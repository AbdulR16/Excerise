package com.training;

public class TestGreeting {

	public static void main(String[] args) {
		
		Greeting myObj= new Greeting();
		
		System.out.println(myObj.getMessage(args[0]));
		
		System.out.println(Greeting.print());

	}

}
