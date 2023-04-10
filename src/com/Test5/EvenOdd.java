package com.Test5;
//Q5.arrange even first then odd elements in an array
import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd 
{
	public static void evenOdd(int a[])
	{
		int b[]=new int[a.length];
		int pos=0;
		int evensize=0;
		int oddsize=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evensize++;
			}
			else
			{
				oddsize++;
			}
		}
		int even[]=new int[evensize];
		int odd[]=new int[oddsize];
		int e=0,o=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[e]=a[i];
				e++;
			}
			else if(a[i]%2!=0)
			{
				odd[o]=a[i];
				o++;
			}
		}
		for(int i=0;i<evensize;i++)
		{
			b[pos]=even[i];
			pos++;
		}
		for(int i=0;i<oddsize;i++)
		{
			b[pos]=odd[i];
			pos++;
		}
		System.out.println(Arrays.toString(b));
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
		EvenOdd.evenOdd(a);
	}

}
