package com.example.functional;

@FunctionalInterface // functional interface Have only one method

public interface Coverter<T,R> {
	
	public R covert(T valuedFrom);
	
	public default double update(T valueFrom) {
		
		double result =(double) covert(valueFrom);
		
		return result +100;
	}

}
