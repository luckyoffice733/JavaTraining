package com.training.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleOnHashSet1 {

	public static void main(String[] args) {
		
		Set sobj = new HashSet();
		
		sobj.add(10);
		sobj.add("ramu");
		sobj.add("laxmi");
		sobj.add(40.0);
		sobj.add('e');
		sobj.add("laxmi");
		sobj.add(10);
		sobj.add(true);
		
		System.out.println("Number of elements in Set is : "+sobj.size());
		System.out.println(sobj);
		
		sobj.remove("laxmi");
		System.out.println("after remove");
		System.out.println(sobj);
		
		boolean b =sobj.contains("laxmi");//search
		System.out.println(b);
		
		System.out.println("using Forloop");
		for(Object o :sobj) {
			System.out.println(o);
		}
		
		System.out.println("using java8 forEach ");
		sobj.forEach(hs->System.out.println(hs));
		
		
		System.out.println("using iterator");
		Iterator<Object>iobj=sobj.iterator();
		
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
		
		
	}
	
	
}
