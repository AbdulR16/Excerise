package com.example.demo.mode;

public class Runner {

	public static void main(String[] args) {
		
		Employee ram= new Employee(101,"Ramesh","manager",60000);
		
		Employee abdul = new Employee(101,"Ramesh","manager",60000);
		
		boolean isEqual = ram.equals(abdul);
		
		System.out.println("Expected =>True Actual =>"+ isEqual);
		
		//Employee oneMoreRam =ram;
		// boolean isSame = ram.equals(oneMoreRam);
		 //System.out.println("Expected =>True Actual =>"+ isSame);
	}

}
