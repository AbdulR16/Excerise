package com.training;

public class Example1 {
	private String args[] ;
	public Example1(String[] args) {
	super();
	this.args = args;
	}
	public String[] getArgs() {
	return args;
	}
	public static void main(String[] args) {
	String values[] = { "1", "2" };
	Example1 example = new Example1(values);
	if (example.getArgs().length > 0) // here length is 2 so the condition should be >0;
	System.out.println("Hello World");

}
}