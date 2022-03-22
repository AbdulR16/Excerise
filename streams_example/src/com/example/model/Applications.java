package com.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Applications {

	public static void main(String[] args) {

		
		Invoice rams = new Invoice(101,"Ram",55,800,LocalDate.of(2020, Month.OCTOBER, 12));
		
		Invoice siva = new Invoice(102,"shiv",25,500,LocalDate.of(2020,6,8));

		Invoice vicky = new Invoice(103,"vicky",50,800,LocalDate.of(2020, Month.OCTOBER, 12));
		
		System.out.println(rams);
		System.out.println(siva);
		System.out.println(vicky);
		
		LocalDate vickyDate = vicky.getInvoiceDate();
		
		System.out.println(vickyDate.plusYears(2));
		
		LocalDate birthDate = LocalDate.of(1999, Month.AUGUST, 8);
		
		LocalDate today = LocalDate.now();
		
		long years = today.getYear()-birthDate.getYear();
		long months= today.getMonthValue()-birthDate.getMonthValue();
		
		System.out.println("Age:="+years +"years,Month:="+months);
		
		String date="2022-01-03";
		
		LocalDate firstDay2022 = LocalDate.parse(date);
		
		System.out.println(firstDay2022.getDayOfWeek());
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(dateTime);
		
		

	}

}
