package com.example.model;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Comparator;
public class UsingTerminalOperators {

	public static void main(String[] args) {
		
		List <Student> studList = StudentUtil.getStudents();
		
		Comparator<Student> markComparator = Comparator.comparing(Student::getMarkScored);
		
		Optional<Student> maxMark = 	studList.stream().max(markComparator);
		
		if(maxMark.isPresent()) {
			System.out.println("Highest Mark :="+maxMark.get().getMarkScored());
		}
		
		Optional<Double> minMark = 	studList.stream().map(e->e.getMarkScored())
					.min(Double::compareTo);
		
		if(minMark.isPresent()) {
			System.out.println("lowest Mark :="+minMark.get());
		}
		
		System.out.println("who scored More than 90 Mark");
		
		long markMoreThan90 = studList.stream().map(e->e.getMarkScored())
				.filter(e-> e>90).count();
		
		System.out.println(markMoreThan90);
		
		Map<String,Double> markList=
				  studList.stream()
				  .collect(Collectors.toMap(Student::getStudentnmae, Student::getMarkScored));
		
		Set<Map.Entry<String,Double>> set = markList.entrySet();
		
		for(Entry<String,Double> eachEntry:set) {
			
			System.out.println(eachEntry.getKey()+":"+eachEntry.getValue());
		}
		
	
	}
	


}
