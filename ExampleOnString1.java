package com.training.manipulation;

public class ExampleOnString1{

	public static void main(String[] args) {
		
		
		String str= new String("Hello");//it will allocate the meomry at heap
		
		String str1 = "Hello";// literal it will allocate string constant pool
		
		String str2 = new String("welcome");
		
		String str3= new String("Hello");
		
		String str4 = new String("welcome");
		
		String str5= "Hello";
			
		System.out.println(str==str1); //false
		System.out.println(str.equals(str1));//true
				
		System.out.println(str1==str5);//true
		
		System.out.println(str2==str4);//false
		
		String ex= new String("Hello");
		
		System.out.println(ex);
		System.out.println(ex.hashCode());
		//add another string world to the previous string ex
		
		ex = ex.concat(" world");
		System.out.println(ex);
		System.out.println(ex.hashCode());
		
		
	}	
}
