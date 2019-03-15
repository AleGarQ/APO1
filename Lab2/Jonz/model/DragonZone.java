package model;
//Jhon Stiven Arboleda Gallego

	public class DragonZone {

//Attributes

	private double heatSource;
	private double humidity;
	private double temperature;
	private double filtration;
	private double waterLiters;

//relations

	private Dragon dragon1;
	private Dragon dragon2;

//builder method

	public DragonZone (double theHeatSource, double theHumidity, double theTemperature, double theFiltration, double theWaterLiters, Dragon dragoncito, Dragon dragoncita) {
	
		heatSource = theHeatSource;
		humidity = theHeatSource;
		temperature = theTemperature;
		filtration = theFiltration;
		waterLiters = theWaterLiters;
		dragon1 = dragoncito;
		dragon2 = dragoncita;
	}

// methods getters y setters

	public double getHeatsource (){
		return heatSource;
	}
	public void setHeatsource (double theHeatSource){
		heatSource = theHeatSource;
	}
	public double getHumidity (){
		return humidity;
	}
	public void setHumidity (double theHumidity){
		humidity = theHumidity;
	}
	public double getTemperature (){
		return temperature;
	}
	public void setTemperature (double theTemperature){
		temperature = theTemperature;
	}
	public double getFiltration (){
		return filtration;
	}
	public void setFiltration (double theFiltration){
		filtration = theFiltration;
	}
	public double getWaterLiters (){
		return waterLiters;
	}
	public void setWaterLiters (double theWaterLiters){
		waterLiters = theWaterLiters;
	}
	public double calculateWaters (double waterLiters){
		waterLiters=((dragon1.calculateBmiDragon() * 0.75) + (dragon2.calculateBmiDragon() * 0.75));
		return waterLiters;
	}
	
	//comida a dragones: true necesitan comida
	
	public boolean FoodAlert(){
		boolean alert = false;
		
		if (dragon1.getFoodVariety() < 5.0 && dragon2.getFoodVariety() < 5.0){
			alert = true;
		}
		
		return alert;
	}
		
}


