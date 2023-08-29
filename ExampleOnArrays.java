package com.training.arrays;

public class ExampleOnArrays {

	public static void main(String[] args) {
		
		//array declaration and initialization at time
		        //a[0],a[1],a[2],a[3],a[4]
		int []a= {30,10,50,20,40};
		
		System.out.println("No of elements in  array name is a : "+a.length);
		
		System.out.println("Displaying the elements using forloop");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println("");
		System.out.println("Displaying the elements using enhanced Foreach Loop");
		for(int b:a) {
			System.out.print(b+" ");
		}
		
		
	}
	
	
}
