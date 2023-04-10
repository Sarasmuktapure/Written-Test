package com.Test4;

import java.util.Arrays;
import java.util.Scanner;

//to find minimum frequency character from array
public class MinOccurance
{
		public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		char ch[]=new char[size];
		int freq[]=new int [256];
		System.out.println("Enter the array elements");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.println(Arrays.toString(ch));
		System.out.println("---------------------------------------");
		for(int i=0;i<ch.length;i++)
		{
			freq[ch[i]]=freq[ch[i]]+1;
		}
		int min=Integer.MAX_VALUE;
		char c=' ';
		for(int i=0;i<ch.length;i++)
		{
			if(min>freq[ch[i]])
			{
				min=freq[ch[i]];
				c=ch[i];
			}
		}
		System.out.println("Minimum occurred character is="+c);
			
	}
}


