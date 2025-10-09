package com.interview;

public class HashMap1 {
	
	public static void main(String[] args) {
		String key="rohit";
		
		int hashValue=key.hashCode();
		     int capcity=16;
		   int  index=hashValue&(capcity-1);
	
		  System.out.println(key+"key");
		   System.out.println(hashValue);
		   System.out.println(index);
		   
		   
	}

}
