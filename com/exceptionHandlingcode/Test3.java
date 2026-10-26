package com.exceptionHandlingcode;

public class Test3 {

	public static void main(String[] args) {
		
		String str = null;
		System.out.println(str);
		
		try
		{
			System.out.println("lenth : "+str.length());
		}
		catch (NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Inside fianlly ");
		}
		System.out.println("Soham  Gore ");
	}

}
