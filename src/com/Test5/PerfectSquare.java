package com.Test5;
//Q6 find perfect square element from array
import java.util.Scanner;

public class PerfectSquare
{
	public static boolean isPerfectSquare(int n)
	{
		if(n<1)
			return false;
		for(int i=1;i*i<=n;i++)
		{
			if((n%i==0) && (n/i==i))
			{
				return true;
			}
		}
		return false;
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
		System.out.println("The perfect square elements are");
		for(int i=0;i<a.length;i++)
		{
			if(isPerfectSquare(a[i]))
			{
				System.out.println(a[i]);
			}
		}
	}

}
