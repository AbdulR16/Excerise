package com.example.demo.utils;

import java.util.logging.Logger;

import com.example.demo.Applications;

public class LoggingUtility {
	
	public static Logger getLogger(Class clasName) {
		
		String path = clasName.getClassLoader()
		                  .getResource("logging.properties")
		                  .getFile();
			System.setProperty("java.util.logging.config.file", path);
		
		      //Logger logger = Logger.getLogger(loggerName,path);
		      
		      return Logger.getLogger(clasName.getName());
		}
	}


