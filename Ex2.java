package com.training.java8features;

public class Ex2  implements XYZ{

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("We are in emthodOne of Ex2 class");
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodTwo of Ex2 Class");
	}

	@Override
	public void methodThree() {
		System.out.println("we are in methodThree override default method from xyz interface");
	}
	

	public static void main(String[] args) {
		
		Ex2 ex2obj = new Ex2();
		ex2obj.methodOne();
		ex2obj.methodTwo();
		ex2obj.methodThree();
		
		XYZ.display();
		
	}
	
}
