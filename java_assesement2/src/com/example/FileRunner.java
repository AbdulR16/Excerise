package com.example;

import java.io.*;

public class FileRunner {
	
	public static void appendFiles(String permFile, String tmpFile) throws IOException {
		try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(permFile, true));
		BufferedReader read = new BufferedReader(new FileReader(tmpFile));
		String str;
		while ((str = read.readLine()) != null) {
		writer.write(str);
		}
		read.close();
		writer.close();
		} catch (IOException e) {
		}
		}
	
	
	


		public static void main(String[] args) throws IOException {

		
			String permFile = "E:\Fruit.txt";
			String tmpFile = "E:\File.txt";

			appendFiles appends = new appendFiles(permFile, tmpFile);
			
			File file = new file("E:\\File.txt");
			
			if(file.delete()) {
				System.out.println("File deleted");
			}else {
				System.out.println("file not Deleted");
			}
			
			}
			}
