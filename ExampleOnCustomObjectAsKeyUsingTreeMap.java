package com.training.map;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExampleOnCustomObjectAsKeyUsingTreeMap {
	public static void main(String[] args) {

     TreeMap<Book,String> tm = new TreeMap<>(new MyBookComparator());
		
     Book b1 = new Book();
     b1.setBookId(301);
     b1.setBookName("C");
     b1.setAuthorName("Balaguruswamy");
     
     
     Book b2 = new Book(201,"Core java","James");
     Book b3 = new Book(401,"SpringBoot","RodJohnSon");
     
     tm.put(b1,"rack10");
     tm.put(b2,"rack14");
     tm.put(b3,"rack5");
     
     System.out.println("Number of key values are : "+tm.size());
     System.out.println(tm);
     
     
   //get all the key 
	 Set<Book> allkeys =tm.keySet();
		System.out.println("All EntrySet(Key,values) are displaying in "
   				+ "Ascending order based on BookId:");
	 System.out.println("All keys are :");
	 for(Book ky :allkeys) {
		 System.out.println(ky.getBookId()+" "+ky.getBookName()+" "+ky.getAuthorName());
	 }
     
     
     //getting all the key value pairs like a entrySet
   		Set<Entry<Book,String>> es=  tm.entrySet();
   		//using for loop
   		System.out.println("All EntrySet(Key,values) are displaying in "
   				+ "Ascending order based on BookId:");
   		for(Entry<Book,String> es1 :es) {
   			 Book bobj =es1.getKey();
   			 System.out.println(bobj.getBookId()+" "+bobj.getBookName()+" "+bobj.getAuthorName());
   		}
     
     

	}
}
