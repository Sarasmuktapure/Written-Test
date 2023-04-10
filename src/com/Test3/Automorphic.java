package com.Test3;
import java.util.Scanner;
public class Automorphic
{
	private static boolean isAutomorphic(int num)
	{
		int count=0;
		int n=num*num;
		int copynum=num;
		
		while(num>0)
	    {
		  count++;
	
		  num=num/10;
	    }
	
	
	    num=copynum;
	    int power=1;
	
	    for(int i=1; i<=count; i++)
	    {
		  power=power*10;
	    }
	
          int end=n%power;
		  return num==end;
	}
	  

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting value");
		int start=sc.nextInt();
		System.out.println("Enter the ending value");
		int end=sc.nextInt();
		System.out.println("Automorphic numbers between "+start+" and "+end+" is");
		for(int i=start;i<=end;i++)
		{
			if(isAutomorphic(i))
				System.out.println(i+" ");
		}

	}

}
