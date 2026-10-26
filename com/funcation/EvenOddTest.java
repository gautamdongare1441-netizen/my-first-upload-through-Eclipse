package com.funcation;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number : ");
		int n= sc.nextInt();
		
		EvenOdd eo = new EvenOdd();
		eo.checkEven(n);
	}

}
