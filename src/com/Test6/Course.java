package com.Test6;

class SubCourse
{
	int subId;
	String subName;
	SubCourse()
	{
		this(8,"Electronics");
	}
	SubCourse(int subId,String subName)
	{
		
		this.subId=subId;
		this.subName=subName;
	}
	public String toString()
	{
		return "SubCourse id= "+subId+", SubCourse name= "+subName;
	}
}


public class Course 
{
	int cid;
	String cname;
	SubCourse subc;
	Course()
	{
		this(4,"Engineering",new SubCourse());
	}
	Course(int cid,String cname,SubCourse subc)
	{
		this.cid=cid;
		this.cname=cname;
		this.subc=subc;
		
	}
	public String toString()
	{
		return "Course id= "+cid+", Course name= "+cname+", "+subc;
	}

	public static void main(String[] args)
	{
		SubCourse sc=new SubCourse();
		Course c=new Course();
		//System.out.println(sc.toString());
		System.out.println(c.toString());
		
		

	}

}
