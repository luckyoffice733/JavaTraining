package com.training.exception;

public class Calculation {
	
	public static void main(String[] args) {
		
		System.out.println("statement -1");
		System.out.println("statement-2 ");
		
		try {
		int res=10/0;
		System.out.println("result is : "+res);
		}catch(ArithmeticException ae) {
			//System.out.println(ae);
			//ae.printStackTrace();
			//System.out.println(ae.getMessage());
			System.err.println("Denominator cannot be zero");
		}
		
		System.out.println("statement-3");
		System.out.println("statement-4");
		
	}
}
