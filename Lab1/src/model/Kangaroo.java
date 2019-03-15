package model;

public class Kangaroo
{
	//Atributes
	
	private String name;
	private double weight;
	private double height;
	private String gender;
	private String blood;
	private double bmi;
	private String heartRisk;
	private String vaccine;
	
	//Relations
	
	private Date bd;
	
	//Methods
	
	public Kangaroo(String name, double weight, double height, String gender, String blood, double bmi, String heartRisk, String vaccine, Date bd)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.blood = blood;
		this.bmi = bmi;
		this.heartRisk = heartRisk;
		this.vaccine = vaccine;
		this.bd = bd;
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
	
	public String getBlood()
	{
		return blood;
	}
	
	public void setBloood(String blood)
	{
		this.blood = blood;
	}
	
	public double getBmi()
	{
		return bmi;
	}
	
	public void setBmi(double bmi)
	{
		this.bmi = bmi;
	}
	
	public String getHeartRisk()
	{
		return heartRisk;
	}
	
	public void setHeartRisk(String heartRisk)
	{
		this.heartRisk = heartRisk;
	}
	
	public String getVaccine()
	{
		return vaccine;
	}
	
	public void setVaccine(String vaccine)
	{
		this.vaccine = vaccine;
	}
	
	public Date getBd()
	{
		return bd;
	}
	
	public void setBd(Date bd)
	{
		this.bd = bd;
	}
}