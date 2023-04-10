package com.Test6;

import java.util.Scanner;

public class UniqueElement
{
	public static void uniqueEle(int a[])
	{
		System.out.println("Unique elements in an given array is");
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(a[i]);
				}
				
			}
			
		}
	}

	public static void main(String[] args) 
	{
		//int[]a= {6,4,6,8,6,3,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		
		UniqueElement.uniqueEle(a);

		

	}

}
