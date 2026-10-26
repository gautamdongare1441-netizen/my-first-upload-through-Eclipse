package Intarface;

public interface Printable {

	
	void print();
	 
	default void msg()
	{
		System.out.println("Inside default method");
		dispaly();
	}
	
	static int cube(int x)
	{
		int c = x * x * x;
		return c;
	}
	
	private void dispaly()
	{
		System.out.println("Inside dispaly");
	}
}
