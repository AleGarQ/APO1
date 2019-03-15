package model;

public class DragonZ
{
	//Atributes
	
	private double food;
	private double temperature;
	private double water;
	
	//Relations
	
	private Dragon d1;
	private Dragon d2;
	private Dragon d3;
	
	//Methods
	
	public DragonZ(double food, double temperature, double water, Dragon d1, Dragon d2)
	{
		this.food = food;
		this.temperature = temperature;
		this.water = water;
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public double getFood()
	{
		return food;
	}
	
	public void setFood(double food)
	{
		this.food = food;
	}
	
	public double getTemperature()
	{
		return temperature;
	}
	
	public void setTemperature(double temperature)
	{
		this.temperature = temperature;
	}
	
	public double getWater()
	{
		return water;
	}
	
	public void setWater(double water)
	{
		this.water = water;
	}
	
	public Dragon getD1()
	{
		return d1;
	}
	
	public void setD1(Dragon d1)
	{
		
		this.d1 = d1;
	}
	
	public Dragon getD2()
	{
		return d2;
	}
	
	public void setD2(Dragon d2)
	{
		
		this.d2 = d2;
	}
}