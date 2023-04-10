package com.Test3;
import java.util.Scanner;
class Add
{
	int num1;
	int num2;
	int sum;
	Add(int num1,int num2)
	{
		sum=num1+num2;
	}
	
	public void displayAdd()
	{
		System.out.println("Addition of Two numbers are= "+sum);
	}
}

class Perform extends Add{

	Perform(int num1, int num2)
	{
		super(num1, num2);
		
	}
	public void show() 
	{
		super.displayAdd();
	}
	
}

public class Super {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
		Perform p=new Perform(num1,num2);
		p.show();
		
	  

	}

}
