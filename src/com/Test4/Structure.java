package com.Test4;
//containment of structure class using getter setter methods

class Nib
{
	private String materialType;
	private int width;
	
	public void setMaterialType(String materialType)
	{
		this.materialType=materialType;
	}
	public String getMaterialType()
	{
		return materialType;
	}
	
	public void setWidth(int width)
	{
		this.width=width;
	}
	public int getWidth()
	{
		return width;
	}
	
}
class Refill
{
	private String inkColour;
	private int length;
	private Nib nib;
	
	public void setInkColour(String inkColour)
	{
		this.inkColour=inkColour;
	}
	public String getInkColour()
	{
		return inkColour;
	}
	
	public void setLength(int length)
	{
		this.length=length;
	}
	public int getLength() 
	{
		return length;
	}
	
	public void setNib(Nib nib)
	{
		this.nib=nib;
	}
	public Nib getNib()
	{
		return nib;
	}
	
}
class Pen
{
	private int capLength;
	private String brand;
	private Refill refill;
	
	public void setCapLength(int capLength)
	{
		this.capLength=capLength;
	}
	public int getCapLength()
	{
		return capLength;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}
	
	public void setRefill(Refill refill)
	{
		this.refill=refill;
	}
	public Refill getRefill()
	{
		return refill;
	}
	
}
public class Structure 
{
	private Pen pen;
	public void setPen(Pen pen)
	{
		this.pen=pen;
	}
	public Pen getPen()
	{
		return pen;
	}
	
	

	public static void main(String[] args) 
	{
		Structure s=new Structure();
	
        s.setPen(new Pen());
       	s.getPen().setCapLength(4);
		s.getPen().setBrand("Reynolds");
		
		s.getPen().setRefill(new Refill());
		s.getPen().getRefill().setInkColour("Blue");
		s.getPen().getRefill().setLength(6);
		
		s.getPen().getRefill().setNib(new Nib());
		s.getPen().getRefill().getNib().setMaterialType("Metal");
		s.getPen().getRefill().getNib().setWidth(3);
		
		System.out.println(s.getPen().getCapLength()+" "+s.getPen().getBrand()+" "+s.getPen().getRefill().getInkColour()+" "+s.getPen().getRefill().getLength()+" "+s.getPen().getRefill().getNib().getMaterialType()+" "+s.getPen().getRefill().getNib().getWidth());
		
				
		
		
		
		
		

	}

}
