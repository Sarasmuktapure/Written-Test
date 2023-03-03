package com.Test1;
// get 1!+2!+3!+4!

public class SumofFactorial {

	public static void main(String[] args) 
	{
		int fact=1;
		int sum=0;
		for(int i=1;i<=4;i++)
		{
			fact=fact*i;
			sum=sum+fact;
		}
		System.out.println(sum);

	}

}
