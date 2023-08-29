package com.training.java8features;

@FunctionalInterface
public interface MyApp {
    public abstract int additionTwoNumbers(int x,int y); //single abstract method
   
    default void methodTwo() {
    	System.out.println("we are in default method");
    }

    static void methodThree() {
    	System.out.println("we are in static method");
    }
}
