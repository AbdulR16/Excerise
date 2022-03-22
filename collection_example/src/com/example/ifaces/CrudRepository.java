package com.example.ifaces;

import java.util.List;

import com.example.model.Student;

public interface CrudRepository <T> {
	
	public boolean add(T object);//create
	public List<T>findAll();//read
	public T updateMark(T object,double revisedMark);//update
	public boolean remove(T object);//delete
	

}
