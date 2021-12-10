package com.example.demo.services;

import com.example.demo.model.*;

public class EmployeeService {

	// DRY Principle followed
	public double calculateBonus(Employee employee) {
		return calculateBonus1(employee.getSalary());
	}
	
	public double calculateBonus1(double salary) {
		return salary* .30;
	}
	
	public double calculateBonus(double salary) {
		
		return (salary *.30) + 1000;
	}
	
public Employee updateSalary(Employee employee) {
		
		double updatedSalary = employee.getSalary()+20000;
		
		employee.setSalary(updatedSalary);
		
		return employee;
	}
}
