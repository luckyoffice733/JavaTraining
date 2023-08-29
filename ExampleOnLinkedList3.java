package com.training.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ExampleOnLinkedList3 {

	public static void main(String[] args) {
		
		List<Course> li = new LinkedList<Course>();
		
		//create the Course objects and store into the LinkedList
		
		Course c1=new Course();
		c1.setCourseId(101);
		c1.setCourseName("java");
		c1.setFee(5000);
		
		Course c2 = new Course(102,"C",3000);
		Course c3 = new Course(103,"Tudexo",10000);
		Course c5 = new Course(102,"C",3000);
		
		li.add(c1);
		li.add(c2);
		li.add(c3);
		li.add(new Course(104,"React",4000));
		li.add(c5);

		
	   System.out.println("Size of elements :"+li.size());
		System.out.println(li);
		
		System.out.println("Displaying the elements using ListIterator Forward");
		  ListIterator<Course> iobj=  li.listIterator();
		while(iobj.hasNext()) {
                Course cobj=iobj.next();
                System.out.println(cobj.getCourseId()+" "+cobj.getCourseName()+" "+cobj.getFee());
		}
		
		System.out.println("Displaying the elements using ListIterator Backword");
		while(iobj.hasPrevious()) {
            Course cobj=iobj.previous();
            System.out.println(cobj.getCourseId()+" "+cobj.getCourseName()+" "+cobj.getFee());
	}
		
		//forlloop
		System.out.println("Displaying using the foreach enhanced loop");
		for(Course cobj:li) {
			  System.out.println(cobj.getCourseId()+" "+cobj.getCourseName()+" "+cobj.getFee());
		}
		
		//java8
		System.out.println("Displaying using the Java8 forEach using lambda");
		li.forEach(cobj -> System.out.println(cobj.getCourseId()+" "+cobj.getCourseName()+" "+cobj.getFee()));
		
		
		
		
	}
	
	
}
