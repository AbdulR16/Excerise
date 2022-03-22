package com.excercise.day2;

public class Runner {
	
	public static int findAmount(MobileBill invoice) {
		switch(invoice.getPlanName()) {
		
		case "prepaid":
			return 200;
		case "postpaid":
			return 300;
		
		default :
			return 0;
		}
	}
	public static void main(String[] args) {
		
		Address addres = new Address(29,"Tenkasi",627856);
		
		MobileBill bill = new MobileBill("Abdul",99657,"postpaid",addres);
		
		System.out.println(findAmount(bill));
		
	}
}


