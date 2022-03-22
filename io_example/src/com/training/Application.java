package com.training;

import java.io.File;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.training.model.Invoice;
import com.training.service.InvoiceFileService;

public class Application {

	public static void main(String[] args) {
		
		//Logger logger = Logger.getLogger(Application.class.getClass().getName());
		
		InvoiceFileService service = new InvoiceFileService();
		
		//Invoice invoice = new Invoice(101 ,"Ramesh",40,100,LocalDate.now());
		
		File file = new File("invoice.txt");
		File fileForSeralize = new File("invoice.ser");
		System.out.println("Enter 1 to add 2 to read 3 to Serialize 4 to deserialize");
		Scanner sc = new Scanner(System.in);
		
		int key=sc.nextInt();
		
		switch(key) {
		
		case 1:
		
		Invoice invoice1 = new Invoice(103,"Magesh",80,205,LocalDate.now());
		boolean result = service.writeToTextFile(invoice1, file);
		
		if(result) {
			System.out.println("File is Created and Record Added");
		}else {
			System.out.println("Exception- check in the console");
		}
		break;
		case 2:
			List<Invoice> invList = service.readFromTextFile(file);
			invList.forEach(System.out::println);
			break;
		case 3:
			Invoice inv=new Invoice(980,"Abdul",20,450,LocalDate.of(2020, Month.FEBRUARY, 2));
			boolean response = service.writeAsStream(inv,new File("invoice.ser"));
			if(response) {
				System.out.println("File is Created and Record Added");
			}else {
				System.out.println("Exception- check in the console");
			}break;
		case 4:
			Invoice invFromFile = service.readUsingStream(fileForSeralize);
			System.out.println(invFromFile);
			break;
		case 5:
			Invoice mahi=new Invoice(999,"mahi",20,200,LocalDate.of(2020, 2, 14));
			Invoice sum=new Invoice(990,"sum",20,200,LocalDate.of(2020, 2, 14));
			Invoice abd=new Invoice(995,"abd",20,200,LocalDate.of(2020, 2, 14));
			ArrayList<Invoice>invoiceList = new ArrayList<Invoice>();
			invoiceList.add(mahi);
			invoiceList.add(sum);
			invoiceList.add(abd);
			
			boolean res = service.writeAsListStream(invoiceList,new File("invoice.ser"));
			if(res) {
				System.out.println("file created and record added");
				
			}else {
				System.out.println("exception -check the console");
			}
			break;
		case 6:
			List<Invoice> invListFromFile = service.readAsListUsingStream(fileForSeralize);
			invListFromFile.forEach(System.out::println);
			break;
			
	default:
		break;
		}

}
}
