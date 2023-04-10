package com.Test7;
//Q8.remove character of string 2 from string 1
import java.util.Scanner;

public class RemoveChar {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		String string="";
		for(int i=0;i<ch2.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				if(ch1[j]==ch2[i])
				{
					ch1[j]=' ';
				}
			}
		}
		/*for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=' ')
			{
				string=string+ch1[i];
			}
			
		}
		System.out.print(string);*/
			
			
		for(int i=0;i<ch1.length;i++)
		{
			System.out.print(ch1[i]);
		}
		
		
		

	}

}
