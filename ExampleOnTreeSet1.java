package com.training.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExampleOnTreeSet1 {
 
	public static void main(String[] args) {
		
		Set<Integer> ts = new TreeSet<Integer>();
		
		ts.add(30);
		ts.add(40);
		ts.add(10);
		ts.add(50);
		ts.add(20);
		ts.add(40);
		ts.add(50);
		
		System.out.println("Number of elements : "+ts.size());
		System.out.println("Natural Sorting order i.e ascending :"+ts);
		
		
		System.out.println("Displaying using for loop");
		for(Integer i :ts) {
			System.out.println(i);
		}
		
		System.out.println("Displaying using Iterator");
		Iterator<Integer> iobj =ts.iterator();
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
		
		//java8
		System.out.println("Displaying using java8");
		//ts.forEach(e -> System.out.println(e));
		ts.forEach(System.out::println);
		
		
		
	}
}
