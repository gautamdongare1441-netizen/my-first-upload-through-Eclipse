package com.exceptionHandlingcode;
import java.util.Scanner;
public class ArryaIndexOutOfBound {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [5];
		
		System.out.println("Enter 4 numbers:");
		
		for(int i =0; i< 4; i++) {
			arr[i] = sc.nextInt();
			}
		
		System.out.println("Enter index:");
		int index = sc.nextInt();
		try {
			System.out.println(arr[4]);
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid array :");
		}
		
	}

}
