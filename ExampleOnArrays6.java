package com.training.arrays;

import java.util.Scanner;

public class ExampleOnArrays6 {
	
	public static void main(String[] args) {
		
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int r=scobj.nextInt();
		System.out.println("Enter the col size : ");
		int c=scobj.nextInt();
		
		int arr[][] = new int[r][c];
		
		System.out.println("Initialization the array using Scanner class");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("insert the element at index position arr["+i+"]["+j+"] : " );
				arr[i][j]=scobj.nextInt();
			}
		}
		
		System.out.println("Displaying the elements using for loop");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				//System.out.println("insert the element at index position arr["+i+"]["+j+"] : " );
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
	}
}
