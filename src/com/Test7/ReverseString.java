package com.Test7;
//Q3.to reverse given string in place without using second string
import java.util.Scanner;

public class ReverseString {
	public static void revString(String s)
	{
		/*StringBuilder sb=new StringBuilder(s);
		s=sb.reverse().toString();
		System.out.println(s);*/
		
		for(int i=s.length();i>0;i--)
		{
			System.out.print(s.charAt(i-1));
		}
		System.out.println();
		
	}
	public static void revWord(String s)
	{
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				System.out.print(word.charAt(j));
			}
			
			
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		ReverseString.revString(s);
		ReverseString.revWord(s);
		

	}

}
