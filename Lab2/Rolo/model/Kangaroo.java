package model;

import java.time.*;

import java.util.*;

import java.time.temporal.ChronoUnit;

public class Kangaroo{
	//--------------------------------------------------------------------------------------------------

	//Constants

	//--------------------------------------------------------------------------------------------------

	public final static String A = "a";

	public final static String B = "b";

	public final static String AB = "ab";

	public final static String O = "o";

	public final static String MALE = "Male";

	public final static String FEMALE = "Female";

	public final static String LOW = "low risk";

	public final static String MEDIUM = "medium risk";

	public final static String HIGH = "high risk";

	public final static int DAYS_OF_THE_YEAR = 365;

	public final static int DAYS_OF_THE_WEEK = 7;

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private String name;		// this would be the name of the kangaroo.
	
	private double weight;  		// this would be the weight of the kangaroo.

	private double height;      // this would be the weight of the kangaroo.

	private String sex; 		// this would say if the kangaroo is male or female.

	private String bloodType;   // this would be the kind of blood that the kangaroo has.

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	private DateK birth;			// this would be the birthday of th kangaroo

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.
	public Kangaroo(String newName, double newWeight, double newHeight, String newSex, String newBloodType, DateK newBirth){
		
		name      = newName;
		
		weight    = newWeight;

		height    = newHeight;

		sex       = newSex;

		bloodType = newBloodType;		

		birth     = newBirth;

	}
//this method helps us to get the value of the attribute name.
	public String getName(){

		return name;

	}
//this method helps us to assign an initial value to the attribute name.
	public void setName(String newName){

		name = newName;

	}

	public boolean vowel(){

		boolean vowel = false;

		int x = 0, x1 = name.length()-1;

		if ((name.charAt(x)=='a') || (name.charAt(x)=='e') || (name.charAt(x)=='i') || (name.charAt(x)=='o') || (name.charAt(x)=='u' || name.charAt(x)=='A') || (name.charAt(x)=='E') || (name.charAt(x)=='I') || (name.charAt(x)=='O') || (name.charAt(x)=='U')) {
			
			x = x1;
			
			if ((name.charAt(x)=='a') || (name.charAt(x)=='e') || (name.charAt(x)=='i') || (name.charAt(x)=='o') || (name.charAt(x)=='u' || name.charAt(x)=='A') || (name.charAt(x)=='E') || (name.charAt(x)=='I') || (name.charAt(x)=='O') || (name.charAt(x)=='U')) {

				vowel = true;
				
			}
		}

		return vowel;

	}

	public String whoVowel(){

		String msg = "";

		if (vowel()) {
			
			msg += name + ".\n";

		}

		return msg;

	}

	public String vowels(){

		String msg = "";

		if (vowel()) {

			msg += "|The name of this kangaroo starts and ends with vowels\n";
			
		}else {
			
			msg += "|The name of this kangaroo doesn't start and end with vowels\n";

		}

		return msg;
	}

	/*public int vowels(){

		int count = 0;


		for(int x=0;x< name.length();x++) {

			if ((name.charAt(x)=='a') || (name.charAt(x)=='e') || (name.charAt(x)=='i') || (name.charAt(x)=='o') || (name.charAt(x)=='u' || name.charAt(x)=='A') || (name.charAt(x)=='E') || (name.charAt(x)=='I') || (name.charAt(x)=='O') || (name.charAt(x)=='U')){

				count++;
				
			}
			
		}

		return count;

	}*/
//this method helps us to get the value of the attribute height.
	public double getHeight(){

		return height;

	}
//this method helps us to assign an initial value to the attribute height.
	public void setHeight(double newHeight){

		height = newHeight;

	}
//this method helps us to get the value of the attribute weight.
	public double getWeight(){

		return weight;

	}
//this method helps us to assign an initial value to the attribute weight.
	public void setWeight(double newWeight){

		weight = newWeight;

	}
//this method helps us to get the value of the attribute sex.
	public String getSex(){

		return sex;

	}
//this method helps us to assign an initial value to the attribute sex.
	public void setSex(String newSex){

		sex = newSex;

	}

//here, the operation of the ibm is declared
	public double calculateBmi(){

		return (weight / (height*height));

	}

// here, I'm calculating when the kangaroo has a heart risk
	public String calculateHeartRisk(){

		String heartRisk = "";
 
		if (calculateBmi() <= 18){

			if (bloodType == AB || "a"){

				heartRisk = LOW;

			}else{

				heartRisk = MEDIUM;

			}else{

				heartRisk = MEDIUM;

			}
			
		}else if(calculateBmi() <= 25 ){

				heartRisk = LOW;

		}else if(bloodType == AB){

			heartRisk = LOW;

		}else{

			heartRisk = HIGH;

		}

		return heartRisk;

	}//(bmi <= 18 ? (bloodType == ab ?  ("low risk" : "medium risk") : (bloodType == a ? "low risk" : "medium risk") : (bmi <=25 ? "low risk" : bloodType == "ab" ? "low risk" : "high risk"));


//this method helps us to get the value of the relation birth.
	public DateK getBirth(){

		return birth;

	}
//this method helps us to assign an initial value to the the relation birth.
	public void setBirth(DateK newBirth){

		birth = newBirth;

	}
//CALCULATEAGE
	public long calculateAge(){

	LocalDate start = LocalDate.of(birth.getYear(), birth.getMonth(), birth.getDay());

	LocalDate end = LocalDate.now();

	long years = ChronoUnit.YEARS.between(start, end);

		return years;
	}



	public int numberOfDays() {

		GregorianCalendar date = new GregorianCalendar(birth.getYear(), birth.getMonth() - 1, birth.getDay());

		int cont = 0;
		
		GregorianCalendar acutualDate = new GregorianCalendar();
		
		
		
			if ((date.get(Calendar.DAY_OF_MONTH) == acutualDate.get(Calendar.DAY_OF_MONTH))
		
					&& (date.get(Calendar.MONTH) == acutualDate.get(Calendar.MONTH))
		
					&& (date.get(Calendar.YEAR) == acutualDate.get(Calendar.YEAR))){
		
				
		
			
		
			date.add(Calendar.DAY_OF_MONTH, 1);
		
			cont++;
		
		}
		
		return cont;
	}

	public int leftWeeks(){

		int leftWeeks = 0;

		int leftDays = DAYS_OF_THE_YEAR - numberOfDays();

		leftWeeks = leftDays / DAYS_OF_THE_WEEK;

		return leftWeeks;

	}

	public int leftDays(){

		int days = 0;

		int leftDays = DAYS_OF_THE_YEAR - numberOfDays();

		days = leftDays % DAYS_OF_THE_WEEK;

		return days;

	}

	public String needsVaccine(){

		String msg = "";

		int year = birth.getYear()+1;

		if (calculateAge() >= 1){

			msg += "doesn't need to be vaccinated.\n"; 

			msg += "|The animal was vaccinated in                                 " + birth.getDay() + "/" + birth.getMonth() + "/" + year ;

			
		} else {
			
			msg += "needs to be vaccinated in " + leftWeeks() + " weeks, and in " + leftDays() + "days.";

		}

		return msg;

	}

	public String vaccination(){

		String msg ="";

		int year = birth.getYear()+1;		

		msg += "The vaccination date of this kangaroo is: " + birth.getDay() + "/" + birth.getMonth() + "/" + year +"\n" ;

		return msg;
	}

	public String toString(){

		String msg = "";

		msg +=      "_______________________________________________________________________________________________________________________________________________________________________________\n" ;
	
		msg = msg + "|The name of the animal is:                                   " + name + "\n";

		msg = msg + "|The height of te animal is:                                  " + height + "m.\n";

		msg = msg + "|The weight of the animal is:                                 " + weight + "kg.\n";

		msg = msg + "|The sex of the animal is:                                    " + sex + ".\n";

		msg = msg + "|The blood Type of the animal is:                             " + bloodType + ".\n";

		msg = msg + "|The body mass index of the animal is:                        " + calculateBmi() + "kg/m².\n";
	
		msg = msg + "|" + birth.toString();
	
		msg = msg + "|The animal " + needsVaccine() + "\n" ;
		
		if (calculateAge() < 1) {

			msg += "|The animal is less than a year old \n";
			
		}else {

			msg += "|The animal is " + calculateAge() + " years old\n";
		
		}

		msg += vowels();

		
		msg = msg + "|The animal has a " + calculateHeartRisk() + " to have a heart disease.\n";
		
		return msg;

	}

}
