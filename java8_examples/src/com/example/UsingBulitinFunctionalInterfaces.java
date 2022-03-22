package com.example;
import java.util.*;
import java.util.function.*;

import com.example.functional.Coverter;

public class UsingBulitinFunctionalInterfaces {

	public static void main(String[] args) {
		List<String> nameList = 
				Arrays.asList("Murugan","Ashwin","Ramesh","Suresh");
		
		//for(String eachName:nameList) {
		//	System.out.println(eachName);
		//}
		
		//nameList.forEach((val)->System.out.println(val)); // lambda expression to print it
		
		nameList.forEach(System.out::println); // reference of the method we are not calling the method here we
		// give reference of the method ::->method reference
		
		System.out.println("<==========>");
		
			Predicate<String> checkName = (name) -> name.contains("m");
		
			nameList.forEach((name)->{
			
			if(checkName.test(name)) {
				System.out.println(name);
			}
		});
			
		System.out.println("==using Predicate Default Methods===");
		
			Predicate<String> checkNameNegate = (name) -> name.contains("m");
		
			nameList.forEach((name)->{
			
			if(checkNameNegate.negate().test(name)) {
				System.out.println(name);
			}
		});
			
			//Functional Interface
			
			Function<String,String> concat=(name)-> "Hi "+name;
			
			String response = concat.apply("Ramesh");
			
			System.out.println(response);
			
			Function<Double,Double> conv = (val) -> 45.00*val; 
			
			System.out.println(conv.apply(100.00));
			
			Coverter<Double,Double> convWithDefaultMethod=(val)-> val*50.00;
			
			System.out.println(convWithDefaultMethod.update(100.00));
	}

}
 