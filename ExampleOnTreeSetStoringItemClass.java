package com.training.set;

import java.util.Set;
import java.util.TreeSet;

public class ExampleOnTreeSetStoringItemClass {

	public static void main(String[] args) {
		
		Set<Item>  ts = new TreeSet<Item>(new ItemComparator());
		
		Item i1 = new Item();
		i1.setItemId(1);
		i1.setItemName("Fruits");
		i1.setPrice(4000);
		
		Item i2 = new Item(3,"Juices",5000);
		Item i3= new Item(2,"Salads",2000);
		Item i4 = new Item(3,"Juices",5000);
		Item i5 = new Item(3,"Chinse",5000);
		ts.add(i1);
		ts.add(i2);
		ts.add(i3);
		ts.add(i4);
		ts.add(i5);
		//System.out.println(ts);
		System.out.println("Displaying from the treeset custom sorting order using ItemName in Deseding order");
		for(Item i : ts) {
			System.out.println(i.getItemId()+" "+i.getItemName()+" "+i.getPrice());
		}
		

		
	}
}
