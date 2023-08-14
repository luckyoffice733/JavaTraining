package com.demo;

public class ExampleOnMethodOverloadingTypePromotion {


	/*
	 * public void methodOne(char a) {
	 * System.out.println("we are in methodOne of char type parameter "+a);
	 * 
	 * }
	 */
	public void methodOne(int a) {
		System.out.println("we are in methodOne of int type parameter "+a);
	
	}
	
	  public void methodOne(double a) {
	  System.out.println("we are in methodOne of double type parameter "+a);
	  
	  }
	  
	  public void methodOne(int x,double a) {
		  System.out.println("we are in methodOne of int,double type parameter "+a+" "+x);
		  
		  }
	  
	  public void methodOne(Long x,double a) {
		  System.out.println("we are in methodOne of int,double type parameter "+a+" "+x);
		  
		  }
	  
	 
  public static void main(String[] args) { 
	  ExampleOnMethodOverloadingTypePromotion  movd2 = new ExampleOnMethodOverloadingTypePromotion();
	  
	 // movd2.methodOne('d'); //methodOne(char) 
	  movd2.methodOne(10L); //methodOne(Long)
	  
	  movd2.methodOne('A'); //methodOne(char)//methodOne(int)
	  
	  movd2.methodOne(10L,40.0);//methodOne(Long,double)
}
	
	
	
	
}
