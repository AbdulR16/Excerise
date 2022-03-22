package com.example.demo;

public class MyService {
	
	public double markWithNestedTryCatch(String markScored) {
		
	//Object strMark = new String("ninety");
		
		//Object strMark = new Integer(45); //deprecated in java 8
		
		Object strMark= Integer.valueOf(45);
	
	int mark=0;
	double testScore=0.0;
	try {
		try {                               //Nested try catch block
			mark = (Integer)strMark;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		testScore = Double.parseDouble(markScored);
	} catch (ClassCastException e) {
		e.printStackTrace();
	}
	
	System.out.println(mark);
	System.out.println(testScore);
	return 0;
	

}
	public double tryWithMultipleCatch(String markScored) {
		
		//Object strMark = new String("ninety");
			
			//Object strMark = new Integer(45); //deprecated in java 8
			
			Object strMark= Integer.valueOf(45);
		
		int mark=0;
		double testScore=0.0;
		try {
			
				mark = (Integer)strMark;
			
			testScore = Double.parseDouble(markScored);
		} catch (NumberFormatException | ClassCastException e) {
			e.printStackTrace();
		}
		
		System.out.println(mark);
		System.out.println(testScore);
		return 0;
		

	}
	// Declare Exception instead of hadlie ie ; try catch block
	
	public String exampleForDeclare(String name) throws NullPointerException{
		
		return name.toUpperCase();
	}

}
