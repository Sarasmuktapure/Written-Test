package com.Test3;
// constructor overloading
import java.util.Scanner;

class Area{
	private int side;
	private int length;
	private int breadth;
	
	Area(int side)
	{
		
		this.side=side;
	}
	public void getSquareArea()
	{
		System.out.println("Area of square is="+(side*side));
	}
	
	Area(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void getRectangleArea()
	{
		System.out.println("Area of rectangle is="+(length*breadth));
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square");
		int s=sc.nextInt();
		
		 Area a=new Area(s);
		 a.getSquareArea();
		
		System.out.println("Enter the length of rectangle");
		int l =sc.nextInt();
		
		System.out.println("Enter the breadth of rectangle");
		int b=sc.nextInt();
		
	  
	   
	   Area a1=new Area(l,b);
	   a1.getRectangleArea();
		

	}

}
