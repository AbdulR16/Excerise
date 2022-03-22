package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.daos.Patient;
import com.example.demo.entity.oneto.many.Doctor;
import com.example.demo.utils.DbConnection;

public class ReverseClass {
	
	public static void main(String[] args) {
		
		Connection con = DbConnection.getOracleConnection();
		
		List<Patient> patList=new ArrayList<>();
		String sql="select *  from abdul_doctor1 d, abd_patient1 p where d.doctorId = p.doctor_ref and d.doctorId=101";		
		Doctor found =null;
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				
				int doctorId =rs.getInt("doctorId");
				String city=rs.getString("city");
				String doctorName=rs.getString("doctorName");
				String email=rs.getString("email");
				long handPhone=rs.getLong("handPhone");
				String specialisation=rs.getString("specialisation");
				
				found = new Doctor(doctorId, doctorName, handPhone, email,specialisation,city);
				
				 int id = rs.getInt("patientId");
				 String patientName= rs.getString("patientName");
				 String address= rs.getString("address");
				 int doctor_ref= rs.getInt("doctor_ref");
				 
				 Patient patient = new Patient(id, patientName, address, doctor_ref);
				 patList.add(patient);
				 
			}
			found.setPatientList(patList);
		}
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println(found);
		}}
