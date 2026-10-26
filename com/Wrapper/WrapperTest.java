package com.Wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		
		System.out.println("hello and walocme");
		
		int a = 10;
		Integer x = Integer.valueOf(a);
		
		System.out.println("% : "+x);
		
		int b = 20;
		Integer y = b; //after java 5, autoboxing //
		System.out.println("y : "+y);
		
		
		Integer n = 100;
		int q = n.intValue();// before java 5
		System.out.println("q :"+q);
		
		//unboxing
		
		Integer m = 200;
		int r = m; //unbxing after java5
		
		System.out.println("r : "+r);
		
	}

}
