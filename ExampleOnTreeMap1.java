package com.training.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExampleOnTreeMap1 {
	public static void main(String[] args) {
		//Map<Key,Value>  reference = new HashMap<Integer,String>
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
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
		
	    System.out.println("firstKey is : "+tm.firstKey());
	    System.out.println("firstKey is : "+tm.lastKey());
		
	    System.out.println("First Entery Set :"+tm.firstEntry());
	    System.out.println("First Entery Set :"+tm.lastEntry());

	    //get all the key 
		 Set<Integer> allkeys =tm.keySet();
		 System.out.println("All keys are :");
		 for(Integer ky :allkeys) {
			 System.out.println(ky);
		 }
		 
		 //get all the values
		  Collection<String> allValues = tm.values();
		  System.out.println("All Values are : ");
		 for(String val :allValues) {
			 System.out.println(val);
		 }
		 
		  //getting all the key value pairs like a entrySet
		Set<Entry<Integer,String>> es=  tm.entrySet();
		//using for loop
		System.out.println("All EntrySet(Key,values) are :");
		for(Entry<Integer,String> es1 :es) {
			System.out.println(es1.getKey()+"|"+es1.getValue());
		}
	    
	    
	    
	}
}
