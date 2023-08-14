package com.demo;

public class Car extends Vehicle{
      
	String vColor="Red";
	String carName="seltos";
	
	public void start() {
		super.start(); //by using super keyword we call parent/super class 
		               //methods.
		System.out.println("Car can start with push button");
		
	}
	
	public void display() {
		
		System.out.println("Car name is : "+carName);
		System.out.println("Car Color is :"+vColor);
		System.out.println("vColor from parent class : "+super.vColor);
		
	}
	
	public static void main(String args[]) {
		Car  cobj = new Car();
		
		cobj.display();
		cobj.start();
	
	}
	
	
	
}
