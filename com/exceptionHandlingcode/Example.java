
package com.exceptionHandlingcode;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String name = sc.nextLine();

        int n = name.length();
        System.out.println("n : " + n);

        try {
            System.out.println(name.charAt(5));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }

            }
}

