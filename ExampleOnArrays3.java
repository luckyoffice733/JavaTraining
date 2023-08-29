package com.training.arrays;

import java.util.Scanner;

public class ExampleOnArrays3 {
 
	public static void main(String[] args) {
	
	//with help of Scanner class read the arrays elements and store into array and
		//display it
		
		Scanner sobj = new Scanner(System.in);
		
	    System.out.println("Enter the size to store no of elements");
	    int n = sobj.nextInt();
	    
	    int arr[] = new int[n];
		
		//Initialize the array using for loop  
	    for(int i=0; i<arr.length;i++) {
	    	System.out.println("Enter the element at specified index ["+i+"] :");
	    	arr[i]=sobj.nextInt();
	    }
		

		System.out.println("Displaying the elements using forloop");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("");
		System.out.println("Displaying the elements using enhanced Foreach Loop");
		for(int b:arr) {
			System.out.print(b+" ");
		}
		
	 
}
}
