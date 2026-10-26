package com.sample;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = new String("Hi");
		
		StringBuilder sb = new StringBuilder("Java");
		
		
		
		sb.insert(4,"gautam");
		System.out.println(sb); 
		
		
		sb.delete(4, 7);
		System.out.println(sb);
		
		
		StringBuilder sb1 = new StringBuilder("Java");
		System.out.println("sb1 : " +sb1);
		sb1.reverse();
		System.out.println(sb1);
		
	}

}
