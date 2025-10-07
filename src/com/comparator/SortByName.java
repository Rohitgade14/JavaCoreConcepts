package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements Comparator<Employee> {
    public static void main(String[] args) {
      
          List<Employee> eList = new ArrayList<>();
          eList.add(new Employee(22, "rohit", 3344.45, "rohit@gmailo.com"));
          eList.add(new Employee(55, "ajay", 444.45, "kiran@gmailo.com"));
          eList.add(new Employee(11, "mohan", 777.45, "mohan@gmailo.com"));
          eList.add(new Employee(77, "deep", 222.45, "deep@gmailo.com"));
          eList.add(new Employee(46, "vijay", 999.45, "vijay@gmailo.com"));
          
          
            Collections.sort(eList,new SortByName());
            System.out.println(eList);
            eList.forEach(System.out::print);
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
