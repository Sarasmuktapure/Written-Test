package com.Test1;

public class PrintNumbers
{

	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if((i%5==0) || (i%10==0))
			{
				continue;
			}
			System.out.println(+i);
		}

	}

}
