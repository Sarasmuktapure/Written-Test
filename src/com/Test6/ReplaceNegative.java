package com.Test6;

import java.util.Arrays;
import java.util.Scanner;

//replace negative with its immediate elements square
public class ReplaceNegative 
{
	public static void replaceNegative(int a[])
	{
		if(a[0]<0)
		{
			System.out.println("first element can't be negative");
		}
		for(int i=0;i<a.length;i++)
		{
			 if(a[i]<0)
			 {
				 a[i]=a[i-1]*a[i-1];
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
		ReplaceNegative.replaceNegative(a);
		

	}

}
