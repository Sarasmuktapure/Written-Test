package com.Test7;
//Q5. sort string by length
import java.util.Arrays;
import java.util.Scanner;

public class SortByLength {
	public static void sortString(String str)
	{
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()<s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
				else if(s[i].length()==s[j].length())
				{
					if(s[i].compareTo(s[j])>0)
					{
						String temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				}
			}
			System.out.print(s[i]+" ");
			
		}
		
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		SortByLength.sortString(str);
		

	}

}
