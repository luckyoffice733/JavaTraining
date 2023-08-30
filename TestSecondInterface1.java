package com.training.java8features;

public class TestSecondInterface1 {
	
	public static void main(String[] args) {
		
		SecondInterface soi = TestOnMethodReferences::sumOfTwoNumbers;
		System.out.println(soi.calculation(40,50));
		
	}

}
