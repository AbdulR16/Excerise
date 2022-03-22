package com.example.model;

import java.util.List;

import com.example.excercise.Doctor;

public interface CrudRepository <Doctor>{
	
	public boolean add(Doctor object);//create
	public List<Doctor>findAll();//read
	public Doctor update(Doctor object,String revisedDetails);//update
	public boolean remove(Doctor object);//delete
}
