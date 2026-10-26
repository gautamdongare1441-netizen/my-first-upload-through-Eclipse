package com.sample;

public class Conditiondemo {
    public static void main(String[] args) {

        int marks = 52;

        if (marks >= 100) {
            System.out.println("Grade A+");
        } 
        else if (marks >= 90) {
            System.out.println("Grade A");
        } 
        else if (marks >= 70) {
            System.out.println("Grade B");
        } 
        else if (marks >= 50) {
            System.out.println("Grade C");
        } 
        else if (marks >= 35) {
            System.out.println("Grade D");
        } 
        else {
            System.out.println("Fail");
        }
    }
}