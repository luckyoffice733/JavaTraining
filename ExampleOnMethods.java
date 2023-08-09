package com.demo;

public class ExampleOnMethods {

	int empId=1001; //instance variable
	
    //instance  method  without returtype and no parameters
	void methodOne() {  //empty return type  //access modifier is default
		int num=10; //local variable must be intialized before use it.
		System.out.println(num);
		System.out.println("we are in method One");
	
	}
	//instance method with return Type int and parameters
	public int getAddition(int x ,int y ){
		int z=x+y;
		return z;
	}
	
	protected String getMessage() {
		return "welcome to methods";
	}
	
	static int collegeId =101; //static variable
	//static methods
	public static void methodTwo() {//empty return
		System.out.println("we are in static method");
	}
	
	public static int getMarksOfThreeSubject(int m1,int m2,int m3) {
		int total = m1+m2+m3;
		return total;
	}
	
	
	//by using object we can access instance variables and methods.
	public static void main(String[] args) {
		ExampleOnMethods eoms = new ExampleOnMethods();
		
		eoms.methodOne(); //calling a method
		int result =eoms.getAddition(20,30); //getAddition(int,int)
		System.out.println("sum of two numbers is : "+result);
		System.out.println(eoms.getAddition(40,50));
		
		String str1 =eoms.getMessage();
		System.out.println(str1);
		
		System.out.println("employee id is : "+eoms.empId);
		
	//recommended by using className we can access static variables and static methods
	
		ExampleOnMethods.methodTwo();
		int totalMarks=ExampleOnMethods.getMarksOfThreeSubject(80,70,50); 
		                         //getMarksOfThreeSubject(int,int,int)
		
		System.out.println("Marks of Three subject Total : "+totalMarks);
		System.out.println("Colleget Code is : "+ExampleOnMethods.collegeId);
		//or directly call static variables and methods in another static method.
		System.out.println("2nd way");
		//or directly call static variables and methods in another static method.
		
		methodTwo();
		int tal =getMarksOfThreeSubject(40,60,90);
		System.out.println(tal);
		System.out.println("Colleget Code is : "+collegeId);
		
	  //try or error here we are checking can we call static variable and
	  //static methods by using object ?
	///eoms.methodTwo();
		
	}
	
	
}
