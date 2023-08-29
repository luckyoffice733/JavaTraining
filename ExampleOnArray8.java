package com.training.arrays;

public class ExampleOnArray8 {

	public  int[] getEmpSalaries() {
		
		int arr[]= {3000,4000,5000,1000};
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		ExampleOnArray8 eoa8 = new ExampleOnArray8();
		
		int empSal[]=eoa8.getEmpSalaries();
		
		System.out.println("Employee salaries are  : ");

		for(int a:empSal) {
			System.out.println(a);
		}
		
	}
	
	
}
