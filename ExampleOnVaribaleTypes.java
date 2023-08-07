package com.demo;

public class ExampleOnVaribaleTypes {

	//instance variables or non-static variables
	
	int studentId = 1001;
	String StudentName = "Raju";
	
	static int collegeCode = 301;  //static variable
	
	
	//instance method
	public void methodOne() {
		int a=10; //local variable
		System.out.println("we are in instance method from methodOne");
		System.out.println(a);
	}
	
	//static method
	public static void methodTwo() {
		System.out.println("we are in static method from methodTwo");
	}
	
	
	public static void main(String[] args) {
		
		ExampleOnVaribaleTypes eovt = new ExampleOnVaribaleTypes();
		
		System.out.println("Accessing the instance Variables");
		System.out.println(eovt.studentId);
		System.out.println(eovt.StudentName);
		
		System.out.println("Accessing the static variables using ClassName");
		System.out.println(ExampleOnVaribaleTypes.collegeCode);
		
		System.out.println("Accessing instance method");
		eovt.methodOne();
		
		
		System.out.println("Accessing the static method Using ClassName");
		ExampleOnVaribaleTypes.methodTwo();
		
		
		
	}
	
	
	
	
	
	
	
	
}
