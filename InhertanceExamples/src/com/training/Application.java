package com.training;

import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.ifaces.Professor;
import com.training.ifaces.Student;

public class Application {
	
	public static void printResult(Conditional conditional) {
		System.out.println(conditional.test());
	}
	
	public static void printValues(Function[] objects) {
		 
		for(Function eachFunction:objects) {
			System.out.println(eachFunction.apply(50));
		}
	}

	public static void main(String[] args) {
		
		Function usdToInr =new CurrencyConverter();
		
		Function celTofar = new TempConverter();
		
		//Function[] functions = {usdToInr,celTofar};
		
		
	Student ram = new Student(100,80);
	
	printResult(ram);
	Professor kanna = new Professor(202,"msa");
	printResult(kanna);
	

	}

}
