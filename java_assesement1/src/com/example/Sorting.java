package com.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sorting {
	
	public static void main(String[] args) {
		
		System.out.println("Given Array : =");

		List<String> frutName = Arrays.asList("apple", "orange", "apple", "orange", "banana","pineapple");

		System.out.println("The Given Array List is "+ frutName);

		Set<String> usingHashSet = new LinkedHashSet(frutName);

		ArrayList<String> duplicates = new ArrayList(usingHashSet);

		System.out.println("The Sorted ArrayList is : =");

		System.out.println(duplicates);

	}
}


		
	

