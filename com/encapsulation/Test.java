package com.encapsulation;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Testing Encapsulation");
		
		Student s1 = new Student();
		s1.setRno(11);
		s1.setName("Amol");
		s1.setMks(54);
		
		
		System.out.println("rno : "+s1.getRno());
		System.out.println("Name : "+s1.getName());
		System.out.println("Mks : "+s1.getMks());
		
		System.out.println("rno : "+s1.getRno()+"\tName : "+s1.getName()+"\tmks");
	}

}
