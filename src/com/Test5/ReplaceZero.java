package com.Test5;
//Q3.Replace all zero with one in array
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceZero
{
	public static void replaceZero(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ReplaceZero.replaceZero(a);
		
	}

}
