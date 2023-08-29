package com.training.set;

import java.util.Set;
import java.util.TreeSet;

public class ExampleOnTreeSetCustomSorting {
	public static void main(String[] args) {
		
		Set<Integer> ts = new TreeSet<Integer>(new MyComparator());
		
		ts.add(30);
		ts.add(40);
		ts.add(10);
		ts.add(50);
		ts.add(20);
		ts.add(40);
		ts.add(50);
		System.out.println("Custom sorting i.e descending order");
		System.out.println(ts);
		
		
}
}