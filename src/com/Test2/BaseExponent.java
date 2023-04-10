package com.Test2;
import java.util.Scanner;
public class BaseExponent {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value");
		int base=sc.nextInt();
		System.out.println("Enter the exponent value");
		int expo=sc.nextInt();
		int result=1;
		int e=expo;
		while(expo>0)
		{
			result=base*result;
			expo--;
		}
		System.out.println("The result of " +base+ "^" +e+ " is="+result);
		
	 }

}
