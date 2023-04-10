package com.Test3;

public class Pattern {

	public static void main(String[] args)
	{
		int count=1;
	  for(int i=1; i<=4;i++)
	  {
		  for(int j=3; j>=i; j--)
		  {
			  System.out.print(" ");	 
		  }
		  
		  for(int k=1; k<=count; k++)
		  {
			  System.out.print(k);
		  }
		  count=count+2;
	  
	  System.out.println();
	  }

	}

}
