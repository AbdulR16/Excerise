package com.excerise.day2.excerise2;

public class BookService {
	
	public double discountCalcluate(Book discount) {
		double price = discount.getPrice();
		
		if(price <=500) {
			return price*.05;
			}
		else if(price>500 && price<=1000) {
			return price*.10;
			}
		else if(price>1000) {
			return price*.12;
		}
		else {
			return 0;
		}
	}
	public double discountCalculate(Book discount,String customerType) {
		double price = discount.getPrice();
		switch(customerType) {
		case "Corporate":
			if(price<=500) {
				return price*.07;
			}
			if(price>500 && price<=1000) {
				return price*12;
			}
			else if(price>1000) {
				return price*.15;
			}
			else {
				return 0;
	}
		case"Retail":
			if(price<=500) {
				return price*.05;
			}
			if(price>500 && price<=1000) {
				return price*10;
			}
			else if(price>1000) {
				return price*.12;
			}
			
	
		default:{
			return 0;
	}
	}
}
	
	

}
