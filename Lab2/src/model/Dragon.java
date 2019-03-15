package model;

public class Dragon
{
	//Atributes
	private String name;
	private double weight;
	private double height;
	private String gender;
	
	//Methods
	
	public Dragon(String name, double weight, double height, String gender)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
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
	
	public double calculateBmi()
	{
		double bmi = 0.0;
		return bmi = (weight/(height*height));
	}
	
	public boolean vowel()
	{
		boolean vowel = false;
		int x = 0, x1 = name.length()-1;

		if((name.charAt(x)=='a') || (name.charAt(x)=='e') || (name.charAt(x)=='i') || (name.charAt(x)=='o') || (name.charAt(x)=='u' || name.charAt(x)=='A') || (name.charAt(x)=='E') || (name.charAt(x)=='I') || (name.charAt(x)=='O') || (name.charAt(x)=='U')) 
		{
			x = x1;
			if((name.charAt(x)=='a') || (name.charAt(x)=='e') || (name.charAt(x)=='i') || (name.charAt(x)=='o') || (name.charAt(x)=='u' || name.charAt(x)=='A') || (name.charAt(x)=='E') || (name.charAt(x)=='I') || (name.charAt(x)=='O') || (name.charAt(x)=='U'))
			{
				vowel = true;			
			}
		}
		return vowel;
	}

	public String whoVowel()
	{
		String msg = "";

		if (vowel())
		{
			msg += name + ".\n";
		}
		return msg;
	}

	public String showVowels()
	{
		String msg = "";

		if (vowel())
		{
			msg += "El nombre de este dragon barbado empieza y termina en vocal\n";	
		}else
		{	
			msg += "El nombre de este dragon barbado no empieza y termina en vocal\n";
		}

		return msg;
	}
	
	public String showDragon()
	{
		String msg = "\n";
		
		msg += "El nombre del dragon barbado es: "+name+"\n";
		msg += "Pesa: "+weight+"Kg. \n";
		msg += "Mide: "+height+"m. \n";
		msg += "Su genero es: "+gender+"\n";
		msg += "Tiene un imc de: "+calculateBmi()+"\n";
		msg += showVowels();
	
		return msg;
	}
}