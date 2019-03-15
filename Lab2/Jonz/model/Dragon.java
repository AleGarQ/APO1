package model;
//Jhon Stiven Arboleda Gallego

public class Dragon {
	
//Attributes

	public String name;
	public double height;
	public double weight;
	public double foodVariety;
	public String bloodType;

//builder method

public Dragon (String theName, double theHeight, double theWeight, double theFoodVariety, String theBloodType){
	
	name = theName;
	height = theHeight;
	weight = theWeight;
	foodVariety = theFoodVariety;
	bloodType = theBloodType;
}
	
//methods getters and setters

	public String getName (){
		return name;
	}
	public void setName(String theName){
		name = theName;
	}
	public double getHeight (){
		return height;
	}
	public void setHeight (double theHeight){
		height = theHeight;
	}
	public double getWeight () {
		return weight;
	}
	public void setWeight (double theWeight) {
		weight = theWeight;
	}
	public double getFoodVariety (){
		return foodVariety;
	}
	public void setFoodVariety (double theFoodVariety){
		foodVariety = theFoodVariety;
	}
	public String getBloodType (){
		return bloodType;
	}
	public void setBloodType(String theBloodType){
		bloodType = theBloodType;
	}
	public double calculateBmiDragon(){
		return weight/(height*height);
	}
}