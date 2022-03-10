package com.example.demo.repo;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository {
	
	String findById(int id);

}
