package com.example.demo;

public class EmployeeService {
	
	public double calculateTotalSalary(Employee[] empList) {

		double total = 0;
		if (empList.length < 2 || empList.length > 5) {

			try {
				throw new RangeCheckException("Employee should be within 5");
			} catch (RangeCheckException e) {

				e.printStackTrace();
			}

		} else {
			for (Employee each : empList) {
				total = total + each.getSalary();
			}

		}
		return total;
	}
}


