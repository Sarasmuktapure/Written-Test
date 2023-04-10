package com.Test7;
//Q7 use of string buffer functions
public class StringBufferUse {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer();//size=16
		//by default the size of array is 16 when we use default StringBuffer()
		
		sb.append("pune");
		System.out.println(sb);//here we add pune in our existing string
		
		sb.append(" city");
		System.out.println(sb);//here we add city in our existing string
		
		sb.insert(4, "is");
		System.out.println(sb);
		
		//sb.reverse();
		//System.out.println(sb);//reverse the string
		
		sb.delete(3, 5);
		System.out.println(sb);//delete the chr from 3rd position to 4th position that is(end-1)
		
		StringBuffer sb2=new StringBuffer("Hello");//size=16+5=21 that is 16 by default and 5 is size of defined string here is hello
		
		StringBuffer sb3=new StringBuffer("Hello");
		System.out.println(sb2.equals(sb3));//here equals gives the reference of that object 
		//here we create to object sb3 and sb4 so we get different reference so answer is false
		

	}

}
