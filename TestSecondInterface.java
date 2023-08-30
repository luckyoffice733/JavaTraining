package com.training.java8features;

public class TestSecondInterface {

	public static int sumOfTwoNumbers(int x,int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
	
		//Method Reference to an static method of a class
		 //syntax : ClassName::staticMethodName
	 SecondInterface soi = TestSecondInterface:: sumOfTwoNumbers;
		
		int res = soi.calculation(10,30);
		System.out.println("Calculation Values is : "+res);
	}
}
