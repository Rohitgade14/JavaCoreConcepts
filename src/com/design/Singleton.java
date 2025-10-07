package com.design;

public class Singleton {
	
	
	    private static Singleton instance;
	    
	   private Singleton() {
		   System.out.println("Singletone Class");
	   }
    public static void main(String[] args) {
    	  
    	if(instance ==null) {
    		instance = new Singleton();
    	}
    	  return;
    	
		
	}
	  

}
