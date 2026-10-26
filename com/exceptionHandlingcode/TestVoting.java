package com.exceptionHandlingcode;
import java.util.Scanner;
public class TestVoting {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inside testvoting");
		System.out.println("Enter your age :");
		int age  = sc.nextInt();
		
		Voting vobj = new Voting();
		vobj.checkAge(age);
		
	}

}
