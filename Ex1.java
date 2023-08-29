package com.training.java8features;

public class Ex1 implements XYZ{

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodOne of ex1 class");
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
	  System.out.println("We are in methodTwo of ex1 class");	
	}
	
	public static void main(String[] args) {
		
		Ex1 ex1 = new Ex1();
		ex1.methodOne();
		ex1.methodTwo();
		
		ex1.methodThree();
		
		XYZ.display();
		
	}
   
}
