package com.example.demo;

import java.util.logging.Logger;

public class Applications {
	
	//static Logger logger = Logger.getLogger(Applications.class.getClass().getName());
	
	private static Logger LOGGER;

	  static {
	      String path = Application.class.getClassLoader()
	                  .getResource("logging.properties")
	                  .getFile();

	System.setProperty("java.util.logging.config.file", path);
	      LOGGER = Logger.getLogger(Application.class.getName());
	}

	
	public static void main(String[] args) {
		
		LOGGER.severe("2.severe message");
		
		LOGGER.warning("1.warning message");
		
		//logger.info("3.java.util.logger configured successfully");
		//logger.finer("hi");
		//logger.fine("4.fine message");
		
		
	}

}
