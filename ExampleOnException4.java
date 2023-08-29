package com.training.exception;

public class ExampleOnException4 {

	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("statement-1");
		try {
		if(a<b) {
			throw new ArithmeticException("a is less than b"); //inbuilt exceptions
		}else {
			System.out.println("a is greater than b");
		}
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		
		System.out.println("statement-2");
		
	}
	
	
	
	
}
