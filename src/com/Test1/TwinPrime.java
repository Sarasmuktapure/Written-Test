package com.Test1;
// difference between two prime number is 2
import java.util.Scanner;
public class TwinPrime {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
        boolean isprime=true;
		
		for(int i=2; i<num1; i++)
		{
			if(num1%i==0)
			{
				isprime=false;
				break;
			}
		}
		
		
		for(int i=2; i<num2; i++)
		{
			if(num2%i==0)
			{
				isprime=false;
				break;
			}
		}
		
		
		if((num1-num2)==2 || (num2-num1)==2)
        {
	      System.out.println("It is Twin Prime Number");
        }
		else
		{
			 System.out.println("It is Not Twin Prime Number");
		}
	
		

	}

}
