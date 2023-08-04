package com.demo;

public class ExampleOnIfElseIf {

	public static void main(String[] args) {
		
		//comparing the three variables
		
		int x=10;
		int y=20;
		int z=30;
		
		if(x>y && x>y) {   // (F && F ==> false)
			System.out.println("X is greater than Y,Z");
			
		}else if(y>z && y>x){ // (F && T ==> false)
			System.out.println("Y is greater than X,Z");
			
		}else if(z>x && z>y) {// ( T && T -==> True)
			System.out.println("Z is greater than X,Y");
		}else {
			System.out.println("Zero value");
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
