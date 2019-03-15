package model;
//Jhon Stiven Arboleda Gallego

	public class Date{

//attributes

	private int day;
	private int month;
	private int year;

// builder method

	public Date (int theDay, int theMonth, int theYear){
		day = theDay;
		month = theMonth;
		year = theYear;
	}
 
//getters y setters 

	public int getDay () {
		return day;
	}
	public void setDay (int theDay){
		day = theDay;
	}
	public int getMonth () {
		return month;
	}
	public void setMonth (int theMonth){
		month = theMonth;
	}
	public int getYear () {
		return year;
	}
	public void setYear (int theYear){
		year = theYear;
	}
	
	public String showDate (){
		
		return ""+day+"/"+month+"/"+year;
	}
}
