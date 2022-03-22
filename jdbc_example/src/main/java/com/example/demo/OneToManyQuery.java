package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.utils.DbConnection;

public class OneToManyQuery {

	public static void main(String[] args) {
		
		Connection con = DbConnection.getOracleConnection();
		
		String sql = "select d.doctorId,d.doctorName,p.patientName,p.address from abdul_doctor1 d,abd_patient1 p where d.doctorId=p.doctor_Ref ";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
