package com.Test5;
//Q1.To find missing number in an array
import java.util.Scanner;

public class MissingNumber 
{
	public static void missingNum(int a[])
	{
		int n=a.length+1;
		int totalEleSum=(n*(n+1))/2;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int missingNum=totalEleSum-sum;
		System.out.println("The missing number from the array is="+missingNum);
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
		MissingNumber.missingNum(a);
   }

}
