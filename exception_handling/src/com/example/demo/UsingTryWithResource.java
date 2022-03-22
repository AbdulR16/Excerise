package com.example.demo;
import java.util.*;
public class UsingTryWithResource {

	public static void main(String[] args) {
		

	
		try (Scanner sc = new Scanner(System.in);){ //we close inside the try block
			System.out.println("enter your name");
			
			String name=sc.next();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
