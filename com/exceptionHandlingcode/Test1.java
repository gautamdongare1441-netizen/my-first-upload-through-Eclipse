package com.exceptionHandlingcode;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first numbere :");
		int a = sc.nextInt();
		
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		
		try
		{
			int div = a / b;
			System.out.println("Division : "+div);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		
		int add = a + b;
		System.out.println("Addition : "+add);
		
	}

}
