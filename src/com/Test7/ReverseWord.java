package com.Test7;
//Q4.reverse middle words
import java.util.Scanner;


public class ReverseWord {
	public static void reverseWord(String s)
	{
		String []str=s.split(" ");
		String revstr="";
		String result="";
		
		for(int i=1;i<str.length-1;i++)
		{
			String word=str[i];
			String wordrev="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				wordrev=wordrev+word.charAt(j);
			}
			revstr=revstr+wordrev+" ";
			
			
		}
		result=result+str[0]+" "+revstr+str[str.length-1];
		//System.out.println(revstr);
		System.out.println(result);
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		ReverseWord.reverseWord(s);

			
		

	}

}
