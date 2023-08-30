package com.training.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestOnStreamConfiguringAndProcessing {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>(); 
		l1.add(0); 
		l1.add(15);
		l1.add(10); 
		l1.add(5);
		l1.add(30);
		l1.add(25); 
		l1.add(20); 
		System.out.println(l1);	
		
		//map is used to process the each object
		List<Integer> l2=l1.stream().map(i-> i+10).collect(Collectors.toList()); 
		System.out.println(l2);
		
		//counting the even objects from the l1 
		System.out.println("Even numbers");
		l1.stream().filter(i->i%2==0).forEach(System.out::println); 
		//System.out.println(count); 
		
		Long count=l1.stream().filter(i->i%2==0).count();
		System.out.println("Even Numbers "+count); 
		
		//by defaulting it will display in insertion order we can convert into 
		//sorted order (ascending order)
		List<Integer> l3=l1.stream().sorted().collect(Collectors.toList()); 
		System.out.println("Sorteing Order Ascending:");
		System.out.println(l3); 
		
		//
		Comparator<Integer> comp=(i1,i2)->i2.compareTo(i1); 
		List<Integer> l4=l1.stream().sorted(comp).collect(Collectors.toList());
		System.out.println("Custom Sortin Descennding Order:");
		System.out.println(l4); 
		
		//min number from the group of integers
		Comparator<Integer> comp1=(i1,i2)->i1.compareTo(i2); 
		Integer min=l1.stream().min(comp1).get(); 
		System.out.println("min value is :"+min);
		
		Integer max=l1.stream().max(comp1).get(); 
		System.out.println("max value is :"+max);
		System.out.println("FirstWay");
		l3.stream().forEach(i->System.out.println(i)); 
		
		System.out.println("SecondWay");
		l3.stream().forEach(System.out::println); 
		
	}
}
