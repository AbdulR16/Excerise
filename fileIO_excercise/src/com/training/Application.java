package com.training;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;

import com.exanple.model.Doctor;
import com.exanple.model.DoctorService;

public class Application {

	public static void main(String[] args) {
		
		DoctorService docService = new DoctorService();
		
		File file = new File("DoctorList.txt");
		
		System.out.println("enter 1 to read the file 2 to write");
		
		Scanner sc = new Scanner(System.in);
		
		int value=sc.nextInt();
		
		switch(value) {
		case 1:
		Doctor doc1 = new Doctor(16,"abdul","Eye Doctor","Tnagar.chennai");
		boolean result = docService.writeToDocFile(doc1,file);
		if(result) {
			System.out.println("File is Created and Record Added");
		}else {
			System.out.println("Exception- check in the console");
		}
		break;
		case 2:
			List<Doctor> docList = docService.readFromTextFile(file);
			docList.forEach(System.out::println);
			break;
		case 3:
			Predicate<Doctor> check = e->e.getSpecialization().equals("Eye Doctor");
			
			List<Doctor> doctorList = docService.readFromTextFile(file);
			
			List<Doctor> list = docService.getByCondition(doctorList,check);
			list.forEach(System.out::println);
			break;
		case 4:
			Predicate<Doctor> check1 = e->e.getLocation().equals("velachery.chennai");
			
			List<Doctor> locationList = docService.readFromTextFile(file);
			
			List<Doctor> list1 = docService.getByCondition(locationList,check1);
			list1.forEach(System.out::println);
			break;
		case 5:
			Predicate<Doctor> specializationCheck = e->e.getSpecialization().equals("Eye Doctor") &&  e.getLocation().equals("velachery.chennai");
			List<Doctor> doctorList1 = docService.readFromTextFile(file);
			List<Doctor> finalList =  docService.getByCondition(doctorList1,specializationCheck);
			finalList.forEach(System.out::println);


	}

}
}