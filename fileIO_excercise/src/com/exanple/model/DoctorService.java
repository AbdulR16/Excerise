package com.exanple.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;


public class DoctorService {
	
	public boolean writeToDocFile(Doctor doctor,File file) {
		
		boolean result = false;
		
		try(PrintWriter writer = new PrintWriter(new FileWriter(file,true))){
			writer.println(doctor);
			result = true;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public List<Doctor> readFromTextFile(File file){
	
	List<Doctor> docList= new ArrayList<Doctor>();
	
	String line =null;
	
	try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
		
		while((line = reader.readLine())!=null) {
			
			String [] values = line.split(",");
			
			int doctorId = Integer.parseInt(values[0]);
			
			String doctorName = values[1];
			String specialization =values[2];
			String location = values[3];
			
			
			Doctor doc = new Doctor(doctorId,doctorName,specialization,location);
			
			docList.add(doc);
			
		}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	
		return docList;

}
	public List <Doctor> getByCondition(Collection<Doctor> list,Predicate <Doctor> condition){
		
		
		return list.stream().filter(condition).collect(toList());
		
	}


}


