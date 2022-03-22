package dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class DbConnection {
	
	public static  Connection getOracleConnection() {
		Connection con =null;
		try {
			
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV",
					                           "HR","HR");
			
		} catch (SQLException  | ClassNotFoundException e ) {
			
			e.printStackTrace();
		}
		
		return con;
	}

	  public static void main(String[] args) {
		
		  System.out.println(getOracleConnection());
	}
}
