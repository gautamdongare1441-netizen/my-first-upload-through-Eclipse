package Intarface;

public class C implements A, B {
	int x = 30;
	
	void display() {
		System.out.println("x : "+x);
	}
	public void show1() {
		System.out.println("Inside show 1");
	}
	
	public void show2() {
		System.out.println("Inside show 2");
	}
	
	public void add() {
		System.out.println("Inside add");
	}
	
	public static void main(String[] args) {
		
		C obj = new C ();
		obj.display();
		obj.show1();
		obj.show2();
		obj.add();
	}

}
