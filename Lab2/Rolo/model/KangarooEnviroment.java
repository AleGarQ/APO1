package model;

public class KangarooEnviroment{

	//--------------------------------------------------------------------------------------------------

	//Constants

	//--------------------------------------------------------------------------------------------------

	public final static int MULT_AREA = 8;

	public final static double MULT_WATER_K = 1.5;

	public final static double MULT_FOOD_LOW = 0.8;

	public final static double MULT_FOOD_MED = 1.1;

	public final static int FOOD_LOW_WEIGHT = 30;

	public final static int FOOD_MED_WEIGHT = 48;

	public final static int FAC_FOOD_HIG = 40;

	public final static int SUBT_FOOD_HIG = 48;

	public final static double MULT_FOOD_HIG = 0.4;

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

																	
	//--------------------------------------------------------------------------------------------------

	//relations

	//--------------------------------------------------------------------------------------------------

	private Kangaroo kangaroo1;

	private Kangaroo kangaroo2;

	private Kangaroo kangaroo3;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.
	public KangarooEnviroment(Kangaroo newKangaroo1, Kangaroo newKangaroo2, Kangaroo newKangaroo3) {
		
		

		kangaroo1 = newKangaroo1;

		kangaroo2 = newKangaroo2;

		kangaroo3 = newKangaroo3;

	}

	public double calculateArea1(){

		if(kangaroo1 != null){

			return kangaroo1.getHeight() * MULT_AREA;

		}

		return 0;

	}

	public double calculateArea2(){	

		if(kangaroo2 != null){

			return kangaroo2.getHeight() * MULT_AREA;

		}

		return 0;

	}

	public double calculateArea3(){

		double x = 0;	

		if(kangaroo3 != null){

			x = kangaroo3.getHeight() * MULT_AREA;

		}
		return x;

	}

	public double calculateEnviromentArea(){

		return (calculateArea1() + calculateArea2() + calculateArea3());

	}

	  

// here, I'm calculating how many food the kangaroo needs
	public double calculateFood1(){

		if (kangaroo1.getWeight() <= FOOD_LOW_WEIGHT){

			food1 = (kangaroo1.getWeight() * MULT_FOOD_LOW);

		}else if(kangaroo1.getWeight() <= FOOD_MED_WEIGHT){

			food1 = (kangaroo1.getWeight() * MULT_FOOD_MED);

		}else{

			food1 = (FAC_FOOD_HIG + (MULT_FOOD_HIG * (kangaroo1.getWeight() - SUBT_FOOD_HIG)));
		}

		return food1;

	}//return (kangaroo1.getWeight() <= 30) ? (kangaroo1.getWeight() * 80)/100 : (kangaroo1.getWeight() <= 48 ? kangaroo1.getWeight() * 1.1 : 40 + kangaroo1.getWeight() * 0.4);
// here, I'm calculating how many food the kangaroo needs
	public double calculateFood2(){

		if (kangaroo2.getWeight() <= FOOD_LOW_WEIGHT){

			food2 = (kangaroo2.getWeight() * MULT_FOOD_LOW);

		}else if(kangaroo2.getWeight() <= FOOD_MED_WEIGHT){

			food2 = (kangaroo2.getWeight() * MULT_FOOD_MED);

		}else{

			food2 = (FAC_FOOD_HIG + (MULT_FOOD_HIG * (kangaroo2.getWeight() - SUBT_FOOD_HIG)));

		}

		return food2;

	}

// here, I'm calculating how many food the kangaroo needs
	public double calculateFood3(){

		if (kangaroo3.getWeight() <= FOOD_LOW_WEIGHT){

			food3 = (kangaroo3.getWeight() * MULT_FOOD_LOW);

		}else if(kangaroo3.getWeight() <= FOOD_MED_WEIGHT){

			food3 = (kangaroo3.getWeight() * MULT_FOOD_MED);

		}else{

			food3 = (FAC_FOOD_HIG + (MULT_FOOD_HIG * (kangaroo3.getWeight() - SUBT_FOOD_HIG)));

		}

		return food3;

	}
//this method helps us to get the value of the relation kangaroo1.
	public Kangaroo getKangaroo1(){

		return kangaroo1;

	}
//this method helps us to assign an initial value to the relation kangaroo1.
	public void setKangaroo1(Kangaroo newKangaroo1){

		kangaroo1 = newKangaroo1;

	}
//this method helps us to get the value of the relation kangaroo2.
	public Kangaroo getKangaroo2(){
		return kangaroo2;

	}
//this method helps us to assign an initial value to the relation kangaroo2.
	public void setKangaroo2(Kangaroo newKangaroo2){

		kangaroo2 = newKangaroo2;
		
	}
//this method helps us to get the value of the relation kangaroo3.
	public Kangaroo getKangaroo3(){

		return kangaroo3;

	}
//this method helps us to assign an initial value to the relation kangaroo3.
	public void setKangaroo3(Kangaroo newKangaroo3){

		kangaroo3 = newKangaroo3;
		
	}
//
	/*public int getVowels1(){

		return kangaroo1.vowels();

	}

	public int getVowels2(){

		return kangaroo2.vowels();

	}

	
	 	
     public int getVowels3(){

     	if (kangaroo3!=null) {     		

		return kangaroo3.vowels();

		}else

		return 0;
	
	}*/
//
	public String toString(){

		String msg = "";
		
		msg += "\n" + males() + "\n" ;
		
		msg = msg + "\n \nThe first kangaroo of this enviroment:\n \n" + kangaroo1.toString();

		msg = msg + "|The amount of food that the animal needs is:                 " + calculateFood1() + "kg.\n";
		
		msg = msg + "|The amount of water that the animal needs is:                " + calculateWater1() + "l.\n";	

		msg += "|______________________________________________________________________________________________________________________________________________________________________________\n" ;
			
		msg = msg + "\n \nThe second kangaroo of this enviroment:\n \n" + kangaroo2.toString();

		msg = msg + "|The amount of food that the animal needs is:                 " + calculateFood2() + "kg.\n";

		msg = msg + "|The amount of water that the animal needs is:                " + calculateWater2() + "l.\n";

		msg +=      "|______________________________________________________________________________________________________________________________________________________________________________\n" ;

		if(kangaroo3 != null){

			msg = msg + "\n \nThe third kangaroo of this enviroment:\n \n" + kangaroo3.toString();

			msg = msg + "|The amount of food that the animal needs is:              " + calculateFood3() + "kg.\n";

			msg = msg + "|The amount of water that the animal needs is:             " + calculateWater3() + "l.\n";

			msg += "|_____________________________________________________________________________________________________________________________________________________________________________\n" ;

		}

		return msg; 

	}

	public boolean moreMales() {

		boolean more = false;
		
		if(kangaroo1!=null && kangaroo1.getSex().equals(Kangaroo.MALE)) {

			more = true;
		}
		
		if(kangaroo2!=null && kangaroo2.getSex().equals(Kangaroo.MALE)) {

			more = true;
		}
		
		if(kangaroo3!=null && kangaroo3.getSex().equals(Kangaroo.MALE)) {

			more = true;
		}
		
		return more;

	}

	public String males(){

		String msg = "";

		if (moreMales()) {

			msg += "There is only one male kangaroo in this enviroment.";
			
		}else {

			msg += "there isn't male kangaroos in this enviroment.";
			
		}

		return msg;
		
	}

	public String selectKangaroo(kang){

		String msg = "";
		
		if(kangaroo1==null || kangaroo2== null || kangaroo3 ==null) {
			
		  if (kang == 1) {
			
			if(kangaroo1.getSex().equals(Kangaroo.MALE)) {
				
				if(moreMales()) {
					
					msg += "There is a male in this zone.";
			
				}		
		  
			}

		  }

		  if (kang == 2) {
			
			if(kangaroo2.getSex().equals(Kangaroo.MALE)) {
				
				if(moreMales()) {
					
					msg += "There is a male in this zone.";
			
				}		
		  
			}

		  }

		  if (kang == 3) {
			
			if(kangaroo3.getSex().equals(Kangaroo.MALE)) {
				
				if(moreMales()) {
					
					msg += "There is a male in this zone.";
			
				}		
		  
			}

		  } 
			
			if(kangaroo1==null) {
			
				kangaroo1 = AAAAAAA;
			
				msg += "The kangaroo is added like first kangaroo";
			
			}else if (kangaroo2==null) {
			
				kangaroo2 = AAAAAAA;
			
				msg += "The kangaroo is added like second kangaroo";

			}else if (kangaroo3 == null) {
			
				kangaroo3 = AAAAAAA;
			
				msg += "The kangaroo is added like third kangaroo";

			}
			
		}else {
		
			msg += "This enviroment is full.";
		
		}
		
		return msg;

	}

	public 

	public String addKangaroo(Kangaroo newKang) {

		String msg = "";
		
		if(kangaroo1==null || kangaroo2== null || kangaroo3 ==null) {
			
			if(newKang.getSex().equals(Kangaroo.MALE)) {
				
				if(moreMales()) {
			
					msg += "There is a male in this zone.";
			
				}		
			
			} 
			
			if(kangaroo1==null) {
			
				kangaroo1 = newKang;
			
				msg += "The kangaroo is added like first kangaroo";
			
			}else if (kangaroo2==null) {
			
				kangaroo2 = newKang;
			
				msg += "The kangaroo is added like second kangaroo";

			}else if (kangaroo3 == null) {
			
				kangaroo3 = newKang;
			
				msg += "The kangaroo is added like third kangaroo";

			}
			
		}else {
		
			msg += "This enviroment is full.";
		
		}
		
		return msg;

	}

	public String removeKangaroo(int kang){

		String msg = "";
		   
		   if(kang==1) {
			
				if (kangaroo1 != null) {
			   	
					kangaroo1 = null;

					msg = "The kangaroo has been eliminated";

				}else {

					msg = "This kangaroo doesn't exist";					
			   	
			   }
		
		   } else if(kang==2) {
				
				if (kangaroo1 != null) {
			   	
					kangaroo1 = null;

					msg = "The kangaroo has been eliminated";

				}else {

					msg = "This kangaroo doesn't exist";
					
				}
			   
		
		   }else if(kang==3) {
		
			   if (kangaroo1 != null) {
			   	
					kangaroo1 = null;

					msg = "The kangaroo has been eliminated";

				} else {

					msg = "This kangaroo doesn't exist";
										
				}
		
		   }else {
		
			   msg = "Only numbers between 1 and 3";
		
		   }
		   
		   
		   return msg;


	}
	

	public String whoVowel(){

		String msg = "";

		if (kangaroo1 != null) {
		
				msg += kangaroo1.whoVowel();

		}

		if (kangaroo2 != null) {
		
				msg += kangaroo2.whoVowel();

		}

		if (kangaroo3 != null) {
		
				msg += kangaroo3.whoVowel();

		}

		return msg;

	}

	public String vaccination(){

		String msg = "";

		if (kangaroo1 != null) {
		
				msg += kangaroo1.vaccination();

		}

		if (kangaroo2 != null) {
		
				msg += kangaroo2.vaccination();

		}

		if (kangaroo3 != null) {
		
				msg += kangaroo3.vaccination();

		}

		return msg;

	}

}
