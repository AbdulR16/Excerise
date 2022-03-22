package com.example.functional;

import java.util.Optional;

public class UseOptional { // optional is used to avoid of printing null pointer exception
	
	public static Optional<String> getMessage(int i){
		
		String result=null;
		
		if(i<5) {
			return Optional.of("Hello");
		}else {
			return Optional.empty();
		}
		
		
	}

	public static void main(String[] args) {
		
		String str="Ramesh";
		System.out.println(str.length());
		
		
		String name=null;
		
		Optional<String> optionalName =Optional.ofNullable(name);
		
	String result= optionalName.orElse("check if  the variable 'name' is not null");
	
	System.out.println(result);
		
		
		String city="Madurai";
		Optional<String> optionalCity =Optional.ofNullable(city);
		if(optionalCity.isPresent()) {
			System.out.println("Length of the city="+city.length());
			
		}else {
			System.out.println("check if the value is assigned for city");
		}
		
		//getMessage(13).orElseThrow(() ->new RuntimeException("Invalid value-should be less than 5"));
		Optional<String> resp = getMessage(22);
		if(resp.isPresent()) {
			System.out.println(resp.get());
		}else {
			System.out.println("value of I sholud be greater than 5");
		}
	}

}
