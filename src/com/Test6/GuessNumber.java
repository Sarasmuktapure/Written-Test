package com.Test6;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int keyNum=4;
		int count=0;
		
		while(true)
		{
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num>=1 && num<=9)
		{
			if(num==keyNum)
			{
				count++;
				System.out.println("Correct key number");
				break;
			}
			else if(num!=keyNum)
			{
				count++;
				System.out.println("Incorrect number");
			}
		}
		else
		{
			count++;
			System.out.println("Enter single digit number");
		}
		
		}
		System.out.println("Number of trials to guess number is= "+count);

	}

}
