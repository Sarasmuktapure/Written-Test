package com.Test1;
//spy number is sum of digit and product of digit is equal
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		int product=1;
		
		while(num>0)
		{
			int digit=num%10;
			sum=sum+digit;
			product=product*digit;
			num=num/10;
			
		}
		System.out.println("The sum of digit is="+sum);
		System.out.println("The product of digit is="+product);
		
		if(sum==product)
		{
			System.out.println("Entered number is spy number");
		}
		else
		{
			System.out.println("Entered number is not spy number");
		}

	}

}
