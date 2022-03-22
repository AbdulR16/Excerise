package com.example.excercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.example.service.Service;


public class Application {

	public static void main(String[] args) {
		
		
		
		Patient ram = new Patient(101,"Ram","TNagar","ram@gmail.com");
		Patient shaym = new Patient(101,"shaym","Siruseri","shaym@gmail.com");
		Patient magesh = new Patient(101,"magesh","Padur","magesh@gmail.com");
		
		Set<Patient>  patitList = new HashSet<Patient> ();
		
		patitList.add(magesh);
		patitList.add(shaym);
		patitList.add(ram);
		
		
		StaffMembers siva=new StaffMembers(201,"Siva","LabTechnician");
		StaffMembers suresh=new StaffMembers(202,"Suresh","Xray");
		StaffMembers raju=new StaffMembers(201,"raju","Scanning");
		
		 Map<String,StaffMembers> staffList = new HashMap<String,StaffMembers>();
		 
		  staffList.put("siva",siva);
		  staffList.put("suresh", suresh);
		  staffList.put("raju", raju);
		  
		  Doctor sukesh = new Doctor(301,"sukesh", "Eyedoctor", "madurai", patitList,staffList );
		  Doctor naresh = new Doctor(303,"naresh", "doctor", "tenkasi", patitList,staffList );
		  
		  Service services = new Service();
		   
		    System.out.println(services.add(sukesh));
		    System.out.println(services.add(naresh));
		    
		    List<Doctor> list =   services.findAll();
		    
		    //System.out.println(list);
		    for(Doctor eachDoctor: list) {
		    	
		    	System.out.println(eachDoctor.getDoctorName());
		    	System.out.println(eachDoctor.getPatitList());
		    	System.out.println(eachDoctor.getStaffDetails().get("siva"));
		    	
		    System.out.println(services.update(sukesh,"abdul"));
		    
		    boolean result = services.remove(naresh);
		    if(result) {
				System.out.println("doctor removed");
			} else {
				throw new RuntimeException("Doctor Not Found");
				
			}
		    
		    

	}

}}
