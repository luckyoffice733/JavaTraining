package com.training.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ExampleOnLinkedList1 {
	
  public static void main(String[] args) {
	
	  List li = new LinkedList();
	  
	  li.add("hello");
	  li.add(10);
	  li.add(40.0);
	  li.add(false);
	  li.add('a');
	  li.add(10);
	  li.add(null);
	  
	  System.out.println("Number of elements in li linkedList is : "+li.size());
	  System.out.println(li);
	  
	  //replace element at specific position 
	  li.set(6,"Ramu");
	  System.out.println(li);
	  
	  li.remove(new Integer(10));
	  System.out.println("after remove "+li);
	  
	  //Displaying for you assignment.
	  //Displaying the elements using the ListIterator
	  
	 ListIterator iobj= li.listIterator();
	  
	 System.out.println("Displaying the elements in forward direction");
	 while(iobj.hasNext()) {
     System.out.println(iobj.next());
	 } 
	  
	 System.out.println("Displaying the elements in Backward direction");
	 while(iobj.hasPrevious()) {
     System.out.println(iobj.previous());
	 } 
	  
	  
}
}
