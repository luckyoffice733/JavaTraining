package com.training.arrays;

public class ExampleOnArray5 {
	
	
public static void main(String[] args) {
	
	//two dimensional array declaration and initialization 
	
	int a[][]= {{10,30,40},{2,25,15}}; //  10 30 40
	                                   //2 25 15  //no of elements rows*cols = 2*3 =6 elements
	
	
	System.out.println("Displaying the elements from two dimensional array");
	for(int i=0;i<2;i++) {//rows
    for(int j=0;j<3;j++) {
    	System.out.print(a[i][j]+" ");  //a[0][0]=10
    	                               //a[0][1]=30
    }
		System.out.println(" ");
	}
	
	
}


}
