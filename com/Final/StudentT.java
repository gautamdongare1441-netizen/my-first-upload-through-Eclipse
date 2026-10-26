package com.Final;

public class StudentT {

	int rno;
	String name;
	float mks;
	String email;
	
	/*
	 int a = 21;
	 int arr[] = {10,20,30,40};
	 Student obj = new Student(11,"abc",56.20f,"jay@gmail.com");
	 */
	
	public StudentT()
	{
		
	}
	
	public StudentT(int rno, String name, float mks, String email)
	{
		this.rno = rno;
		this.name = name;
		this.mks = mks;
		this.email = email;
	}
	
	public void display()
	{
		System.out.println("rno : "+rno+"\nname : "+name+"\nmks : "+mks+"\nemail : "+email);
		System.out.println("********************");
	}
	
	public static void main(String[] args) {
		
		StudentT obj = new StudentT(11,"ram",76.20f, "ram@gmail.com");
		obj.display();
		
		StudentT obj2 = new StudentT();
		obj2.rno = 21;
		obj2.name = "soham";
		obj2.mks = 90.30f;
		obj2.email = "soham@gmail.com";
		obj2.display();
		
		
		new StudentT(31,"Disha",46.30f,"disha@gmail").display();;
		

	}

}