package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/students")
	public String getAllStudents() {
		
		return "Kamala,Vimala";
	}
	
	@GetMapping("/students/{id}")
	public String getStudentById(@PathVariable("id") int id) {
		
		return this.service.getStudent(id);
	}

}
