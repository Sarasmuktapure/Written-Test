package com.Test2;
import java.util.Scanner;
public class MobileNumber
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any mobile number");
		long num=sc.nextLong();
		
		for(int i=0; i<=9; i++)
		{
			int count=0;
			long copynum=num;
			while(copynum>0)
			{
				long digit=copynum%10;
				if(digit==i)
				{
					count++;
				}
				copynum=copynum/10;
			}
			if(count>0)
			{
				//System.out.println(i+"\t "+count);
				System.out.println("Frequency of a digit "+i+" is="+count);
			}
		}
	}

}
