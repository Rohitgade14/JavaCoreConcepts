package com.multi;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<>();
		 hashmap.put(1, "Rohit");
		 hashmap.put(2, "kiran");
		 hashmap.put(3, "Mukesh");
		 
		 
		 // Thread 1 - Iterating
		 Thread  t1 = new Thread(()->{
			 for(Integer key:hashmap.keySet()) {
				 System.out.println("Thread1 reading: " + key);
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
		 });
		
		  // Thread 2 - Modifying
		 Thread t2 = new Thread(() -> {
	            try { Thread.sleep(200); 
	            }
	            catch (InterruptedException e) {
					e.printStackTrace();
				}
	            hashmap.put(4, "D");  // Modifying while iterating
	            System.out.println("Thread2 added key 4");
	        });

	        t1.start();
	        t2.start();

	}

}
