package com.Test1;

public class Pattern4 {

	public static void main(String[] args)
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=i; j<4; j++)
			{
				System.out.print(" ");			
			}
			for(int k=1; k<(i*2); k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
