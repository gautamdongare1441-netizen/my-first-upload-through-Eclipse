package com.Final;

class Employee {
    int salary;
    static String company = "TCS";
    final int id;
    static final String country = "India";

    Employee(int salary, int id) {
        this.salary = salary;
        this.id = id;
    }

    public static void main(String[] args) {
        Employee e = new Employee(25000, 101);

        System.out.println("Company: " + company);
        System.out.println("Salary: " + e.salary);
        System.out.println("Employee ID: " + e.id);
        System.out.println("Country: " + country);
    }
}

	