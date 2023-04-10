package com.Test3;
import java.util.Scanner;

class Box{
	private double width;
	private double height;
	private double depth;
	
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	public double volume()
	{
		return (width*height*depth);
		
	}
}
class BoxWeight extends Box{
	double weight;
	BoxWeight(double w,double h,double d,double m)
	{
		super(w,h,d);
		weight=m;
	}
}
class Shipment extends BoxWeight{
	double cost;
	Shipment(double w,double h,double d,double m,double c)
	{
		super(w,h,d,m);
		cost= c;
	}
}

public class MultilevelInheritance
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width");
		double wi=sc.nextDouble();
		
		System.out.println("Enter the height");
		double he=sc.nextDouble();
		
		System.out.println("Enter the depth");
		double de=sc.nextDouble();
		
		System.out.println("Enter the weight in kg");
		double we=sc.nextDouble();
		
		System.out.println("Enter the cost");
		double c=sc.nextDouble();
		
		Shipment s=new Shipment(wi,he,de,we,c);

		System.out.println("The volume of box is="+s.volume());
		
		
	}

}
