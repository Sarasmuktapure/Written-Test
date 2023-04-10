package com.Test4;
//count number of even and odd elements
import java.util.Arrays;
import java.util.Scanner;

public class CountEvenOdd
{
	public static void countEvenOdd(int a[])
	{
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("The number of even terms are="+even);
		System.out.println("The number of odd terms are="+odd);
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			
		}
		System.out.println("---------------------------------------");
		System.out.println(Arrays.toString(a));
		CountEvenOdd.countEvenOdd(a);
		
		
		



	}

}
