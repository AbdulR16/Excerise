package com.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.example.model.Student;

public class UsingLinkedList {

	public static void main(String[] args) {
		
		Student dravid = new Student(102,"dravid",55); // student object
		Student bravo = new Student(103,"bravo",66);
		Student raina = new Student(104,"raina",88);
		
		LinkedList<Student> studList = new LinkedList<Student>();
		
		studList.add(dravid);
		studList.add(bravo);
		studList.add(raina);
		
		//Iterator <Student> itr = studList.iterator();
		//Since studList is a Linked List we can iterate on both direction next as well as previous
		ListIterator <Student> itr = studList.listIterator();
		
		System.out.println("Forward Iteration");
		while(itr.hasNext()) {
			
		System.out.println(itr.next().getStudentnmae());
		}
		
		System.out.println("BackWard Iteration");
		while(itr.hasPrevious()) {
			
			System.out.println(itr.previous().getStudentnmae());
			}
	}

}
