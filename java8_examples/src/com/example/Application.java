package com.example;

import com.example.functional.Coverter;

public class Application {
	
	public static void printResult(Coverter<Double,Double> conv,double args) {
		
		double result =conv.covert(100.00);
		
		System.out.println("Result:="+result);
	}

	public static void main(String[] args) {

		Coverter<Double,Double> conv = (val) -> 45.00*val; // val - implement interface
		
		printResult(conv,100.00);
		
		Coverter<String,String> concat=(name)-> "Hi "+name;
		
		String response = concat.covert("Ramesh");
		
		System.out.println(response);
	}

}
