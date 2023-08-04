package com.demo;

public class ExampleOnTernaryOperator {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		 // Datatype variableName =Expression1?Expression2:Expression3;
		
		int res=(a<b)?a:b; //here condition if false it will return b
		
		System.out.println("The result is: "+res);
		
		String str1 = (a>b)?"a is greater than b ":"b is greater than a";
		
		System.out.println(str1); //
		
		
	
	}
	
	
}
