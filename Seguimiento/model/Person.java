package model;

public class Person
{
	//Atributes
	
	private String name;
	
	//Relations
	
	private Phone p1;
	private Phone p2;
	
	//Methods 
	
	public Person(String name, Phone p1, Phone p2)
	{
		this.name = name;
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Phone getP1()
	{
		return p1;
	}
	
	public void setP1(Phone p1)
	{
		this.p1 = p1;
	}
	
	public Phone getP2()
	{
		return p2;
	}
	
	public void setP2(Phone p2)
	{
		this.p2 = p2;
	}
}