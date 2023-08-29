package com.training.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleOnList3 {

	public static void main(String[] args) {

		//creating the ArrayList object to Store Java bean(Employee) using Generics.
		
		List<Employee> al = new ArrayList<Employee>();
		
		//first create the three employee objects
		Employee e1 = new Employee(1002,"smith",3000);
		Employee e2 = new Employee(1001,"martin",5000);
		Employee e3 = new Employee(1003,"Allen",6000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(new Employee(1004,"Scott",400));
		
		System.out.println("Number of employee objects stored is : "+al.size());
		System.out.println(al);

		//iterator 
		System.out.println("using iterator to display employee details :");
		Iterator<Employee> iobj= al.iterator();
		
		while(iobj.hasNext()) {
			Employee e=iobj.next();
			System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpSal());
		}
		
		//enhanced foreach loop
	   System.out.println("using enhanced forloop to display employee details :");		
	   for(Employee eobj : al) {
		   System.out.println(eobj.getEmpId()+" "+eobj.getEmpName()+" "+eobj.getEmpSal());
	   }

	   //java8 forEach()
	   System.out.println("using enhanced forEach() to display employee details :");
	   al.forEach(emp -> System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpSal()));
	   
	     
	}

}
