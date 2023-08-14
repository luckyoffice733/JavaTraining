package com.demo;

public class TestEmployeeData {

	public static void main(String[] args) {
		
		Employee eobj = new Employee();
		
       //setting up the or initializing private instance variables.
		
		eobj.setEmpId(100);
		eobj.setEmpName("Ramu");
		eobj.setEmpSal(30000);
		
		//access the private instance variables using getter methods.
		
	  System.out.println("Employee Details are : ");
	  System.out.println(eobj.getEmpId());
	  System.out.println(eobj.getEmpName());
	  System.out.println(eobj.getEmpSal());
		
	}
	
	
}
