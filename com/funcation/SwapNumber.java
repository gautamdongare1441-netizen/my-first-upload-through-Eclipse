package com.funcation;

public class SwapNumber {
	void swap (int a,int b) {
		System.out.println("Before swap : a =" +a+",b =" +b);
		
		int temp =a;
		a = b;
		b = temp;
		
		System.out.println("After swap : a =" +a+",b =" +b);
		
	}
}
