package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Employee  implements  Comparable<Employee>{
    private int empId;
    private  String name;
    private  double salary;
    private String email;

    @Override
    public int compareTo(Employee e) {
        if(this.empId==e.empId) return  0;
        else if (this.empId < e.empId) return -1;
        else if(this.empId> e.empId) return  1;
       // return empId;
        return  0;
    }
    public Employee(int empId, String name, double salary, String email) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Employee>  emps= new ArrayList<>();
          emps.add(new Employee(2,"Rohit",5577.77,"rohit@gmail.com"));
          emps.add(new Employee(5,"amar",7788.67,"amar@gmail.com"));
          emps.add(new Employee(7,"kiran",9988.76,"kiran@gmail.com"));
          emps.add(new Employee(1,"devraj",1122.33,"devraj@gmail.com"));
        System.out.println("Before Sorting Without EmpId"+emps);
        Collections.sort(emps);
        System.err.println("After Sorting With EmpId"+emps);


    }


}
