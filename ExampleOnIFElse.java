package com.demo;

import java.util.Scanner;

public class ExampleOnIFElse {

	public static void main(String[] args) {
		
		//int x=10;
		//int y=20;
		
		Scanner scobj = new Scanner(System.in);
		
		System.out.println("Enter the value for X : ");
		int x = scobj.nextInt();
		
		System.out.println("Enter the value for Y : ");
		int y = scobj.nextInt();
		
		if(x>y) {//true
			System.out.println("X is greater than y ");
		}else {
			System.out.println("Y is greater than x");
		}
		
		
		
		
	}
	
	
}
