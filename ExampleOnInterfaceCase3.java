package com.demo;

public class ExampleOnInterfaceCase3 extends Ex1 implements I5{

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodTwo of implementation class");
	}

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodThree of implementation class");
	}

	public static void main(String[] args) {
		
		//recommeded is 2ndway of object creation
		
		ExampleOnInterfaceCase3 exOnCase3 = new ExampleOnInterfaceCase3();
		exOnCase3.methodOne();
		exOnCase3.methodTwo();
		exOnCase3.methodThree();
		
		
		
	}
	
	
}
