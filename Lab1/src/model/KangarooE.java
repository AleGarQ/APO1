package model;

public class KangarooE
{
	//Atributes
	
	private double area;
	private double food;
	private double water;
	
	//Relations
	
	private Kangaroo k1;
	private Kangaroo k2;
	private Kangaroo k3;

	//Methods
	
	public KangarooE(double area, double food, double water, Kangaroo k1, Kangaroo k2, Kangaroo k3)
	{
		this.area = area;
		this.food = food;
		this.water = water;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
	}
	
	public double getFood()
	{
		return food;
	}
	
	public void setFood(double food)
	{
		this.food = food;
	}
	
	public double getArea()
	{
		return area;
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}
	
	public double getWater()
	{
		return water;
	}
	
	public void setWater(double water)
	{
		this.water = water;
	}
	
	public Kangaroo getK1()
	{
		return k1;
	}
	
	public void setK1(Kangaroo k1)
	{
		this.k1 = k1;
	}
	
	public Kangaroo getK2()
	{
		return k2;
	}
	
	public void setK2(Kangaroo k2)
	{
		this.k2 = k2;
	}
	
	public Kangaroo getK3()
	{
		return k3;
	}
	
	public void setK3(Kangaroo k3)
	{
		this.k3 = k3;
	}
}