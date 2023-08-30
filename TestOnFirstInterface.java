package com.training.java8features;


public class TestOnFirstInterface {
	
	public void display() {
		System.out.println("welcome to lamda expression method referes to sayHello");
	}
	
	public static void main(String[] args) {
		
		TestOnFirstInterface  tofi = new TestOnFirstInterface();
		//1)MethodReference  to an instance method of Object
		//   syntax:  object::instanceMethod
		//implementation for methodReference
		FirstInterface fin =tofi::display;
		
		fin.sayHello();
		
		
	}
	

}
