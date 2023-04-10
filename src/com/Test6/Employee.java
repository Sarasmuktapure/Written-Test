package com.Test6;

import java.util.Scanner;

class Department
{
	int deptId;
	String deptName;
	Department(int deptId,String deptName)
	{
		this.deptId=deptId;
		this.deptName=deptName;
	}
	public String toString()
	{
		return deptId+" "+deptName;
	}
}


public class Employee 
{
	int empno;;
	String name;
	Department dept;
	
	Employee(int empno,String name,Department dept)
	{
		this.empno=empno;
		this.name=name;
		this.dept=dept;
	}
	
	public String toString()
	{
		return empno+" "+name+" "+dept;
	}

	public static void main(String[] args)
	{
		Employee emp []=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
					
			System.out.println("Enter the data for employee");
			System.out.println("Enter the emp id");
			int eid=sc.nextInt();
			System.out.println("Enter the emp name");
			String ename=sc.next();
			System.out.println("Enter dept id");
			int did=sc.nextInt();
			System.out.println("Enter the dept name");
			String dname=sc.next();
			
			
		emp[i]=new Employee(eid,ename,new Department(did,dname));
		
		}					
			
			for(int i=0;i<emp.length;i++)
			{
			  System.out.println(emp[i]);
			}
		
			 
		

	}

}
