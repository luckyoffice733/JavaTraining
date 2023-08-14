package com.demo;

//making is a relation with animal class
public class Dog extends Animal{  //child class
    String name="lab";
	
	public void eat() {
		System.out.println("dog is eating food");
	}
	
	public void display() {
		System.out.println("My Dog name is : "+name);
	}
	
	public static void main(String[] args) {
		
		 Dog  dobj = new Dog(); //creating the object for child class
		 
		 //by using dog object we can access and modify the
		 //parent class and child variables also we can access the methods.
		 
		 //dobj.name="greman sheperad";
		 
		 dobj.display();
		 dobj.eat(); //
		 
		 
	}
	
	
}
