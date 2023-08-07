package com.demo;

public class Chair {
	
	//representing chair object properties(fields) and Actions (behaviours)
	
	String materials="plastic"; //properties
    String color="black";
    int noOfWheels=4;
	
    
    //actions of Chairs
    
    public void  seatAdjustable() {
    	System.out.println("We Can Do Chair Seat Height Adjustable");
    }
    
    public void movieable() {
    	System.out.println("We can movie a chair in any direction");
    }
    
    public static void main(String[] args) {
		//creating an object using new operator
    	//ClassName referenceVariableName=new ClassName();
    	
    	Chair chairObject=new Chair();
    	Chair chairObject1=new Chair();
    	//Accessing a Object properties and actions
    	//Here accessing the chair object properties and actions.
    	// to access the properties and actions we use dot operator(.)
    	//to access property :- objectName(referencedName).variableName
    	//to access a method :- objectName.methodName();
    	
    	System.out.println("Chair Properties are : ");
    	System.out.println(chairObject.color);
    	System.out.println(chairObject.materials);
    	System.out.println(chairObject.noOfWheels);
    	
    	System.out.println("Chair Behaviour or actions");
    	chairObject.movieable();
    	chairObject.seatAdjustable();
    	chairObject.seatAdjustable();
    	chairObject.seatAdjustable();
    	
    	//setting the property value.
    	chairObject1.materials="hard plastic";
    	chairObject1.color="grey";
    	
    	System.out.println("Chair1 object properties are :");
    	System.out.println(chairObject1.materials);
    	System.out.println(chairObject1.color);
    	
    	
	}

}
