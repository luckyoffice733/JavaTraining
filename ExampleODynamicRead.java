package com.demo;

import java.util.Scanner;

public class ExampleODynamicRead {

	
  public static void main(String[] args) {
	
	  //reading the data from the user(keyboard) at the runtime
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the integer value");
	  int x = sc.nextInt();
	  
	  System.out.println("Enter the float  value");
	  float f1= sc.nextFloat();
	  
	  System.out.println("X value is : "+x);
	  System.out.println("f1 value is : "+f1);
	  
	  sc.close();
	  
	  
	  
	  
}
	
	
}
