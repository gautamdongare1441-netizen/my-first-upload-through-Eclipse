package com.exceptionHandlingcode;
import java.util.Scanner;
public class TestA {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		A obj = new A();
		obj.abc(n,m);
		
		obj.display();
				
	}

}
