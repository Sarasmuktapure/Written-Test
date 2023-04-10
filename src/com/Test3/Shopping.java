package com.Test3;
import java.util.Scanner;
public class Shopping
{
	double d,amount,price;
	
	public  void doTransaction(double price)
	{
		
		 amount=price-(price*15/100);
		 
    }
	public void doTransaction(String type)
	
	{
		switch(type)
		{
		case "CreditCard":System.out.println("You got 15% discount on bill on credit card transaction so payable amount is="+amount);
		break;
		
		case "DebitCard":System.out.println("No discount on bill on debit card transaction");
		break;
		
		default:System.out.println("Invalid input");
		
		}
		
		//if(type=="CreditCard")
		//{
		//System.out.println("You got 15% discount on bill on credit card transaction so payable amount is="+amount);
	    //}
		//else if(type=="DebitCard")
		//{
			//System.out.println("No discount on bill on debit card transaction");
		//}
	}
	
		
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price");
		double price=sc.nextDouble();
		System.out.println("Enter the type of transaction");
		String type=sc.next();
		
		Shopping s=new Shopping();
		s.doTransaction(price);
		s.doTransaction(type);
		
	
	
		//s.doTransaction("CreditCard");
		//s.doTransaction("DebitCard");

	}

}
