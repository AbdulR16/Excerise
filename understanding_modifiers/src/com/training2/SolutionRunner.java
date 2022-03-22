package com.training2;

import org.training.Employee;
import com.training.Customer;
import com.training1.Hotel;

public class SolutionRunner {

	public static void main(String[] args) {
		
		Customer customerObj = new Customer("Abdul",3);
		Employee employeeObj = new Employee(18,2500.00);
		Hotel hotelObj = new Hotel("chennai",true);
		EmployeeApp object= new EmployeeApp();
		System.out.println(customerObj.getCustomerName());
		System.out.println(customerObj.getCustomerId());
		System.out.println(employeeObj.getEmployeeAge());
		System.out.println(employeeObj.getEmployeeSalary());
		System.out.println(hotelObj.getHotelLocation());
		System.out.println(hotelObj.isHotelopen());
		System.out.println(object.calculateBonus(employeeObj));
		
		
		
		

	}

}
