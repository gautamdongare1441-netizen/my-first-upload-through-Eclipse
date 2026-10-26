package com.Final;

public class Teacher {

    int id;
    String name;
    double salary;
    int age;

    Teacher(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    void display() {
        System.out.println(id+ "  " +name+ "  " +salary+ "  " +age);
        System.out.println("****************************");
    }

    public static void main(String[] args) {

        Teacher[] t = {
            new Teacher(1, "Sandesh", 80000, 30),
            new Teacher(2, "Kishor", 70000, 22),
            new Teacher(3, "Santosh", 90000, 45),
            new Teacher(4, "Dipak", 75000, 28),
            new Teacher(5, "Rohit", 60000, 24)
        };

        System.out.println("Age greater than 24:");
        

        for (Teacher x : t) {
            if (x.age > 24) {
                x.display();
            }
        }

        System.out.println("\nSalary between 75000 and 90000:");

        for (Teacher x : t) {
            if (x.salary >= 75000 && x.salary <= 90000) {
                x.display();
            }
        }

        double sum = 0;

        for (Teacher x : t) {
            sum = sum + x.salary;
        }

        double average = sum / t.length;

        System.out.println("\nAverage Salary: " + average);

        Teacher max = t[0];
        Teacher min = t[0];

        for (Teacher x : t) {

            if (x.salary > max.salary) {
                max = x;
            }

            if (x.salary < min.salary) {
                min = x;
            }
        }

        System.out.println("\nMaximum Salary:");
        max.display();

        System.out.println("\nMinimum Salary:");
        min.display();
    }
}