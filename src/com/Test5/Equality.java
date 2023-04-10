package com.Test5;
//Q2.To test equality of two array
import java.util.Scanner;

public class Equality 
{
	public static boolean isEqual(int a[],int b[])
	{
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						return true;
					}
				}
			}
		}
		
		return false;
		
}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array1");
		int size1=sc.nextInt();
		System.out.println("Enter the size of array2");
		int size2=sc.nextInt();
		int a[]=new int[size1];
		int b[]=new int[size2];
		System.out.println("enter the array1 elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the array2 elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
				if(isEqual(a,b))
				{
					System.out.println("Both arrays are equal");
				}
				else
				{
					System.out.println("Both arrays are not equal");
				}
	}

}
