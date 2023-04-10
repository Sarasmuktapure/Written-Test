package com.Test4;
//to remove duplicate elements from an array
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int size=a.length;
		int b[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("------------------------------");
		System.out.println(Arrays.toString(a));
		
		int index=0;
		int count;
		for(int i=0;i<size;i++)
		{
			count=0;
			for(int j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				b[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<index;i++)
		{
			a[i]=b[i];
		}
		for(int i=0;i<index;i++)
		{
			System.out.println(a[i]);
		}

	}

}
