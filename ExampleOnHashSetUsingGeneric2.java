package com.training.set;

import java.util.HashSet;
import java.util.Set;

public class ExampleOnHashSetUsingGeneric2 {

	public static void main(String[] args) {
		
	  Set<Product> hs = new HashSet<Product>();
		
		Product p = new Product();
		p.setProductId(1);
		p.setProductName("mouse");
		p.setPrice(400);
		
		Product p1 = new Product(3,"laptop",50000);
		Product p2= new Product(2,"Ram",5000);
		Product p3 = new Product(3,"laptop",50000);
		
		hs.add(p);
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		
		System.out.println(hs);
		
		//java8
		System.out.println("Displaying the product objects using java8 forEach");
		hs.forEach(prod -> System.out.println(prod.getProductId()+" "+prod.getProductName()+" "+prod.getPrice()));
	  
	  
	}
}
