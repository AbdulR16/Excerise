package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PlaceFind {
	
	public static void main(String[] args) {
		

		Country usa = new Country("USA","Kansas city", 501957);
		Country india = new Country("India","Chennai", 7090000);
		Country usa2 = new Country("USA","Los Angeles", 3970000);
		Country nepal = new Country("Nepal","Kathmandu", 1000000);
		Country india2 = new Country("India","Kolkata", 14900000);
		Country usa3 = new Country("USA","Denver", 706000);

		ArrayList<Country> cList = new ArrayList<Country>();
		cList.add(usa);
		cList.add(india);
		cList.add(usa2);
		cList.add(nepal);
		cList.add(india2);
		cList.add(usa3);

		System.out.println("Enter place: ");
		Scanner sc=new Scanner(System.in);
		String search=sc.next();




		List<String> place=cList.stream().filter(placeName).map(condition).collect(toList());
		place.forEach(System.out::println);





		}

}
