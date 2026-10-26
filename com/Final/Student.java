package com.Final;

class Student {

    int age;
    static String name;
    final int rollNumber;
    static final String college = "ABC College";

    Student(int age, String name, int rollNumber) {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public static void main(String[] args) {

        Student s = new Student(22, "Gautam", 111);

        System.out.println("Name: " + name);
        System.out.println("Age: " + s.age);
        System.out.println("Roll Number: " + s.rollNumber);
        System.out.println("College: " + college);
    }
}