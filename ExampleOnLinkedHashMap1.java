package com.training.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleOnLinkedHashMap1 {

	
	public static void main(String[] args) {
		//Map<Key,Value>  reference = new HashMap<Integer,String>
		Map<Integer,String> hm = new LinkedHashMap<Integer,String>();
		
	  //add the elements into hashmap
		//hm.put(null, null);
		hm.put(1003,"laxmi");
		hm.put(1001,"ramu");
		hm.put(1002,"Smith"); //key=value is called enterySet
		hm.put(1005,"marting");
		hm.putIfAbsent(1006,"Scott");
		hm.put(1007,"ramu");
	

		
		System.out.println("Number of Key,value pairs stored is : "+hm.size());
		System.out.println(hm);
	
		//remove an object from map using key
		//System.out.println(hm.remove(null));
		String removedKey =hm.remove(1007);
		System.out.println("remvoed value based on Key is "+removedKey);
		//System.out.println("After remove : "+hm);
		
		/*
		 * //we are combining two maps Map<Integer,String> hm1 = new
		 * HashMap<Integer,String>(); hm1.put(1004,"SecondMap"); hm1.putAll(hm);//we are
		 * combining two maps System.out.println("Combining two maps :");
		 * System.out.println(hm1);
		 */
		 
		// get the Object based on Key object
		 String objectBasedOnKey =hm.get(1002);
		 System.out.println("GEt method :"+objectBasedOnKey);
		 
		 //if/else key doesnot exist it will display the default message
		 //will be print instead of null,
	    String defaultGetMethod=  hm.getOrDefault(1006,"Key doesnot exist");
		 System.out.println(defaultGetMethod);
		 
		//search the key in hm using containsKey()
		 System.out.println("search for the key 1001 ? "+hm.containsKey(1011));
		 
		 //get all the key 
		 Set<Integer> allkeys =hm.keySet();
		 System.out.println("All keys are :");
		 for(Integer ky :allkeys) {
			 System.out.println(ky);
		 }
		 
		 //get all the values
		  Collection<String> allValues = hm.values();
		  System.out.println("All Values are : ");
		 for(String val :allValues) {
			 System.out.println(val);
		 }
		 
		  //getting all the key value pairs like a entrySet
		Set<Entry<Integer,String>> es=  hm.entrySet();
		//using for loop
		System.out.println("All EntrySet(Key,values) are :");
		for(Entry<Integer,String> es1 :es) {
			System.out.println(es1.getKey()+"|"+es1.getValue());
		}
		 
		
	}
}
