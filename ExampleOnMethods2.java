package com.demo;

public abstract class ExampleOnMethods2 {
    //instance method
	/*
	 * public void methodOne() { System.out.println("we are in method One"); }
	 */
	// if a class contain atleast one abstract method then compiler will
    //force the user or Developer to declare the class as abstract.
	
	public abstract void methodOne(); //declaration
	
	
	public static void main(String[] args) {
	  //we cannot create a object for abstract class
		//ExampleOnMethods2 eom2 = new ExampleOnMethods2();
		
	
}
}