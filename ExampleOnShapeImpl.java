package com.demo;

public class ExampleOnShapeImpl implements Shape {

	@Override
	public void areaOfCircle() {
		// TODO Auto-generated method stub  //PI*r*r
	   double totalAreaOfCircle = 3.142*4*4;
	   System.out.println("area of circle is : "+totalAreaOfCircle);
		
	}

	@Override
	public void areaOfSquare() {
		// TODO Auto-generated method stub
		int squareOfNo=5*5;
		System.out.println("Square of 5 is : "+squareOfNo);
		
	}

	@Override
	public void areaOfRectangle() {
		// TODO Auto-generated method stub //length*width
		int totalRectangle = 10*40;
		System.out.println("Area of Rectangle is : "+totalRectangle);
		
	}

	public static void main(String[] args) {
		
		//creating object for the interface with the help of implementation class.
		//Recommended 
		Shape shapeObj = new ExampleOnShapeImpl();
		
		//ExampleOnShapeImpl  exonshape = new ExampleOnShapeImpl();
		
		shapeObj.areaOfCircle();
		shapeObj.areaOfRectangle();
		shapeObj.areaOfSquare();
		
	}
	
	
}
