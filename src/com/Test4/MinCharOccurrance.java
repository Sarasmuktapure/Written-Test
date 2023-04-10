package com.Test4;

import java.util.Scanner;

public class MinCharOccurrance
{
	public static void charOccur(char[]ch)
	{
		int freq[]=new int[ch.length];
		int min=Integer.MAX_VALUE;
		char minChar=Character.MAX_VALUE;
		for(int i=0;i<ch.length;i++)
		{
			freq[i]=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(ch[i]==ch[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						freq[i]++;
					
					}
				}
				System.out.println(ch[i]+" Occurs "+freq[i]+" times");
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(min>freq[i] && freq[i]!='0')
			{
				min=freq[i];
				//minChar=ch[i];
				if(ch[i]<minChar)
				{
					minChar=ch[i];
				}
				
			}
		}
		System.out.println("Minimum Occurring Character is= "+minChar);
}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		char[]ch=new char[size];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			char c=sc.next().charAt(0);
			ch[i]=c;
		}
		
		MinCharOccurrance.charOccur(ch);
		
		
		

	}

}
