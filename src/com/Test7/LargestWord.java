package com.Test7;
//Q1.to find largest word in a string
import java.util.Scanner;


public class LargestWord
{
	public static void largestWord(String s)
	{
		
		String []word=s.split(" ");
		String largest=word[0];
		//String currentword;
		for(int i=0;i<word.length;i++)
		{
			//currentword=word[i];
			if(word[i].length()>largest.length())
			{
				largest=word[i];
			}
		}
		System.out.println("Lergest word from given string is: "+largest);
			//System.out.println(largest+" "+largest.length());	
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		LargestWord.largestWord(s);
		

	}

}
