package com.training.java8features;

public class TestOnLamda{

	public static void main(String[] args) {
		
		MyInterface mobj = ()->{System.out.println("welcome to Lamda expression");};
		
		mobj.methodOne();
		
		
	}
}
