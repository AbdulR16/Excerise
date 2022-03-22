package com.example.demo;


	public class Employee {
		
		private int employeeId;
		private String employeeName;
		private String designation;
		private double salary;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			if(salary<=0) {
				try {
					throw new RangeCheckException("Salary should be postive double value");//override
				} catch (RangeCheckException e) {
					e.printStackTrace();
				}
			}
			this.salary = salary;
		}

		public Employee(int employeeId, String employeeName, String designation, double salary)throws RangeCheckException {
			super(); // constructor with argument
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.designation = designation;
			
			if(salary<=0) {
				throw new RangeCheckException("Salary should be postive double value");
			}else {
			this.salary = salary;
		}
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation="
					+ designation + ", salary=" + salary + "]";
		}
		
		
	}	
	



