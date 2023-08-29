package com.training.java8features;

public interface XYZ {
     public abstract void methodOne();
     void methodTwo();
     
     default void methodThree() {
    	 System.out.println("we are in default methodThree of xyz interface");
     }
     
     static void display() {
    	 System.out.println("we are in display static method of XYZ interface");
     }
     
}
