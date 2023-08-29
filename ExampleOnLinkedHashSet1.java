package com.training.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleOnLinkedHashSet1 {

	public static void main(String[] args) {
		
		Set lhs = new LinkedHashSet();
		
		lhs.add("Ramu");
		lhs.add(10);
		lhs.add('e');
		lhs.add(true);
		lhs.add(20.0);
		lhs.add(10);
		lhs.add("Ramu");
		
		System.out.println(lhs.size());
		System.out.println(lhs);
		
		Set lhs1 = new LinkedHashSet();
		lhs1.add(30);
		lhs1.add("ravi");
		
		lhs1.addAll(lhs);
		
		System.out.println(lhs1);
		lhs1.removeAll(lhs);
		System.out.println("After remove : ");
		System.out.println(lhs1);
		
	}
}
