package com.training;

public class Application {

	public static void main(String[] args) {
		
		Student ram =new Student();
		// can't access fees bcz the attribute in private
		//System.out.println(ram.firstName);
		//we can access the fees bcz it is default(package attribute)
		System.out.println(ram.fees);
	}

}
