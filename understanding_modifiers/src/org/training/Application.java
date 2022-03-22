package org.training;

import com.training.*;

public class Application {
	public static void main(String[] args) {
		
	//Student suresh= new Student();
	//protected is not accessible 
	//System.out.println(suresh.fees);
		
		OldStudent suresh = new OldStudent();
	System.out.println(suresh.getFees());	
	}
}