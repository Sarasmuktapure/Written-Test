package com.Test7;
//Q6.
import java.util.Scanner;

public class SumDigit {
	public static boolean  checkReverseSum(String str)
	{
		int sum1=0;
		int sum2=0;
		
			
		for(int i=0;i<3;i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				int x=Character.getNumericValue(str.charAt(i));
				sum1=sum1+x;
			}
		}
		//System.out.println(sum1);
		
		for(int i=str.length()-1;i>=str.length()-3;i--)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				//System.out.println(str.charAt(i));
				int x=Character.getNumericValue(str.charAt(i));
				sum2=sum2+x;
			}
		}
		
		//System.out.println(sum2);
		if(sum1==sum2)
		{
			return true;
		}
		
		return false;
	}
	
	
	
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		//SumDigit.checkReverseSum(str);
		
		
		if(str.length()<=2)
		{
			System.out.println("Length is not valid ");
		}
		else
		{
			
		SumDigit sd=new SumDigit();
		boolean isSame=sd.checkReverseSum(str);

		
		if(isSame)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
				
		
		}
		
	}

}
