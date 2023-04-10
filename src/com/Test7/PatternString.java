package com.Test7;
//Q2.pattern string 
import java.util.Scanner;



public class PatternString {
	
	public static void stringPattern(String s)
	{
		String s1=s.replace('I', '@');
		String s2=s1.replace('i', '@');
		String str[]=s2.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str[j]+" ");
			}
			System.out.println();
		}
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		
		
		PatternString.stringPattern(s);
		
		
	}

}
