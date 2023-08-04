package com.demo;

public class ExampleOnSwitchCase2 {

	
	public static void main(String[] args) {
		
		int num1=3;
		String msg;
		
		//switch statement to check the same
		
		switch(num1) {//22
		
		case 1 : msg="HI";
		          break;
		          
		case 2 : msg="Welcome";
		           break;
		           
		case 3 : msg="Welcome to java class";
                 break;
		
         default : msg="No case expression is matched";
		
		}
		
		System.out.println(msg);
		
		
		
		
	}
	
}
