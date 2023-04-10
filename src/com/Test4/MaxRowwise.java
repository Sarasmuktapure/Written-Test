package com.Test4;
//find maximum element from each row
import java.util.Scanner;

public class MaxRowwise
{
	public static void maxRow(int a[][])
	{
		System.out.println("Max element from each row");
		for(int i=0;i<a.length;i++)
		{
			int max=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.print(max+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of rows for array");
		int rowsa=sc.nextInt();
		System.out.println("Enter the size of column for array");
		int colma=sc.nextInt();
		int [][]a=new int[rowsa][colma];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("-------------------------------------------");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		MaxRowwise.maxRow(a);


	}

}
