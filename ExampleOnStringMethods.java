package com.training.manipulation;

public class ExampleOnStringMethods {
	
	
      public static void main(String[] args) {
		
    	String str1 = new String("welcome");
    	//to find the length() of the string
    	System.out.println("Length of the String is : "+str1.length());
    	  
    	String str2 = new String("Hello");
    	//concat :- to concat or add the string at the end to the existing string
    	
    	System.out.println("Concat of two string : "+str2.concat(" World"));
    	
    	//Escapse characters in Java String \ 
    	// This is java "String"
    	
    	String str3 = "This is java \"String\"";
    	System.out.println(str3);
    	
    	// join() :- method return a new string with the given elements joined with
    	// with specified delimiter
    	
    	String s1="I";
    	String s2="love";
    	String s3="java";
    	
    	//JOin the above three string string using a delimiter #
    	//I#love#java
    	String strJoin = String.join("#",s1,s2,s3);
    	System.out.println(strJoin);
    	
    	//replace method replace each matching occurrence of a character/text in the
    	//string with new character/text.
    	
    	String str4="bat ball";
    	//replace b wtih c in str4
    	
    	str4 = str4.replace('b','c');
    	System.out.println("after replace: "+ str4);
    	
    	//String[] split()  method divides the string at the specified regex and return 
    	//retuns an array of substrings.
    	
    	String st5 = "Hadoop is meant for storing huge amount of data";
    	//convert the line into the words
    	String st[]=st5.split(" ");
    	for(String s:st) {
    		System.out.println(s);
    	}
    	
    	//substring(start index,end Index);
    	//Note:- endIndex position element will not included.
    	
    	String str6 = new String("Welcome to java");
    	
    	System.out.println(str6.substring(2));
    	System.out.println(str6.substring(3,9));
    	
    	System.out.println("upperCase :  "+ str4.toUpperCase());
        
    	//toCharArray() :- converts the string to char array
    	
    	String s5 = "welcome";
    	
    	char a[]=s5.toCharArray();
    	
        for(char c:a) {
        	System.out.println(c);
        }
    	
    	//charAt(IndexPosition)
        
        char ch=s5.charAt(2);
        System.out.println("Character at index position 2 is : "+ch);
    	
        //matches() : checks whether the string matches the given regex.
    	
        String regexPattern="^a...s$";
        //a regex pattern for five letters string thats with a ends with s
        
        System.out.println("abbas".matches(regexPattern));//true
        System.out.println("assst".matches(regexPattern));//false
        System.out.println("alias".matches(regexPattern));//true
        
        String mobileRegex="[0-9]{10}";
        System.out.println("123456789".matches(mobileRegex));//
    	
    	  //contains
          //compareTo
          //endsWith
          //startsWith
          //indexOf()
          //lastIndexOf()
        //replaceAll() method replaces each substring that matches the regex of the 
        //with the specified text.
         String str7 = "Java123is456fun";
         System.out.println("berfore repalce : "+str7.hashCode());
         //regex for sequence of digits
         String dregex="\\d+"; //[0-9]
         
         //repalce all occurrences of digits by a space
        str7= str7.replaceAll(dregex," "); //Java is fun
        
        System.out.println("after repalce : "+str7.hashCode());
        System.out.println(str7);
        
       
        
        
	}
}
