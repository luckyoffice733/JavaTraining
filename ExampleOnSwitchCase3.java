package com.demo;

public class ExampleOnSwitchCase3 {

public static void main(String[] args) {
		
		int num1=2;
		String msg;
		
		//switch statement to check the same
		//if break keyword is not used or not specifed
		
		//fall-through mechanism in java
		switch(num1) {//2
		
		case 1 : System.out.println("HI");
		          
		          
		case 2 : System.out.println("Welcome");
		           
		           
		case 3 : System.out.println("Welcome to java class");
                 
		
		case 4 : System.out.println("we are in case 4");
		
		
        default : System.out.println("No case expression is matched");
		
		}
		
	
}	
}
