package com.Test2;
import java.util.Scanner;
public class PrintSeries {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the terms till you want to print the series");
		int num=sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			int result=i*i-1;
			System.out.println(+result);
						
			
			}
			
				
			
			
		}
		

	}


