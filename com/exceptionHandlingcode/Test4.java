package com.exceptionHandlingcode;
import java.util.Scanner;
public class Test4 {



public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {
        System.out.println("Enter Roll Number:");
        int rollno = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Percentage:");
        double percentage = sc.nextDouble();

        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
    }
    catch (Exception e) {
        System.out.println("Invalid Input!");
    }
    finally {
        System.out.println("Program Completed");
        sc.close();
    }
}


}

