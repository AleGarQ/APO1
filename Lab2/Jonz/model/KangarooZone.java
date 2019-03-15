package model;
//Jhon Stiven Arboleda Gallego

public class KangarooZone{

//Attributes

	private double humidity;
	private double temperature;
	private double filtration;
	private double waterLiters;

// Relations

	private KangarooEnvironment environment1;
	private KangarooEnvironment environment2;
	private KangarooEnvironment environment3;

//builder method

	public KangarooZone (double theHumidity, double theTemperature, double theFiltration, double theWaterLiters, KangarooEnvironment environment1, KangarooEnvironment environment2, KangarooEnvironment environment3) {
	
		humidity = theHumidity;
		temperature = theTemperature;
		filtration = theFiltration;
		waterLiters = theWaterLiters;
		this.environment1 = environment1;
		this.environment2 = environment2;
		this.environment3 = environment3;
	}

// metodos getters y setters 

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
	public KangarooEnvironment getEnvironment1 (){
		return environment1;
	}
	public void setEnvironment1 (KangarooEnvironment environment1){
		this.environment1 = environment1;
	}
	public KangarooEnvironment getEnvironment2 (){
		return environment2;
	}
	public void setEnvironment2 (KangarooEnvironment environment2){
		this.environment2 = environment2;
	}
	public KangarooEnvironment getEnvironment3 (){
		return environment3;
	}
	public void setEnvironment3 (KangarooEnvironment environment3){
		this.environment3 = environment3;
	}
	public double calculateWatersKangaroo(){
		waterLiters = environment1.waterLiters()+environment2.waterLiters()+environment1.waterLiters();
		return waterLiters;
	}
	
	//Metodo de vocales
	
	
	public String showKangaroo(){
		
		String message = " ";
		message += "Los canguros del ambiente 1 son:\n";
		message += environment1.showKangaroo()+"\n";
		message += "Los canguros del ambiente 2 son:\n";
		message += environment2.showKangaroo()+"\n";
		message += "Los canguros del ambiente 3 son:\n";
		message += environment3.showKangaroo()+"\n";
		
		return message;
	}	
	public String addKangaroo(Kangaroo agregar, int numero) {
		   
		   String message = "";
		   
		   if(numero==1) {
			   message += environment1.addKangaroo(agregar);
		   } else if(numero==2) {
			   message += environment2.addKangaroo(agregar);
		   }else if(numero==3) {
			   message += environment3.addKangaroo(agregar);
		   }else {
			   message = "Digite un ambiente valido";
		   }
		   return message;
	   }
	  public String showEnvironment(){
		  
		  String message = " ";
		  message += environment1.showEnvironment()+"\n";
		  message += environment2.showEnvironment()+"\n";
		  message += environment3.showEnvironment()+"\n";
		  
		  return message;
	  }
	  public String showZone(){
		  
		  String message = "";
		  message += "Esta zona contiene 3 ambientes, donde cada ambiente tiene los siguientes canguros: \n";
		  message += "";
		  if (environment1.getKangaroo1() != null){
		  message += environment1.getKangaroo1().getName()+"\n";
		  }
		  if (environment1.getKangaroo2() != null){
		  message += environment1.getKangaroo2().getName()+"\n";
		  }
		  if (environment1.getKangaroo3() != null){
		  message += environment1.getKangaroo3().getName()+"\n";
		  }
		  if (environment2.getKangaroo1() != null){
		  message += environment2.getKangaroo1().getName()+"\n";
		  }
		  if (environment2.getKangaroo2() != null){
		  message += environment2.getKangaroo2().getName()+"\n";
		  }
		  if (environment2.getKangaroo3() != null){
		  message += environment2.getKangaroo3().getName()+"\n";
		  }
		  if (environment3.getKangaroo1() != null){
		  message += environment3.getKangaroo1().getName()+"\n";
		  }
		  if (environment3.getKangaroo2() != null){
		  message += environment3.getKangaroo2().getName()+"\n";
		  }
		  if (environment3.getKangaroo3() != null){
		  message += environment3.getKangaroo3().getName()+"\n";
		  }
		  return message;
		}
	}
