package com.Test1;

public class FibboSeries {

	public static void main(String[] args)
	{
		int firstTerm=0;
		int secondTerm=1;
		
		for(int i=1; i<=20; i++)
		{
			System.out.println(firstTerm);
			int nextTerm=firstTerm+secondTerm;
			
	
		    firstTerm=secondTerm;
		    secondTerm=nextTerm;
		    
        }
	}
		

}
