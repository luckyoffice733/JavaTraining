package com.demo;

public class ExampleOnIf {
 
	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		boolean bool=true;
		//conditional statement if
		
		if(a<b) { //false
			System.out.println("a is less than b");
		}
		
		if(!bool) {//false
			System.out.println("we are in if block");
		}
		
		//System.out.println("Rest of the code");
		
		if(a<b)
			System.out.println("a is less than b without braces");
		
			System.out.println("rest of the code");
		
		
		
	
	}
}
