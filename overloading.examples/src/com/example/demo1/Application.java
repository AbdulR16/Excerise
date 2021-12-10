package com.example.demo1;

import java.util.Scanner;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;

public class Application {

	public static void main(String[] args) {
		
		int employeeId=Integer.parseInt (args[0]);
		String employeeName=args[1];
		String designation=args[2];
		double salary = Double.parseDouble(args[3]);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		int empId = sc.nextInt();
		System.out.println("Enter the Employee Name");
		String empName=sc.next();
		System.out.println("Enter the Designation");
		String empDes=sc.next();
		System.out.println("Enter the Salary");
		int empSal=sc.nextInt();
		sc.close();
		Employee ram = new Employee(101,"Ramesh","Devloper",70000);
		
		Employee shyam =new Employee(102,"Abd","Tester",60000);
		
		EmployeeService service = new EmployeeService();
		
		System.out.println("Expected:21000 => Actual: =>"+service.calculateBonus(ram));
		
		System.out.println("Expected:18000 => Actual: =>"+service.calculateBonus(shyam.getSalary()));		
				
		Double salary2= Double.valueOf(50000);
		
		//int intSalary = (int)(salary.doublevalue());
		
		//double salary3= salary
		
		System.out.println("Expected:16000 => Actual: =>"+service.calculateBonus(salary2));
	}

	Employee rakesh = new Employee(103,"Rakesh","Manager",70000);
	
	
}
