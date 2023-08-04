package com.demo;

public class ExampleOnNestedIFElse {

	 public static void main(String[] args) {
		
		 int x=10;
		 
		int y=20;
		
		if(x==10) { //(10==10)==>true
			
			System.out.println("We are in outer if x value is : "+x);
			
			//nested if
		    if(y==30) { //(30==30)
		    	System.out.println("We are in nested if block /inner if : "+y);
		    }else{
		    	System.out.println("we are in nested if else block");
		    }
		 	
			
		}
		
	}
	
	
}
