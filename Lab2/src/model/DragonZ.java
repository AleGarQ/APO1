package model;

public class DragonZ
{
	//Atributes
	
	private double food;
	private double temperature;
	
	//Relations
	
	private Dragon d1;
	private Dragon d2;
	
	//Methods
	
	public DragonZ(double food, double temperature, Dragon d1, Dragon d2)
	{
		this.food = food;
		this.temperature = temperature;
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
	
	public String whoVowels()
	{
		String msg = "";

		if (d1 != null) 
		{
			msg += d1.whoVowel();
		}
		if (d2 != null) 
		{
			msg += d2.whoVowel();
		}

		return msg;
	}
	
	public double calculateWater()
	{
		double water = 0.0;
		
		if(d1 != null)
		{
			water += d1.calculateBmi()*0.75;
		}
		if(d2 != null)
		{
			water += d2.calculateBmi()*0.75;
		}
		
		return water;
	}
	
	public String showZone()
	{
		String msg = "";
		
		msg += "=================================================================== \n";
		msg += "La cantidad de comida es: "+food+"kg \n";
		msg += "La cantidad de agua es: "+calculateWater()+" litros \n";
		msg += "La temperaura es: "+temperature+"\n";
		msg += "=================================================================== \n";
		if(d1 != null)
		{
			msg += "El primer dragon de la zona es: \n \n"+d1.showDragon()+"\n";
			msg += "------------------------------------------------------------------- \n";
		}
		if(d2 != null)
		{
			msg += "El segundo dragon de la zona es: \n \n"+d2.showDragon()+"\n";
			msg += "------------------------------------------------------------------- \n";
		}
		msg += "=================================================================== \n";
		
		return msg;
	}
}