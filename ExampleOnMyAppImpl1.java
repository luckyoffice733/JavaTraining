package com.demo;

public abstract class ExampleOnMyAppImpl1 implements MyApp{

	@Override
	public int methodOne() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodOne");
		return  40+50;
	}

	@Override
	public String methodTwo(String s) {
		// TODO Auto-generated method stub
		return "Welcome to Interfaces "+s;
	}

    //implicitly this class contain the abstract 
	//public abstract void methodThree();

}
