package com.example.demo.ifaces;

import java.sql.Date;
import java.util.List;

import com.example.demo.dao.NameNotFoundException;
import com.example.model.Employee;

public interface EmployeeRepository<T> extends CrudRepository<T> {
	
	public List<Employee> findByBirthday(Date date);
	public List<Employee> findByWeddingAnniversary(Date date) ;
	public List<Employee> findByFirstName(String firstName)throws NameNotFoundException;

	


}
