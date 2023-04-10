package com.Test3;

public class ThisDemo
{
	    int a;
		int b;
		
		public ThisDemo()
		{
			this(20,10);
			System.out.println("Inside Default constructor");
		}
		
		public ThisDemo(int a, int b)
		{
			this.a=a;
			this.b=b;
			System.out.println("Inside parameterized constructor");
			this.display();
		}
		
		
		 void display()
		{
			System.out.println("a="+a);
			System.out.println("b="+b);
			
		}
		
			
	       public static void main(String[] args)
		{
			ThisDemo t=new ThisDemo();
			
		}

	}


	
