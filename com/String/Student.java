package com.String;

public class Student {

	public Student()
	{
		System.out.println("Inside constructor");
	
	}
	
	static
	{
		System.out.println("inside static block");
	}
	
	public static void show()
	{
		System.out.println("Inside show");
	}
	
	public static void main(String[] args) {
		System.out.println("inside main");
		
		Student obj = new Student();
		Student.show();
}
	
}
