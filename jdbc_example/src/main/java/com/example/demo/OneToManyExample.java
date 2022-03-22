package com.example.demo;
import java.util.*;

import com.example.demo.daos.Patient;
import com.example.demo.entity.oneto.many.Doctor;
import com.example.demo.utils.DbConnection;

import java.sql.*;

public class OneToManyExample {

	public static void main(String[] args) {
		
		Connection con = DbConnection.getOracleConnection();
		
		String sql1 ="insert into abdul_doctor1 values(?,?,?,?,?,?)";
		String sql2 ="insert into abd_patient1 values(?,?,?,?)";
		
		int rowAdded = 0;
		int rowAdded2 =0;
		
		try(PreparedStatement pstmt = con.prepareStatement(sql1);
				PreparedStatement pstmt2 = con.prepareStatement(sql2)){
		
		Patient ram= new Patient(909,"ram","chennai",101);
		Patient john= new Patient(921,"john","theni",101);
		
		
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		
		
		patientList.add(john);
		patientList.add(ram);
		
		Doctor t = new Doctor(326,"Haiikj",474747,"hai@mail.com","ent","mumbai",patientList);
		
			
			pstmt.setInt(1, t.getDoctorId());
			pstmt.setString(2, t.getDoctorName());
			pstmt.setLong(3, t.getHandPhone());
			
			pstmt.setString(4, t.getEmail());
			pstmt.setString(5, t.getSpecialisation());
			pstmt.setString(6, t.getCity());
			
		 
	
		rowAdded = pstmt.executeUpdate();
		
		List<Patient> patList = t.getPatientList();
		
		for(Patient eachPatient:patList) {
			
			pstmt2.setInt(1,eachPatient.getPatitId());
			pstmt2.setString(2, eachPatient.getPatientName());
			pstmt2.setString(3, eachPatient.getAddress());
			pstmt2.setInt(4,eachPatient.getDoctorRef());
			
			
			rowAdded2 = pstmt2.executeUpdate();
		}
		
		
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Row Added="+ rowAdded);
		System.out.println("Row Added="+ rowAdded2);

}
}