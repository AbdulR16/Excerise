package com.example.demo.model;

import java.lang.Math.*;

public class Bill {
	
	public static final int STARTNUMBER=100; // Declaring a Constant-note all CAPS

	private int invoiceNumber; // instance variable
	
	private static double discount; // static or class variable
	
	//instance Method can access both the instance and static variable
	
	public void show() {
		
		System.out.println(invoiceNumber);
		System.out.println(discount);
		showAll();
		
	}
	
	// static method can access only the static variable
	
	public static void showAll() {
		
		System.out.println(discount);
		
		System.out.println(sqrt(4));
	}
}
