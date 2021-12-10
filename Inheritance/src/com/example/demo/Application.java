package com.example.demo;

public class Application {

	public static void main(String[] args) {
		
		Employee ram = new Employee (101,"Ramesh","Manager",60000);//superclass
		
		String[] skills = {"java","python","dotnet"};
		
		Manager abd = new Manager(102,"Abdul","Manager",75000,skills);
		System.out.println(ram);
		
		for(String eachSkill:abd.getSkillset()) {
			System.out.println(eachSkill);
		}
		
		//System.out.println(abd.getSkillset());

	
	Employee[] emp = new Employee[3];
	Employee e1= new Employee(100, "ram", "tester", 8000);
	Employee e2 = new Employee(101, " suresh","Hr",5000);
	Employee e3 = new Employee(102, "anu"," manager",7000);
	emp[0]=e1;
	emp[1]=e2;
	emp[2]=e3;

	EmployeeService service = new EmployeeService();
	service.printEmployee(emp);
	}

}
