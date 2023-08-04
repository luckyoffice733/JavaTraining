package com.demo;

public class ExampleOnTypeCasting {

	public static void main(String[] args) {
		
		int a=10;  //4bytes
		System.out.println("int value of a : "+a);//10
		
		//dataType variableName;
		double d;   //8 bytes
		
		d = a; //typecasting  widening casting casting/implicitly
		
		System.out.println("After implicit type casting ");
		System.out.println("double value of a is : "+d);//10.0
		
		
		char ch ='A';
		System.out.println("character value of ch is : "+ch);
		
		int c1 = ch; //char converting into int 
		System.out.println("After casting : "+c1);
		
		
		//Explicitly Casting
		System.out.println("==================================");
		System.out.println("Explicitly Casting");
		System.out.println("==================================");
		
		 double num1=45; //8 bytes
		 System.out.println("double value before type casting is : "+num1);//45.0
		
		 int i1;  //4 bytes
		 
		 //convert the num1 type double into int type
		 
		 i1=(int) num1; // 
		 
		 System.out.println("After Explicitly casting from double to int");
		 System.out.println("value is : "+ i1);//45
		 
		
		 int i2 = 100;
		 System.out.println("Before the type casting : "+i2);
		 //convert i2 type int into char type
		 
		 char ch1 =(char)i2;
		 
		 System.out.println("After typecast int to char : "+ch1);
		 
		 
		 
		 
		
		
		
		
		
		
		
	}
	

}
