package com.Test3;
import java.util.Scanner;
public class NationalGame 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the country name");
		String c=sc.nextLine();
		
		switch(c)
		{
		case "India":System.out.println("Hockey");
		break;
		
		case "China":System.out.println("Table Tennis");
		break;
		
		case "Bangladesh":System.out.println("Kabaddi");
		break;
		
		case "Italy":System.out.println("Football");
		break;
		
		case "United States":System.out.println("Baseball");
		break;
		
		default:System.out.println("Invalid Input");
		
		
		
		}

	}

}
