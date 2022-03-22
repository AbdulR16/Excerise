package com.example.demo.service;


import java.util.Arrays;
import java.util.List;

public class MessageService {
	
	public String getMessage() {
		
		List<String> names = Arrays.asList("Ram","shyam","maggi");
		
		names.forEach(System.out::println);
		
		return "Running SucccessFully";
	}

}
