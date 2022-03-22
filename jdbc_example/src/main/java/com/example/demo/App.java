package com.example.demo;

import java.sql.Connection;
import java.util.List;

import com.example.demo.daos.DoctorDao;
import com.example.demo.entity.Doctor;
import com.example.demo.enums.DatabaseName;
import com.example.demo.ifaces.CrudRepository;
import com.example.demo.ifaces.DoctorRepository;
import com.example.demo.utils.ConnectionFactory;
import com.example.demo.utils.DbConnection;

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
        
        CrudRepository repo = new DoctorDao(con);
        
        DoctorRepository drepo = new DoctorDao(con);
        
        int key =2;

        switch(key)
        {

        case 1:

        int rowAdded = repo.add(new Doctor(20, "san", 343434, "san@gmail.com", "ent", "chennai"));

        System.out.println("Row Added : = "+rowAdded);

        break;

        case 2:

        repo.findAll().forEach(System.out::println);

        break;

        case 3:

        Doctor found = (Doctor)repo.findById(200);

        System.out.println(found);

        break;

        case 4 :
        System.out.println("Row Deleted: "+repo.deleteById(20));
        break;
        
        case 5:
        	Doctor docToSer = new Doctor(101, "john", 343434, "san@gmail.com", "ent", "chennai");
        	int rowUpdated = repo.update(docToSer);
        	System.out.println("Row Updated:="+rowUpdated);
        	break;
        case 6:

            List<Doctor> find = drepo.findByCity("chennai");

            find.forEach(System.out::println);
        	
        default :

        break;
        
        }
    }}