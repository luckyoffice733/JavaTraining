package com.training.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleOnStreams1 {

	public static void main(String[] args) {
		
	  List<Integer>  l = new ArrayList<Integer>();
	  
	  l.add(40);
	  l.add(33);
	  l.add(2);
	  l.add(3);
	  l.add(25);
	  
	  System.out.println(l);
	  
		/*
		 * //get the all even objects from collection i
		 * System.out.println("Even object from collection i'"); for(Integer i :l) {
		 * if(i%2==0) { System.out.println(i); } }
		 */
	  
	
	  //first get the Stream object
	  System.out.println("Displaying the elements using Stream filter()");
	   l.stream().filter(e -> e%2==0).forEach(System.out::println);
		
	  
	 //get the even objects from collection l and store into another list
	   
	   List<Integer> al = l.stream().filter(e->e%2==0).collect(Collectors.toList());
	   
	   System.out.println("Even numbers from another list : ");
	  al.forEach(System.out::println);
		
	}
	
	
	
}
