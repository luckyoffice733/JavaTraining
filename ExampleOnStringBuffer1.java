package com.training.manipulation;

public class ExampleOnStringBuffer1 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("raju");
		
		System.out.println(sb);
		
		System.out.println("reverse order : "+sb.reverse());
		
		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.append(" World");
		
		System.out.println(sb1);
		
		
		
		
	}

}
