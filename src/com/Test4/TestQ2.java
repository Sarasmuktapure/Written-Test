package com.Test4;

import java.io.Console;

public class TestQ2 
{
	static int mcCartyCounter=100;
	public static int mcCarthy(int n)
	{
		mcCartyCounter++;
		if(n>100)
			return n-10;
		else
			return mcCarthy(n+11);
					
	}

	public static void main(String[] args) 
	{
		//Console.WriteLine(mcCarthy(100)+" "+mcCartyCounter);
	
	
		
		

	}

}
