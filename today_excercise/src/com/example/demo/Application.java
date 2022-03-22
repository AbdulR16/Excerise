package com.example.demo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.demo.utils.*;

public class Application {

	public static void main(String[] args) {
		

		Logger logger=LoggingUtility.getLogger(Application.class);

		FileHandler handler;
		try {

		handler =new FileHandler("logs.log",true);

		logger.addHandler(handler);

		} catch (SecurityException e1) {

		e1.printStackTrace();
		}catch( IOException e1) {
		e1.printStackTrace();
		}


		Customer shyam=null;

		try {
		shyam=new Customer(105, "Abdul", 5000, "abd@gmail.com");
		logger.info(shyam.toString());
		} catch (Exception e) {

		

		}


		}


		
	}

}
