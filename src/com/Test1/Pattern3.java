package com.Test1;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{ 
			for(int j=4;j>=i;j--)
			{
				System.out.print( " ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print( i );
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print( i );
			}
			System.out.println();
		}
			

	}
}
