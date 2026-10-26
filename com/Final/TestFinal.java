package com.Final;

public class TestFinal {
	
	
	void display()
	{
		System.out.println("Inside display");
	}
	
	final void show()
	{
		System.out.println("Inside show ");
	}
	public static void main(String[] args) {
	
	
		int a = 10;
		final int b = 20;
		
		TestFinal obj = new TestFinal();
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		a = 100;
		System.out.println("a : ");
		
		//b = 200;// we cannot change the value of final variable
	}

}
