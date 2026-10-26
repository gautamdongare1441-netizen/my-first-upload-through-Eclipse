package com.exceptionHandlingcode;

public class A {
	
	
		public void abc(int a, int b)
		{
			try
			{
				int c = a / b;
				System.out.println("Division : "+c);
				
				int arr[] = {10,20,30};
				System.out.println("value : "+arr[5]);
			}
			catch (ArithmeticException e1) {
				System.out.println(e1);
			}
			catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println(e2);
			}
			catch (Exception e3) {
				System.out.println(e3);
			}
			finally
			{
				System.out.println("inside finally");
			}
			
			System.out.println("afetr catch");
			
		}
		
		public void display()
		{
			System.out.println("inside display");
		}
		
		
	}

	
