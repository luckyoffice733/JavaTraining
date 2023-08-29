package com.training.arrays;

public class ExampleOnArrays2 {
 
	public static void main(String[] args) {
	
	//Declaring an array with size by using new keyword
		//dataType arrayName = new dataType[size]
		int arr[] = new int[5];
	 
		arr[0]=20;
		arr[1]=30;
		arr[2]=100;
		arr[3]=10;
		arr[4]=50;
		
		System.out.println("size of array is : "+arr.length);
		
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
