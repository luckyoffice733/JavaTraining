package com.training.list;

import java.util.ArrayList;
import java.util.List;

public class ExampleOnList2 {

	public static void main(String[] args) {
		
		//Creating an ArrayList Object to Store specific Type(Generics)
		
		List<String> al = new ArrayList<String>();
		
		  al.add("Raju");
		  al.add("Martin");
		  al.add("Scott");
		  al.add("Allen");
		  al.add("clare");
	
		  System.out.println("Number of elements in arraylist : "+al.size());
		  
		  //get the object based on specific index position
		  String nm=al.get(2);
		  System.out.println("Object at specific index position 2 is : "+nm);
		  
		  System.out.println(al);
		  //to replace an object or element at specific position we will use set()
		  al.set(3,"smith");
		  System.out.println("After replace: ");
		  System.out.println(al);
		  
		  //search for an object or element in List  using contains
		 boolean b= al.contains("smith");
		 System.out.println("Search is found or not : "+b); 
		
		 //enhanced for loop
		 System.out.println("using enhanced for loop");
		 for(String s: al) {
			 System.out.println(s);
		 }
		 
		  //java8 forEach
		 System.out.println("Display element using java8 for loop");
		  al.forEach(e -> System.out.println(e));
		
	}
	
	
}
