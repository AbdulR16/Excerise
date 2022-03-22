package com.example.model;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

import java.time.LocalDate;


public class InvoiceApplication {
	
	public static List<Invoice> sortedByRatePerUnitAsc(Collection<Invoice> invList){
		
		
		Comparator<Invoice> invComparator = Comparator.comparing(Invoice::getRatePerUnit);
		
		List<Invoice> list=invList.stream().sorted(invComparator).collect(toList());
		
		return list;
	}
	public static Map<String,LocalDate> mapViewOfList(Collection<Invoice> invList){
		
		return invList.stream().collect(Collectors.toMap(Invoice::getCustomerName, Invoice::getInvoiceDate));
		
	}
	
	public static Set<Invoice> setViewOfList(Collection<Invoice> invList,Predicate<Invoice> predicate){
		
		Set<Invoice> setList = (Set<Invoice>) invList.stream().filter(predicate).collect(toSet());
		
		return  setList;
	}
	
	public static double findMaxInvoiceValue(Collection<Invoice> invList,Comparator comp) {
		
		Comparator<Invoice> maxComp = Comparator.comparing(Invoice::getQuantity);
		
		Optional<Invoice> maxValue = invList.stream().max(maxComp);
		
		double max=0;
		
		if(maxValue.isPresent()) {
			max=maxValue.get().getQuantity();
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		List<Invoice> invList = InvoiceService.getInvoice();
		
		List<Invoice> sortedList = sortedByRatePerUnitAsc(invList);
		
		sortedList.forEach(System.out::println);
		
		Set<Map.Entry<String,LocalDate>> set = mapViewOfList(invList).entrySet();

		for(Entry<String,LocalDate> eachEntry:set) {

		System.out.println(eachEntry.getKey()+":"+eachEntry.getValue());
		}
		
		Predicate<Invoice> check = e->e.getCustomerName().equals("abdul");
		
		Set<Invoice> list = setViewOfList(invList,check);
		 
		System.out.println(list);
		
		Comparator<Invoice> markComparator = Comparator.comparing(Invoice::getQuantity);
		System.out.println(findMaxInvoiceValue(invList,markComparator));
	}
	
}
