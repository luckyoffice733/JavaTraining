package com.training.list;

import java.util.LinkedList;
import java.util.List;

public class ExampleOnLinkedList2 {

	public static void main(String[] args) {
		
		//storing homogeneous type of elements into linkedList using Generic<T>
		//Note Generic Type should be a WrapperClasses
		List<Integer>  li = new LinkedList<Integer>();
		
		li.add(10);
		li.add(null);
		li.add(30);
		
		System.out.println(li);
		//perform some manipulation object(add,replace,remove,search)...
		//Displaying the elements with help of ListIterator,enhanced forloop and
		//java8 forEach clear.
		
		
	}
}
