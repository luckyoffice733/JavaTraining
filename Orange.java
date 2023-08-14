package com.demo;

public class Orange extends Fruit{ //child class
	
	@Override
	public void eat() {
     System.out.println("Every one can eat Organe fruit ");
	}
	
	public void display() {
		System.out.println("Orange fruit we can eat");
	}
	
	
	public static void main(String args[]) {
		//A super class reference variable holding its subclass object
		Fruit fobj = new Orange();// 
		
		//it will search the method based on methodSignature in superclass if its available
	    //then it will come to child class(sub class) and it will search for the method
	    //with same signature(override method) ,if its available the it will call the subclass method
		//if not available it will call from the super class(parent class).
		fobj.eat(); //eat()
		
		
		//fobj.display(); 
		
		//it will search the method based on methodSignature in superclass if its not available
		//then it thrown an error at compilation time.
		
		
		
		
	}
	
	
	
	
}
