package com.training.java8features;

public class TestOnThirdInterface {

	public static void main(String[] args) {
		
		//Method Reference to a constructor-
		//  Syntax: ClassName::new
		ThirdInterface toi =Hello::new;	
		
		System.out.println(toi.sayHello("Raju"));
		
	}
}
