package model;

public class KangarooZone{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------

	//relations

	//--------------------------------------------------------------------------------------------------

	private KangarooEnviroment ke1;

	private KangarooEnviroment ke2;

	private KangarooEnviroment ke3;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.
	public KangarooZone(double newTotalArea, KangarooEnviroment newKe1, KangarooEnviroment newKe2, KangarooEnviroment newKe3) {

		totalArea = newTotalArea;

		ke1       = newKe1;

		ke2       = newKe2;

		ke3       = newKe3;

	}

//this method helps us to get the value of the relation ke1.
	public KangarooEnviroment getKe1(){

		return ke1;

	}
//this method helps us to assign an initial value to the attribute ke1.
	public void setKe1(KangarooEnviroment newKe1){

		ke1 = newKe1;
	
	}
//this method helps us to get the value of the relation ke2.
	public KangarooEnviroment getKe2(){

		return ke2;

	}
//this method helps us to assign an initial value to the attribute ke2.
	public void setKe2(KangarooEnviroment newKe2){

		ke2 = newKe2;
		
	}
//this method helps us to get the value of the relation ke3.
	public KangarooEnviroment getKe3(){

		return ke3;

	}
//this method helps us to assign an initial value to the attribute ke3.
	public void setKe3(KangarooEnviroment newKe3){

		ke3 = newKe3;
		
	}

	public double calculateTotalArea(){

		return ke1.calculateEnviromentArea() + ke2.calculateEnviromentArea() + ke3.calculateEnviromentArea();

	}

	public String toString(){

		String  msg = "";

		msg = msg + "The total area in the kangaroos zone is:       " + calculateTotalArea() + "m².\n";
		
		//msg += calculateMoreVowels();
		
		msg = msg + "\nThis is the first enviroment:\n";

		msg = msg + "The area of this enviroment is: " + ke1.getEnviromentArea() + ".\n";

		msg = msg + ke1.toString();

		msg = msg + "\nThis is the second enviroment:\n";

		msg = msg + "The area of this enviroment is: " + ke2.getEnviromentArea() + ".";

		msg = msg + ke2.toString();

		msg = msg + "\nThis is the third enviroment:\n";

		msg = msg + "The area of this enviroment is: " + ke3.getEnviromentArea() + ".";

		msg = msg + ke3.toString();

		

		return msg;

	}

	public String selectKangaroo(enviroment1, kang){

		String msg = "";

		if(enviroment1==1) {
			
			   msg += ke1.addKangaroo(newKang);
		
		   } else if(enviroment1==2) {
		
			   msg += ke2.addKangaroo(newKang);
		
		   }else if(enviroment1==3) {
		
			   msg += ke3.addKangaroo(newKang);
		
		   }else {
		
			   msg = "Only numbers between 1 and 3";
		
		   }

		return msg;

	}

	public String addKangaroo(Kangaroo newKang, int enviroment1){

		String msg = "";
		   
		   if(enviroment1==1) {
			
			   msg += ke1.addKangaroo(newKang);
		
		   } else if(enviroment1==2) {
		
			   msg += ke2.addKangaroo(newKang);
		
		   }else if(enviroment1==3) {
		
			   msg += ke3.addKangaroo(newKang);
		
		   }else {
		
			   msg = "Only numbers between 1 and 3";
		
		   }
		   
		   
		   return msg;


	}

	public String removeKangaroo(int kang, int enviroment1){

		String msg = "";


		   if(enviroment1==1) {
			
			   msg += ke1.removeKangaroo(kang);
		
		   } else if(enviroment1==2) {
		
			   msg += ke2.removeKangaroo(kang);
		
		   }else if(enviroment1==3) {
		
			   msg += ke3.removeKangaroo(kang);
		
		   }else {
		
			   msg = "Only numbers between 1 and 3";
		
		   }
		   
		   
		   return msg;


	}

	public String whoVowels(){

		String msg = "";

		msg += ke1.whoVowel();

		msg += ke2.whoVowel();

		msg += ke3.whoVowel();

		return msg;
		
	}

	public String vaccination(){

		String msg = "";

		msg += ke1.vaccination();

		msg += ke2.vaccination();

		msg += ke3.vaccination();

		return msg;

	}


}