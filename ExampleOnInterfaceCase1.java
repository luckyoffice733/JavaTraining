package com.demo;

public class ExampleOnInterfaceCase1 implements I2{

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
	  System.out.println("we are in methodOne");	
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodTwo");
	}

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("We are in methodTHree");
	}

   public static void main(String[] args) {
	
	   //Interface Reference variable holding its implementation class Object
	   
	   I2 iobj = new ExampleOnInterfaceCase1();
	   iobj.methodOne();
	   iobj.methodTwo();
	   iobj.methodThree();
	   
	   //2nd
	   
	   ExampleOnInterfaceCase1 exonCase1 = new ExampleOnInterfaceCase1();
	   System.out.println("2nd way of creating object for interface and its implementation class");
	   exonCase1.methodOne();
	   exonCase1.methodTwo();
	   exonCase1.methodThree();
}

}
