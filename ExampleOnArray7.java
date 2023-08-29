package com.training.arrays;

public class ExampleOnArray7 {
	
	public void getEmpSalaries(int arr[]) {
		System.out.println("Employee Salaries are : ");
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
    
	public static void main(String[] args) {
		
		ExampleOnArray7 eoa7 = new ExampleOnArray7();
		
		int empSal[] = {3000,1000,5000,6000};
		
		eoa7.getEmpSalaries(empSal);
		
		
	}
}
