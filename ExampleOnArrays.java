package com.training.exception;

public class ExampleOnArrays {

	public static void main(String[] args) {
		
		System.out.println("statement-1");
		System.out.println("statement-2");
		
		try {
		int arr[]= {40,30,50,60,20}; //no of elements in 5
		
		for(int i=0;i<=5;i++) {
			System.out.println(arr[i]);//arr[5]=?
		}
		}catch (ArrayIndexOutOfBoundsException ae) {
			//System.out.println(ae.getMessage());
			System.err.println("Actual size of array 5 but search for 6th element it throw error");
		}
		System.out.println("statement-3");
		System.out.println("statement-4");
		
	}
	
	
}
