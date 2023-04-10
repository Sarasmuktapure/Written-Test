package com.Test3;
//wap to show parameterized constructor
import java.util.Scanner;

class Addition
{
	Addition(int x,int y)
	{
		System.out.println("Addition of two number is="+(x+y));
	}
}

public class ParametrizedConstructor extends Addition
{
	
	ParametrizedConstructor(int x,int y)
	{
		super(x,y);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value");
		int num1=sc.nextInt();
		System.out.println("Enter the second value");
		int num2=sc.nextInt();
		ParametrizedConstructor pc=new ParametrizedConstructor(num1,num2);

	}

}
