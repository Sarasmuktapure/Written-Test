package com.Test5;
//Q7. arrange first half in ascending and second half in descending order
import java.util.Arrays;
import java.util.Scanner;

public class SortHalf
{
	public static void sortHalf(int a[],int size)
	{
		
		
		for(int i=0;i<size/2;i++)
		{
			for(int j=i+1;j<size/2;j++)
			{
				
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=size/2;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
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
		
		if(size==0)
		{
			System.out.println("Array size should be greater than zero");
		}
		else if(size!=0)
		{
		
		  System.out.println("Enter the array elements");
		  for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		    SortHalf.sortHalf(a, size);
		}

	}

}
