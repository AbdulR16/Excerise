package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.repo.StudentRepository;
import com.example.demo.service.AnotherStudentService;

@SpringBootTest
@AutoConfigureMockMvc
public class TestAnotherStudentService {
	
	
	@MockBean
	StudentRepository repo;
	
	@Autowired
	AnotherStudentService service;
	
	String stud1 = "Ramesh";
	
	@Test
	void getStudent() throws Exception {
		
		BDDMockito.given(repo.findById(1)).willReturn(stud1);
		
		Assertions.assertEquals("Ramesh", service.getStudent(1));
	}

}
