package com.training.exception;

//user defined exception class or customs exception
public class InvalidAgeException extends Exception {//step2

	public InvalidAgeException(String s) { //step2
		 super(s);   //step3
	}
	
}
