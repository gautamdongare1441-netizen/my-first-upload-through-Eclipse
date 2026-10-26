package com.sample;

public class PlaindromeString {

	public static void main(String[] args) {
		
			
				
				//String str = "abcdfcba";
				
				/*
				String rev = "";
				for(int i = str.length() -1; i >= 0; i--)
				{
					rev = rev + str.charAt(i);
				}
				
				if(str.equals(rev))
				{
					System.out.println("String is palindrome \n"+str+" = "+rev);
				}
				else
				{
					System.out.println("String is not palindrome \n"+str+" != "+rev);
				}
				*/
				
				/*
				int flag = 0;
				for(int i = 0, j = str.length()-1; i <= j; i++,j--)
				{
					if(str.charAt(i) != str.charAt(j))
					{
						flag = 1;
						break;
					}
				}
				
				if(flag == 0)
				{
					System.out.println("String is palindrome");
				}
				else
				{
					System.out.println("String is not palindrome");
				}
				*/
				
				String str = "nayan";
				int flag = 0;
				for(int i = 0; i < (str.length() / 2) + 1; i++)
				{
					if(str.charAt(i) != str.charAt(str.length()-1-i))
					{
						flag = 1;
						break;
					}
				}
				
				if(flag == 0)
				{
					System.out.println("String is palindrome");
				}
				else
				{
					System.out.println("String is not palindrome");
				}
			}

		

	}



