package com.example.demo;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dao.NameNotFoundException;
import com.example.demo.enums.DatabaseName;
import com.example.demo.ifaces.CrudRepository;
import com.example.demo.ifaces.EmployeeRepository;
import com.example.demo.utils.ConnectionFactory;
import com.example.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Connection con = ConnectionFactory.getConnection(DatabaseName.POSTGRES);
        
        CrudRepository repo = new EmployeeDao(con);
        
        EmployeeRepository drepo = new EmployeeDao(con);
        
        int key =6;

        switch(key)
        {
        case 1:
        int rowAdded = repo.add(new Employee(105, "Ravi", "Ashwin",
        		"Tenkasi","abg@gmail.com",85759646,Date.valueOf(LocalDate.of(1998, 05, 10)) ,
        		Date.valueOf(LocalDate.of(2025, 01, 25))));	
        
        System.out.println("Row Added : = "+rowAdded);
        break;
        case 2:
        	 List<Employee> listemp=null;
			try {
				listemp = drepo.findByFirstName("harris");
			} catch (NameNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 listemp.forEach(System.out::println);
        break;
        case 3:
        	Employee emp =new Employee(105, "virat", "Dhoni",
            		"Kerala","bcg@gmail.com",85759646,Date.valueOf(LocalDate.of(1998, 05, 10)) ,
            		Date.valueOf(LocalDate.of(2025, 01, 25)));	
        	int rowUpdated = drepo.update(emp);
        	System.out.println("Row Updated ="+rowUpdated);
        break;
        case 4:
        	List<Employee> dateList = drepo.findByBirthday(Date.valueOf(LocalDate.of(1999, 8, 8)));
        	Map<String, String> empFnameAndEmail = dateList.stream().collect(Collectors.toMap(Employee::getFirstName, Employee::getEmailAddress));
        	Set<Entry<String, String>> setView = empFnameAndEmail.entrySet();
        	for(Entry<String,String> list: setView) {
        	System.out.println("FirstName: "+list.getKey()+ " email: " + list.getValue());
        	}
        	break;
        case 5:
        	List<Employee> phoneList = drepo.findByWeddingAnniversary(Date.valueOf(LocalDate.of(2023,10,25)));
        	Map<String, Long> empFnameAndphone = phoneList.stream().collect(Collectors.toMap(Employee::getFirstName, Employee::getPhoneNumber));
        	Set<Entry<String, Long>> setView1 = empFnameAndphone.entrySet();
        	for(Entry<String, Long> list: setView1) {
        	System.out.println("FirstName: "+list.getKey()+ " phoneNumber: " + list.getValue());
        	}
        	break;
        case 6:
        	List<Employee> allList = drepo.findAll();
        	Map<String, Long> empFnameAndphone1 = allList.stream().collect(Collectors.toMap(Employee::getFirstName, Employee::getPhoneNumber));
        	Set<Entry<String, Long>> setView2 = empFnameAndphone1.entrySet();
        	for(Entry<String, Long> list: setView2) {
        	System.out.println("FirstName: "+list.getKey()+ " phoneNumber: " + list.getValue());
        	}
        	break;
    }
}
}