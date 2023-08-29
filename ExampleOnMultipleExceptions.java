package com.training.exception;

import java.util.Scanner;

public class ExampleOnMultipleExceptions {

	public static void main(String[] args) {
		
		System.out.println("statement-1");
		System.out.println("statement-2");
		try{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the denomiator :");
		int d=sobj.nextInt();
		
		int a=10/d;
		System.out.println("result : "+a);
		
		
		int arr[]= {40,30,50,60,20}; //no of elements in 5
		
		System.out.println("Enter array size :");
		int s=sobj.nextInt();
		
		for(int i=0;i<s;i++) {
			System.out.println(arr[i]);//arr[5]=?
		}
		/*
		}catch (ArithmeticException |ArrayIndexOutOfBoundsException ae) {
			// TODO: handle exception
			System.err.println(ae.getMessage());
		}finally{
			
		}*/
		
		
		}catch (ArithmeticException ae) {
			System.err.println("denominator cannot be zero");
		}catch (ArrayIndexOutOfBoundsException at) {
			System.err.println("Array contain 5 elements but try to display 6th it will exception");
		}catch (Exception e) {
			   System.out.println(e);
		}
		System.out.println("statement-3");
		System.out.println("statement-4");
		
	}

}
