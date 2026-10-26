package Intarface;

public class Test implements Printable{
	
	public void print() {
		System.out.println("Inside print Test");
	}
	

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.print();
		obj.msg();
		
		int result = Printable.cube(3);
		System.out.println("cube :"+result);
		
	}

}
