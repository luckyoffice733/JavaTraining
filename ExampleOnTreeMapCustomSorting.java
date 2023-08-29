package com.training.map;

import java.util.TreeMap;

public class ExampleOnTreeMapCustomSorting {

	public static void main(String[] args) {
		//Map<Key,Value>  reference = new HashMap<Integer,String>
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>(new MyCustomSortComparator());

		//add the elements into Treemap
		tm.put(1003,"laxmi");
		tm.put(1001,"ramu");
		tm.put(1002,"Smith"); //key=value is called enterySet
		tm.put(1005,"marting");
		tm.putIfAbsent(1006,"Scott");
		tm.put(1007,"ramu");


		System.out.println("Number of Key,value pairs stored is : "+tm.size());
		//it will display in natural  sorting order based
		//ascending order based on Key
		System.out.println(tm);
	}
}
