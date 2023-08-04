package com.demo;

public class ExampleOnSwritchCase4 {
	
   public static void main(String[] args) {
	 //Arithematic operations using switch case statement
	   
	   String  operation="m";
	   int x=30;
	   int y=10;
	   int res=0;
	   
	   switch(operation) {//+
	   
	   case "+" : res=x+y;
	               break;
	               
	   case "-" : res=x-y;
	               break;
	               
	   case "*" : res=x*y;
       				break;   
       				
	   case "%" : res=x%y;
       break;
	   
	   case "/" : res=x/y;
       break;
       
       default : System.out.println("No case is matched");
	   }
	   
	   System.out.println("Operation result is : "+res);
	   
	   
}
}
