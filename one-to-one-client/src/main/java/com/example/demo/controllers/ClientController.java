package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.CompanyDto;



@RestController
@RequestMapping("/api/v1")
public class ClientController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path="/companies")
	public ResponseEntity<CompanyDto[]> getAll(){
		
		ResponseEntity<CompanyDto[]> response =  this.template.getForEntity("http://ONE-TO-ONE-WITH-CACHE/api/v1/companies",CompanyDto[].class);
		
		return response;
	
		//return this.template.getForObject("http://ONE-TO-ONE-WITH-CACHE/api/v1/companies",CompanyDto[].class);

	}

}
