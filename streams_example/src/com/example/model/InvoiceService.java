package com.example.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class InvoiceService {
	
	public static List<Invoice> getInvoice(){
		
		List<Invoice> invList = new ArrayList<Invoice>();
		
		Invoice rams = new Invoice(101,"Ram",55,800,LocalDate.of(2020, Month.OCTOBER, 12));
		
		Invoice siva = new Invoice(102,"shiv",25,500,LocalDate.of(2020,6,8));

		Invoice vicky = new Invoice(103,"vicky",50,800,LocalDate.of(2020, Month.OCTOBER, 12));
		
		Invoice abd = new Invoice(104,"abd",45,900,LocalDate.of(2022, Month.JANUARY, 2));
		
		Invoice rahman = new Invoice(105,"rah",88,950,LocalDate.of(2022, Month.MARCH, 16));
		
		Invoice abdul = new Invoice(106,"abdul",78,999,LocalDate.of(2024, Month.JANUARY, 25));
		
		Invoice raj = new Invoice(107,"raj",89,521,LocalDate.of(2021, Month.DECEMBER, 22));
		
		invList.add(rams);
		invList.add(siva);
		invList.add(vicky);
		invList.add(abd);
		invList.add(rahman);
		invList.add(abdul);
		invList.add(raj);
		
		
		
		return invList;
	}

}
