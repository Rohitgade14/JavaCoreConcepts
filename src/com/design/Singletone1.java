package com.design;

public class Singletone1 {
	
	 private static Singletone1 instance;
	 
	 private   Singletone1() {
		   System.out.println("Single class");
	 }
	 
    public static void main(String[] args) {
    	Singletone1.getInstance();
		
	}
    
        public static Singletone1 getInstance() {
        	
        	if(instance==null) {
        		 	instance = new Singletone1();
        	}
        	return instance;
        	   
        }
}
