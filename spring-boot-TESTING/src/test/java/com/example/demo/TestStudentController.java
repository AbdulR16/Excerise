package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import com.example.demo.controllers.StudentController;
import com.example.demo.service.StudentService;

@SpringBootTest
@AutoConfigureMockMvc
public class TestStudentController {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Mock
	private StudentService service;
	
	@InjectMocks
	private StudentController controller;
	
	@Test
	@DisplayName("Test Get All Student Method return the Names")
	void testForGetAllStudents() throws Exception {
		
		mockMvc.perform(get("/students")).andExpect(status().is(200))
						.andExpect(content().string("Kamala,Vimala"));
		
	}
	@Test
	@DisplayName("Test Get All Student Method return the NamesStudent By Id method return the name Kamala for Id 1")
	void testForByStudents() throws Exception {
		
		mockMvc.perform(get("/students/1")).andExpect(status().is(200))
						.andExpect(content().string("Kamala"));
		
	}

}
