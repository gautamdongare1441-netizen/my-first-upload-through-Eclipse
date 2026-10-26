package com.exceptionHandlingcode;

public class Test2 {

public static void main(String[] args) {

    System.out.println("Before array code");

    int arr[] = {10, 20, 30, 40};

    System.out.println("Displaying array elements:");

    try {
        System.out.println("Inside try block");

        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i] + "\t");
        }

        System.out.println();

    } catch (ArrayIndexOutOfBoundsException e) {

        System.out.println(e);
        System.out.println("Inside catch block");
    }

    System.out.println("\nAfter array code");
}


}
