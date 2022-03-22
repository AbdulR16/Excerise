package com.example;
import java.util.*;

public class Occurence {
	
	private static List<Integer> List;

	public static void main(String[] args) {
		
	
		List = Arrays.asList(1,5,2,1,2,6,7,1);
		
	Set<Integer> mySet = new HashSet<Integer>(List);
	
	for(Integer eachNumber: mySet) {
		
	System.out.println("The Occurence of:"+eachNumber+" ="+Collections.frequency(List, eachNumber)+List.indexOf(eachNumber));

	}

	}

	}


