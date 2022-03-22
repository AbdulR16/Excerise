package com.example.demo.utils;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DbConnection {
	
	public static Connection getOracleConnection() {
		
		Connection con = null;
		
		
			try {
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				
				InputStream inStream = DbConnection.class.getClassLoader().getResourceAsStream("DbConnection.properties");
				
				Properties props = new Properties();
				
				props.load(inStream);
				
				con = DriverManager.getConnection(props.getProperty("datasource.oracle.url"),
								props.getProperty("datasource.oracle.userName"),
								props.getProperty("datasource.oracle.password"));
			} catch (SQLException   | IOException e) {
				e.printStackTrace();
			}
			
		
		return con;
	}
	
	public static Connection getPostgresConnection() {
		
		Connection con = null;
		
		
			try {
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				
				InputStream inStream = DbConnection.class.getClassLoader().getResourceAsStream("DbConnection.properties");
				
				Properties props = new Properties();
				
				props.load(inStream);
				
				con = DriverManager.getConnection(props.getProperty("datasource.postgres.url"),
								props.getProperty("datasource.postgres.userName"),
								props.getProperty("datasource.postgres.password"));
			} catch (SQLException   | IOException e) {
				e.printStackTrace();
			}
			
		
		return con;
	}
	

}
