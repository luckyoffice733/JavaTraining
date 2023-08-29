package com.training.java8features;

public class TestOnLamdaAddition {

	public static void main(String[] args) {
		
		MyApp myobj = (x,y) -> x+y;
		MyInterface mobj = () -> {System.out.println("we are working lamda expresion");};
		
		
		int res=myobj.additionTwoNumbers(10,40);
		System.out.println("sum of two numerbs is : "+res);
		
		myobj.methodTwo(); //calling default method
		MyApp.methodThree();//calling static method
		
		mobj.methodOne();
		
	}
}
