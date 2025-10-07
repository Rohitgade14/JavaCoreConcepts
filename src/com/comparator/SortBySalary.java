package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBySalary implements Comparator<Employee>{

	  public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(22, "rohit", 3344.45, "rohit@gmailo.com"));
		employee.add(new Employee(55, "ajay", 444.45, "kiran@gmailo.com"));
		employee.add(new Employee(11, "mohan", 777.45, "mohan@gmailo.com"));
		employee.add(new Employee(77, "deep", 222.45, "deep@gmailo.com"));
		employee.add(new Employee(46, "vijay", 999.45, "vijay@gmailo.com"));
		   
		  Collections.sort(employee,new SortBySalary());
		  employee.forEach(System.out::print);
        
	}
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o1.getSalary(), o2.getSalary());
	}

}
