package model;

public class DateK
{
	//Atributes
	
	private int day;
	private int month;
	private int year;
	
	//Methods
	
	public DateK(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String showBorn()
	{
		String msg = "";
		msg += "La fecha de nacimiento del canguro es: "+day+"/"+month+"/"+year+"\n";
		
		return msg;
	}
}