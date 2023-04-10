package com.Test2;
import java.util.Scanner;
public class KaprekarNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int square=num*num;
		int copynum=num;
	
		int count=0;
		int sum=0;
		while(num>0)
		{
			
			count++;
			num=num/10;
		}
		//System.out.println(+count);
		
		num=copynum;
		int power=1;
		
		for(int i=1; i<=count; i++)
		{
			power=power*10;
		}
		
		while(square>0)
		{
			int result=square%power;
			sum=sum+result;
			square=square/power;
		}
		 
		if(copynum==sum)
		{
			System.out.println("Yes");
		}
		 else
		{
			System.out.println("No");
		}
		

	}

}
