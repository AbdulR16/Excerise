package com.example.demo;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.demo.utils.LoggingUtility;

public class Applications {
	
	//static Logger logger = Logger.getLogger(Applications.class.getClass().getName());
	
	public static void main(String[] args) {
		
		Logger LOGGER=LoggingUtility.getLogger(Applications.class);
		
		try {
			FileHandler handler = new FileHandler("mylogs.log",true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		LOGGER.severe("2.severe message");
		
		LOGGER.warning("1.warning message");
		
		//logger.info("3.java.util.logger configured successfully");
		//logger.finer("hi");
		//logger.fine("4.fine message");
		
		
	}

}
