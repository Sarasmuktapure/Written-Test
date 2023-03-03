package com.Test1;
// cube of number ends with original number
import java.util.Scanner;
public class TrimorphicNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int copynum=num;
		int n=num*num*num;
		int count=0;
		int power=1;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		//System.out.println(count);
		
		for(int i=1;i<=count; i++)
		{
			power=power*10;
		}
		//System.out.println(power);
		
		int end=n%power;
		//System.out.println(end);

		if(copynum==end)
		{
			System.out.println("Entered number is Trimorphic number");
		}
		else
		{
			System.out.println("Entered number is not Trimorphic number");
		}
		
		
		

	}

}
