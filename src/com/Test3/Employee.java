package com.Test3;

class Department
{
	private int did;
	private String dname;
	
	public void setDid(int did)
	{
		this.did=did;
	}
	public int getDid()
	{
		return did;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public String getDname()
	{
		return dname;
	}
	
}
public class Employee
{
	private int id;
	private String name;
	private boolean ismanager;
	private float salary;
	 private Department dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIsmanager() {
		return ismanager;
	}

	public void setIsmanager(boolean ismanager) {
		this.ismanager = ismanager;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setId(2);
		e.setName("Aditya");
		e.setSalary(50000);
		e.setIsmanager(true);
		
		e.setDept(new Department());
		e.getDept().setDid(12);
		e.getDept().setDname("Electronics");
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.ismanager+" "+e.getDept().getDid()+" "+e.getDept().getDname());
		
	}

}
