package model;
//Jhon Stiven Arboleda Gallego
	public class KangarooEnvironment{

// Attributes

	private double size;

//relations

	private Kangaroo kangaroo1;
	private Kangaroo kangaroo2;
	private Kangaroo kangaroo3;
	
//builder method

	
	public KangarooEnvironment (Kangaroo kangaroo1, Kangaroo kangaroo2, Kangaroo kangaroo3){
		this.kangaroo1 = kangaroo1;
		this.kangaroo2 = kangaroo2;
		this.kangaroo3 = kangaroo3;
		calculateSize();
	}

// methods getters y setters

	public double getSize (){
		return size;
	}
	public void setSize (double theSize){
		size = theSize;
	}
	public Kangaroo getKangaroo1 (){
		return kangaroo1;
	}
	public void setKangaroo1 (Kangaroo kangaroo1){
		this.kangaroo1 = kangaroo1;
	}
	public Kangaroo getKangaroo2 (){
		return kangaroo1;
	}
	public void setKangaroo2 (Kangaroo kangaroo2){
		this.kangaroo2 = kangaroo2;
	}
	public Kangaroo getKangaroo3 (){
		return kangaroo3;
	}
	public void setKangaroo3 (Kangaroo kangaroo3){
		this.kangaroo3 = kangaroo3;
	}
	
	//calcular area de canguro
	public double calculateArea (double size){
		
		size = (kangaroo1.getHeight() * 8);
		
		if (kangaroo2 != null){
			size += kangaroo2.getHeight()* 8;
		}
		if (kangaroo3 != null){
			size += kangaroo3.getHeight()* 8;
		}
		return size;
	}
	
	public double waterLiters(){
		
		double water = 0.0;
		if (kangaroo1 != null){
		water = (kangaroo1.calculateBmi() * 1.5);
		}
		if (kangaroo2 != null){
			water += (kangaroo2.calculateBmi() * 1.5);
		}
		if (kangaroo3 != null){
			water += (kangaroo3.calculateBmi() * 1.5);
		}
		return water;
	}
	public String showKangaroo(){
		
		String message = "";
		
		if (kangaroo1 != null){
		message += kangaroo1.showKangaroo()+"\n";
		}
		if (kangaroo2 != null){
		message += kangaroo2.showKangaroo()+"\n";
		}
		if (kangaroo3 != null){
		message += kangaroo3.showKangaroo()+"\n";
		}
		return message;
	}
	public double calculateSize (){
		
		if(kangaroo1 != null){
			size +=(kangaroo1.getHeight()*8);
		}
		if(kangaroo2 !=null){
			size +=(kangaroo2.getHeight()*8);
		}
		if (kangaroo3 != null){
			size +=(kangaroo3.getHeight()*8);
		}
		return size;
	}
	
	public String addKangaroo(Kangaroo agregar) {
		String message = "";
		
		if(kangaroo1==null || kangaroo2== null || kangaroo3 ==null) {
		}
			if(agregar.getGender().equals(Kangaroo.MALE)){
			}
				if(maleFull()) {
					message += "No se pudo agregar porque el ambiente ya tiene un canguro macho.";
				}		
			else if(kangaroo1==null) {
				kangaroo1 = agregar;
				message += "Se pudo agregar el canguro";
			}
			else if (kangaroo2==null) {
				kangaroo2 = agregar;
				message += "Se pudo agregar el canguro";
			}
			else if (kangaroo3 == null) {
				kangaroo3 = agregar;
				message += "Se pudo agregar el canguro";
			}
			
		else {
			message += "No se pudo agregar porque el ambiente esta lleno.";
		}
		
		return message;
	}
	
	public boolean maleFull() {
		boolean lleno = false;
		
		if(kangaroo1!=null && kangaroo1.getGender().equals(Kangaroo.MALE)) {
			lleno = true;
		}
		if(kangaroo2!=null && kangaroo2.getGender().equals(Kangaroo.MALE)) {
			lleno = true;
		}
		if(kangaroo3!=null && kangaroo3.getGender().equals(Kangaroo.MALE)) {
			lleno = true;
		}
		return lleno;
	}
	
	public String showEnvironment(){
		
		String message = "------------------------------------------------------" +"\n"; 
		
		message += "El tamanio del ambiente de acuerdo a sus canguros es de: "+calculateSize()+"\n";
		message += "El agua que necesita el ambiente de acuerdo a sus canguros es: "+waterLiters()+"\n";
		
		return message;
	}
}
	


