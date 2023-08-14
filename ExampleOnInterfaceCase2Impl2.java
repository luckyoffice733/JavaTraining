package com.demo;
   //implementing multiple interfaces 
public class ExampleOnInterfaceCase2Impl2  implements I3,I4 {

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodTwo");
	}

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodThree");
		
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("We are in methodOne");
		
	}

	
	public static void main(String[] args) {
		//if implementing multiple interface it recommended to create the
		// object in 2nd way
		
		ExampleOnInterfaceCase2Impl2 exOncase2 = new ExampleOnInterfaceCase2Impl2();
		exOncase2.methodOne();
		exOncase2.methodTwo();
		exOncase2.methodThree();
		
		//first
		I3 iobj = new ExampleOnInterfaceCase2Impl2();
		
		  iobj.methodOne();
		
		  I4 i4obj = new ExampleOnInterfaceCase2Impl2();
		  i4obj.methodTwo();
		  i4obj.methodThree();
   		
	}
	
	
}
