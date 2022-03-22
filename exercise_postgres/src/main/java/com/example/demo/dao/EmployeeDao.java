package com.example.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.ifaces.EmployeeRepository;
import com.example.model.Employee;

public class EmployeeDao implements CrudRepository<Employee>, EmployeeRepository<Employee> {
	
		private Connection con;


	public EmployeeDao(Connection con) {
			super();
			this.con = con;
		}

	@Override
	public Employee findById(int pkey) {
		
		String sql = "select * from  Employee where id=?";
		
		Employee found = null;
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
				
				pstmt.setInt(1, pkey);
				
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				
				found=resultSetToEmployee(rs);
			}

	
	}catch (SQLException e) {
		e.printStackTrace();
	}
		

		return found;
	}

	@Override
	public List<Employee> findByBirthday(Date date) {
		
		String sql = "select * from employee where birthday=?";
		//Employee found = null;
		List<Employee> empList = new ArrayList<Employee>();

		try(PreparedStatement pstmt = con.prepareStatement(sql)){
		pstmt.setDate(1, date);

		ResultSet rs= pstmt.executeQuery();
		while(rs.next()) {
		Employee found = resultSetToEmployee(rs);


		empList.add(found);

		}
		}catch (SQLException e) {
		e.printStackTrace();
		}

		return empList;
		}
		
	

	@Override
	public List<Employee> findByWeddingAnniversary(Date date) {
		String sql = "select * from employee where weddinganniversary=?";
		//Employee found = null;
		List<Employee> empList = new ArrayList<Employee>();

		try(PreparedStatement pstmt = con.prepareStatement(sql)){
		pstmt.setDate(1, date);

		ResultSet rs= pstmt.executeQuery();
		while(rs.next()) {
		Employee found = resultSetToEmployee(rs);


		empList.add(found);

		}
		}catch (SQLException e) {
		e.printStackTrace();
		}

		return empList;
		
	}

	@Override
	public int add( Employee t) {
		String sql ="insert into employee values(?,?,?,?,?,?,?,?)";
		
		int rowAdded = 0;
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, t.getId());
			pstmt.setString(2, t.getFirstName());
			pstmt.setString(3, t.getLastName());
			pstmt.setString(4, t.getAddress());
			pstmt.setString(5, t.getEmailAddress());
			pstmt.setLong(6, t.getPhoneNumber());
			pstmt.setDate(7, t.getBirthday());
			pstmt.setDate(8, t.getWeddingAnniversary());
			
			rowAdded = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return rowAdded;
		
	}

	@Override
	public List<Employee> findAll() {
		
		String sql = "select * from employee";
		
		List<Employee> empList = new ArrayList<Employee>();

		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet  rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				Employee found = resultSetToEmployee(rs);
				empList.add(found);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		
	
	return empList;
		
		
	}

	@Override
	public int update(Employee t) {
		
		int pkey = t.getId();
		
		int rowUpdated = 0;
		
		Object rowFound = findById(pkey);
		
		if(rowFound==null) {
			System.out.println("Element not Found Hence Adding Element");
			add(t);
		}else {
			System.out.println("Element Found can be updated");
			
			String sql = "update employee set firstName=?,lastName=?,address=?,emailAddress=?,phoneNumber=?,birthday=?,weddingAnniversary=? where id=?";
			try(PreparedStatement pstmt = con.prepareStatement(sql)){
				
				
				pstmt.setString(1, t.getFirstName());
				pstmt.setString(2, t.getLastName());
				pstmt.setString(3, t.getAddress());
				pstmt.setString(4, t.getEmailAddress());
				pstmt.setLong(5, t.getPhoneNumber());
				pstmt.setDate(6, t.getBirthday());
				pstmt.setDate(7, t.getWeddingAnniversary());
				pstmt.setInt(8, t.getId());
				
				rowUpdated = pstmt.executeUpdate();
				
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			}
		
		return rowUpdated;
	}

	@Override
	public int deleteById(int pkey) {
		
		return 0;
	}
	

	@Override
	public List<Employee> findByFirstName(String firstName) throws NameNotFoundException {
		
		String sql = "select * from  employee where firstname=?";
		
		List<Employee> empList = new ArrayList<Employee>();

		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, firstName);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				Employee found = resultSetToEmployee(rs);
				empList.add(found);

			
			}} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("size"+ empList.size());
		
		if(empList.size()==0) {
			throw new NameNotFoundException();
			
		}
		
		return empList;
	}
	
	private Employee resultSetToEmployee(ResultSet rs) throws SQLException {
		
		int id = rs.getInt("id");
		String firstName = rs.getString("firstName");
		String lastName = rs.getString("lastName");
		String address = rs.getString("Address");
		String emailAddress = rs.getString("emailAddress");
		long phoneNumber = rs.getLong("PhoneNumber");
		Date birthday = rs.getDate("birthday");
		Date weddingAnniversary=rs.getDate("weddingAnniversary");
		
		Employee found = new Employee(id,firstName,lastName,address,emailAddress,phoneNumber,birthday,weddingAnniversary);
		
		//Employee found = new Employee(firstName,emailAddress);
		return found;
	}

}
