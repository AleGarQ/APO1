package model;

public class Dragon
{
	//Atributes
	private String name;
	private double weight;
	private double height;
	private String gender;
	private double bmi;
	
	//Methods
	
	public Dragon(String name, double weight, double height, String gender, double bmi)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.bmi = bmi;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public double getBmi()
	{
		return bmi;
	}
	
	public void setBmi(double bmi)
	{
		this.bmi = bmi;
	}
}