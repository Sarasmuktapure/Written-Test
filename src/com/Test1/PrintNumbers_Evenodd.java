package com.Test1;

public class PrintNumbers_Evenodd {

	public static void main(String[] args)
	{
		for(int num=1; num<=50; num++)
		{
			if(num%2==0)
			{
				System.out.println(+num);
			}
			else
			{
				int sq=(-num)*(-num);
				int result=sq*(-1);
				System.out.println(+result);
			}
		}

	}

}
