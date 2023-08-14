package com.demo;

public class ExampleOnMyAppImpl2 extends ExampleOnMyAppImpl1{

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodThree");
	}
	
	
	public static void main(String[] args) {
		
	  //Interface Reference holding its implementation class Object
		//Recommended
		MyApp myappObj = new ExampleOnMyAppImpl2();
		
		int res=myappObj.methodOne();
		System.out.println(res);
		
		System.out.println(myappObj.methodTwo("sravan"));
		
		myappObj.methodThree();
		
		
		//2ndway
		ExampleOnMyAppImpl2 exonmyapp2 = new ExampleOnMyAppImpl2();
		System.out.println("Calling the interface implementation methods using 2ndway");
		
		System.out.println(exonmyapp2.methodOne());
		System.out.println(exonmyapp2.methodTwo("Raju"));
		exonmyapp2.methodThree();
	}
	
}
