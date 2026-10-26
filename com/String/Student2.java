package com.String;

public class Student2 {
	
	
	
	String name;
	int rno;
	
	
	static String cname;
	static int scount = 0;
	
	static {
		System.out.println("Inside static block");
		cname = "FC";
		System.out.println("College name :"+cname);
	}
	
	public Student2(String name, int rno) {
		System.out.println("Insiden constuctor");
		this.name =name;
		this.rno = rno;
		scount++;
	}
	
	public void displayStudent(){
		System.out.println("Inside display method");
		System.out.println("rno :"+rno+"|name :"+name+"|cname");
	}
	
	public static void show() {
		
		System.out.println("scount :"+scount);
	}

	public static void main(String[] args) {
		System.out.println("Inside main");
		
		
		Student2.show();
		
		Student2 obj1 = new Student2("ajay",11);
		Student2 obj2 = new Student2("vijay",21);
		Student2 obj3 = new Student2("jay",31);
		
		obj1.displayStudent();
		obj2.displayStudent();
		obj3.displayStudent();
		
		
		Student2.show();
		
	}

}
