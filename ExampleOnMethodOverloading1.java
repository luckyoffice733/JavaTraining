package com.demo;

public class ExampleOnMethodOverloading1 {

	public void display() {
		System.out.println("we are in display method zero parameters");
	}
	
	public void display(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print("* ");
		}
	}
	
	public void display(char n) {
		System.out.println();
		System.out.println("character to dispay is : "+n);
	}
	
	public static void main(String[] args) {
		
		 ExampleOnMethodOverloading1 movd1 = new ExampleOnMethodOverloading1();
		 movd1.display(); //display()  //it identifies at compilation time
		  movd1.display(10); //display(int) //
		  movd1.display('g'); //display(char)//
		
	}
	
	
}
