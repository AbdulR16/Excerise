package com.example.demo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.demo.utils.LoggingUtility;

public class TestCustom {
	public static void main(String[] args) {
		Logger logger = LoggingUtility.getLogger(TestCustom.class);
		
		FileHandler handler;
		try {
			handler = new FileHandler("logs.log", true);
			logger.addHandler(handler);
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Employee ram = new Employee();
		
		ram.setDesignation("devloper");
		ram.setEmployeeId(6);
		ram.setEmployeeName("abd");
		ram.setSalary(60000);
		
		//System.out.println(ram.getDesignation());
		//System.out.println(ram.getSalary());
		
		Employee shyam=null;
		
		try {
			shyam = new Employee(100, "shyam", "manager", 30000);
			logger.info(shyam.toString());
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EmployeeService service = new EmployeeService();
		Employee[] empList = {ram,shyam};
		//System.out.println(service.calculateTotalSalary(empList));


	}}
