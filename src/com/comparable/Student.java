package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	
	private int rollNo;
	private String name;
	private String address;
	
	
	public Student(int rollNo,String name,String address) {
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
		
		
	}


      public int getRollNo() {
    	  return rollNo;
      }
      
      public void setRollNo(int rollNo) {
    	  this.rollNo=rollNo;
      }


	  @Override
	  public int compareTo(Student o) {
		 return this.rollNo-o.rollNo;
		
	  }
	  public String toString() {
		  return "rollNo: "+rollNo+" name: "+name+" address: "+address;
	  }
      
	  public static void main(String[] args) {
		List<Student> emps = new ArrayList<>();
		emps.add(new Student(1, "kiran", "mumbai"));
		emps.add(new Student(5, "ajay", "pune"));
		emps.add(new Student(7, "ram", "delhi"));
		
		Collections.sort(emps);
		
		System.out.println("after sorting"+emps);
		
		
	}
	
	
	
	
	

}
