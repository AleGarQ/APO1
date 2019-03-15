package model;
import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;

public class Kangaroo
{
	//Atributes
	
	private String name;
	private double weight;
	private double height;
	private String gender;
	private String blood;
	
	//Relations
	
	private DateK bd;
	
	//Constants
	public final static String MALE = "Masculino";
	public final static String FEMALE = "Femenino";
	public final static String AB = "AB";
	public final static String A = "A";
	public final static String B = "B";
	public final static String O = "O";
	public final static int DAYS_OF_THE_YEAR = 365;
	public final static int DAYS_OF_THE_WEEK = 7;
	
	//Methods
	
	public Kangaroo(String name, double weight, double height, String gender, String blood, DateK bd)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.blood = blood;
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
	
	public void setBlood(String blood)
	{
		this.blood = blood;
	}
	
	public DateK getBd()
	{
		return bd;
	}
	
	public void setBd(DateK bd)
	{
		this.bd = bd;
	}
	
	//Calculate methods
	
	public double calculateBmi()
	{
		double bmi = 0.0;
		return bmi = (weight/(height*height));
	}
	
	public String calculateHR()
	{
		String heartRisk = "";
		
		if(calculateBmi() < 18 && blood.equalsIgnoreCase(A) || blood.equalsIgnoreCase(AB))
		{
			heartRisk = "Bajo";
		} else if(calculateBmi() < 18 && blood.equalsIgnoreCase(O) || blood.equalsIgnoreCase(B))
		{
			heartRisk = "Moderado";
		} else if(calculateBmi() >= 18 || calculateBmi() <= 25)
		{
			heartRisk = "Bajo";
		} else if(calculateBmi() > 25 && blood.equalsIgnoreCase(A) || blood.equalsIgnoreCase(B) || blood.equalsIgnoreCase(O))
		{
			heartRisk = "Alto";
		} else if(calculateBmi() > 25 && blood.equalsIgnoreCase(AB))
		{
			heartRisk = "Moderado";
		}
		return heartRisk;
	}

	public long calculateAge()
	{
	LocalDate start = LocalDate.of(bd.getYear(), bd.getMonth(), bd.getDay());
	LocalDate end = LocalDate.now();
	long years = ChronoUnit.YEARS.between(start, end);

		return years;
	}
	
	public int numberOfDays()
	{
		GregorianCalendar date = new GregorianCalendar(bd.getYear(), bd.getMonth() - 1, bd.getDay());
		
		int cont = 0;
		
		GregorianCalendar actualDate = new GregorianCalendar();
			if ((date.get(Calendar.DAY_OF_MONTH) == actualDate.get(Calendar.DAY_OF_MONTH)) && (date.get(Calendar.MONTH) == actualDate.get(Calendar.MONTH)) && (date.get(Calendar.YEAR) == actualDate.get(Calendar.YEAR)))
			{
		
				date.add(Calendar.DAY_OF_MONTH, 1);
				cont++;
			}
		return cont;
	}
	
	public int leftDays()
	{
		int days = 0;
		int leftDays = DAYS_OF_THE_YEAR - numberOfDays();

		days = leftDays % DAYS_OF_THE_WEEK;

		return days;
	}
	
	public int leftWeeks()
	{
		int leftWeeks = 0;
		int leftDays = DAYS_OF_THE_YEAR - numberOfDays();

		leftWeeks = leftDays / DAYS_OF_THE_WEEK;

		return leftWeeks;
	}



	public String needsVaccine()
	{
		String msg = "";
		int year = bd.getYear()+1;

		if (calculateAge() >= 1)
		{
			msg += "No necesita ser vacunado \n"; 
			msg += "El canguro fue vacunado en: "+bd.getDay()+"/"+bd.getMonth()+"/"+year;
		} else 
		{	
			msg += "Necesita ser vacunado en: "+leftWeeks()+" semanas, y "+leftDays()+" dias";
		}
		return msg;
	}

	public String vaccination()
	{
		String msg ="";
		int year = bd.getYear()+1;		

		msg += "El canguro "+name+" necesitara ser vacunado la fecha: "+bd.getDay()+"/"+bd.getMonth()+"/"+year+"\n";

		return msg;
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
			msg += "El nombre de este canguro empieza y termina en vocal\n";	
		}else
		{	
			msg += "El nombre de este canguro no empieza y termina en vocal\n";
		}

		return msg;
	}
	
	public String showKangaroo()
	{
		String msg = "\n";
		
		msg += "El nombre del canguro es: "+name+"\n";
		msg += "Pesa: "+weight+"Kg. \n";
		msg += "Mide: "+height+"m. \n";
		msg += "Su genero es: "+gender+"\n";
		msg += "Su tipo de sangre es: "+blood+"\n";
		msg += "Tiene un imc de: "+calculateBmi()+"\n";
		msg += "Su riesgo cardiaco es: "+calculateHR()+"\n";
		msg += bd.showBorn()+"\n";
		msg += "El canguro "+needsVaccine()+"\n";
		if(calculateAge() < 1)
			msg += "El canguro nacio hace menos de un anio\n";
		else
			msg += "El canguro tiene "+calculateAge()+" anios\n";
		msg += showVowels();
		
		return msg;
	}
}