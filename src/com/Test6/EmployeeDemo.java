package com.Test6;

class Programmer{
	public void workingHours()
	{
		System.out.println("Working hours for programmer is full time");
	}
}


public class EmployeeDemo extends Programmer
{
	public void workingHours()
	{
		System.out.println("Working hours for employee is part time");
	}
	

	public static void main(String[] args) {
		EmployeeDemo ed=new EmployeeDemo();
		ed.workingHours();
		Programmer p=new Programmer();
		p.workingHours();
	
		

	}

}
