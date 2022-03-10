package com.example.demo.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;
import com.example.demo.ifaces.CompanyRepository;

import lombok.AllArgsConstructor;
import java.util.*;

@Service
@AllArgsConstructor
public class CompanyService {
	
	
	private CompanyRepository repo; 
	
	
	public List<Company> findAll(){
		
		return this.repo.findAll();
	}
	
	public Company add(Company entity) {
		
		return this.repo.save(entity);
	}
	
	@Cacheable(cacheNames ="comps",key="#id")
	public Optional<Company> findById(int id){
		
		return this.repo.findById(id);
	}
	
	@CacheEvict(cacheNames = "compache",key="#id")
	public void delete(int id) {
		
		this.repo.deleteById(id);
	}
	
	@CachePut(cacheNames="compache",key="entity.companyId")
	public Company update(Company entity) {
		
		return this.repo.save(entity);
	}
}
