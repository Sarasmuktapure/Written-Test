package com.Test4;
//car class containment object in object using method
class Gear
{
	String type;
	Gear(String type)
	{
		this.type=type;
	}
	void gearShow()
	{
		System.out.println(type);
	}
	
}
class SubEngine
{
	String subengtype;
	SubEngine(String subengtype)
	{
		this.subengtype=subengtype;
	}
	void subengineShow()
	{
		System.out.println(subengtype);
	}
}
class Engine
{
	int id;
	String lastenginecleandate;
	SubEngine seng;
	Engine(int id,String lastenginecleandate,SubEngine seng)
	{
		this.id=id;
		this.lastenginecleandate=lastenginecleandate;
		this.seng=seng;
	}
	void engineShow()
	{
		System.out.println(id+" "+lastenginecleandate);
		seng.subengineShow();
	}
	
}

public class Car 
{
	int carid;
	String carcolor;
	Engine eng;
	Gear gr;
	Car(int carid,String carcolor,Engine eng,Gear gr)
	{
		this.carid=carid;
		this.carcolor=carcolor;
		this.eng=eng;
		this.gr=gr;
	}
	void carShow()
	{
		System.out.println(carid+" "+carcolor);
		eng.engineShow();
		gr.gearShow();
	}

	public static void main(String[] args) 
	{
		Gear g=new Gear("auto manual");
		SubEngine s=new SubEngine("Hybrid");
		Engine e=new Engine(2,"10/03/2023",s);
		Car c=new Car(4,"Blue",e,g);
		c.carShow();
		

	}

}
