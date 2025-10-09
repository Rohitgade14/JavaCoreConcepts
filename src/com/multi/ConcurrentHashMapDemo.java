package com.multi;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> conncurrentHashMap = new ConcurrentHashMap<>();
		conncurrentHashMap.put(1, "kiran");
		conncurrentHashMap.put(2, "Ram");
		conncurrentHashMap.put(3, "Vijay");
	
		 // Thread 1 - Iterating
		 Thread t1 = new Thread(()->{
			  for(Integer key:conncurrentHashMap.keySet()) {
				  System.out.println("Thread1 reading: " + key);
				  try {
					Thread.sleep(1000);
				  } catch (InterruptedException e) {
					e.printStackTrace();
				  }
				  
			  }
		 });
		 
		  // Thread 2 - Modifying
		 Thread t2 = new Thread(()->{
			  for(Integer key:conncurrentHashMap.keySet()) {
				  try {
					Thread.sleep(1000);
				  } catch (InterruptedException e) {
					e.printStackTrace();
				  }
				 conncurrentHashMap.put(4, "Rohit");
				  System.out.println("Thread2 added key 4");
			  }
		 });
		 
		 
		 t1.start();
		 t2.start();
				 
		
	}

}
