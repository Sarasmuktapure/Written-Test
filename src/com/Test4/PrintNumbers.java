package com.Test4;
//print 1to 50 if multiple of 3 then buzz if multiple of 5 then fizz if multiple of both buzzfizz
//and count how many times they are printed
public class PrintNumbers {

	public static void main(String[] args) 
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println(i);
		}
		System.out.println("--------------------------------------------");
		int buzzcount=0;
		int fizzcount=0;
		int buzzfizzcount=0;
		for(int i=1;i<=50;i++)
		{
			  if(i%15==0)
			    {
			    	System.out.println("buzzfizz");
			    	buzzfizzcount++;
			    }
			
				 else if(i%5==0)
			    {
				System.out.println("fizz");
				fizzcount++;
			    }
				 else if(i%3==0)
				{
				     System.out.println("buzz");
				     buzzcount++;
				}
		       else
			  {
				System.out.println(i);
			  }
		}
		System.out.println("--------------------------------------------------");
		System.out.println("buzz printed "+buzzcount+" times");
		System.out.println("fizz printed "+fizzcount+" times");
		System.out.println("buzzfizz printed "+buzzfizzcount+" times");

	}

}
