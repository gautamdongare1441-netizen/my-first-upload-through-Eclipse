package com.encapsulation;

public class Test2 {

    public static void main(String[] args) {
    	
    	System.out.println(" Testing Encapsulation");

        Employee e1 = new Employee();

        
        e1.setId(111);
        e1.setName("Gautam");
        e1.setSalary(75000);

       
        System.out.println("Employee ID: " + e1.getId());
        System.out.println("Employee Name: " + e1.getName());
        System.out.println("Employee Salary: " + e1.getSalary());
        
        System.out.println();
    }
}