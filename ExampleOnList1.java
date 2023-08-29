package com.training.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleOnList1 {

	public static void main(String[] args) {
		
	 //creating ArrayList object
	//	ArrayList al = new ArrayList();
	 //recommended way is Interface Reference varibale holding its implementation 
		//class Objects
		
		List  lobj = new ArrayList();
		
		lobj.add(40);//Integer
		lobj.add("hello");//String
		lobj.add(true);//Boolean
		lobj.add('a');//Character
		lobj.add(10.0f);//Float
		lobj.add(new Integer(50));
		System.out.println("NUmber of elements stored in arrayList : "+lobj.size());
		System.out.println("Inseration Order is Preserved");
		System.out.println(lobj);
		
		//foreach loop
		System.out.println("Elements from ArrayList using enhanced for loop (element by element)");
		for(Object ol : lobj) {
			System.out.println(ol);
		}
		
		
		//adding an object or element at Specific index position
		lobj.add(3,"Ramu");
		System.out.println("After adding an element at specific postion ");
		System.out.println(lobj);
		
		//remove an element based on Object name
		lobj.remove("hello");
		
		System.out.println("After remove an object ");
		System.out.println(lobj);
		
		Iterator iobj =lobj.iterator();
		System.out.println("Displaying the elements using Iterator");
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
		
	}
	
	
}
