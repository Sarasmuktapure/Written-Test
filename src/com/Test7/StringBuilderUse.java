package com.Test7;
//Q7.use of string builder
public class StringBuilderUse {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Welcome");
		sb.append(" java");
		System.out.println(sb);//add the new string to existing 
		
		sb.insert(7, " to");
		System.out.println(sb);//inserts the new string to old at given position
		
		sb.replace(8, 10, "in");
		System.out.println(sb);//replace from 8th index to 9th index that is 10-1=9
		
		sb.delete(8, 10);
		System.out.println(sb);//delete from 8th index to 9th index that is 10-1=9
		
		sb.reverse();
		System.out.println(sb);//reverse the current string
		
		
		//System.out.println(sb.capacity());
		//sb.append("java is my favorite language");//here capacity increases to (capacity*2+2)
		//System.out.println(sb.capacity());
		
		

	}

}
