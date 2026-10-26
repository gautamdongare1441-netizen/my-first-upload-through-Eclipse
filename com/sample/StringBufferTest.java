package com.sample;

public class StringBufferTest {

	public static void main(String[] args) {
		
		
		StringBuffer sf = new StringBuffer("Ms");
		System.out.println("sf : "+sf);
		sf.append("Dhoni");
		System.out.println("After append :"+sf);
		
		
		StringBuffer sf1 = new StringBuffer("Rohit");
		System.out.println("sf1 : "+sf1);
		sf1.insert(5, " Sharma");
		System.out.println("After insert :"+sf1);
		
		
		StringBuffer sf2 = new StringBuffer("Ravindra");
		System.out.println("sf2 : "+sf2);
		sf2.delete(4, 8);
		System.out.println("After delete :"+sf2);
		
		
		
		StringBuffer sf3 = new StringBuffer("Gautam");
		System.out.println("sf3 :"+sf3);
		sf3.reverse();
		System.out.println("After reverse :"+sf3);
		
		
		
		
		
		
		
		
		
		

	}

}
