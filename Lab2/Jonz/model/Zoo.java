package model;
//Jhon Stiven Arboleda Gallego

	public class Zoo{

//Attributes

	private String name;
	
//Relations

	private KangarooZone zone1;
	private DragonZone zone2;
	
//builder method

	public Zoo (String theName, KangarooZone kangaZone, DragonZone zoneDra){
		name = theName;
		zone1 = kangaZone;
		zone2 = zoneDra;
	}
	
//Methods Setters and Getters

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public KangarooZone getKangarooZone(){
		return zone1;
	}
	public void setKangarooZone(KangarooZone zone1){
		this.zone1 = zone1;
	}
	public void setDragonZone(DragonZone zone2){
		this.zone2 = zone2;
	}
	public DragonZone getDragonZone(){
		return zone2;
	}
	public String showKangaroo(){
		
		String message = "";
		
		message += zone1.showKangaroo() + "\n";
		
		return message;
	}
	public String addKangaroo(Kangaroo agregar , int num) {
		
		String message = "";
		
		message += zone1.addKangaroo(agregar, num);
		
		return message;
	}
	public String showEnvironment(){
		
		String message = "";
		
		message += zone1.showEnvironment();
		
		return message;
	}
	public String showZone(){
		
	String message = "";
	
	message += zone1.showZone();
	
	return message;
		
	}
}		