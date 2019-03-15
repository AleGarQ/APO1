package model;

public class KangarooE
{	
	//Relations
	
	private Kangaroo k1;
	private Kangaroo k2;
	private Kangaroo k3;

	//Constants

	public final static String MALE = "Masculino";
	public final static String FEMALE = "Femenino";
	public final static int MULT_AREA = 8;
	public final static double MULT_WATER_K = 1.5;
	public final static double MULT_FOOD_LOW = 0.8;
	public final static double MULT_FOOD_MED = 1.1;
	public final static int FOOD_LOW_WEIGHT = 30;
	public final static int FOOD_MED_WEIGHT = 48;
	public final static int FAC_FOOD_HIG = 40;
	public final static int SUBT_FOOD_HIG = 48;
	public final static double MULT_FOOD_HIG = 0.4;
	
	//Methods
	
	public KangarooE(Kangaroo k1, Kangaroo k2, Kangaroo k3)
	{
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
	}
	
	public Kangaroo getK1()
	{
		return k1;
	}
	
	public void setK1(Kangaroo k1)
	{
		this.k1 = k1;
	}
	
	public Kangaroo getK2()
	{
		return k2;
	}
	
	public void setK2(Kangaroo k2)
	{
		this.k2 = k2;
	}
	
	public Kangaroo getK3()
	{
		return k3;
	}
	
	public void setK3(Kangaroo k3)
	{
		this.k3 = k3;
	}
	
	//Methods calculate
	
	public double calculateAreaEnv()
	{
		double finalArea = 0.0;
		
		if(k1 != null)
			finalArea += k1.getHeight() * MULT_AREA;
		if(k2 != null)
			finalArea += k2.getHeight() * MULT_AREA;
		if(k3 != null)
			finalArea += k3.getHeight() * MULT_AREA;
		
		return finalArea;			
	}
	
	public double calculateFoodK1()
	{

		double foodK1 = 0.0;

		if(k1 != null)
		{
			if (k1.getWeight() <= FOOD_LOW_WEIGHT)
			{
				foodK1 = (k1.getWeight() * MULT_FOOD_LOW);
			}else if(k1.getWeight() <= FOOD_MED_WEIGHT)
			{
				foodK1 = (k1.getWeight() * MULT_FOOD_MED);
			}else
			{
				foodK1 = (FAC_FOOD_HIG + (MULT_FOOD_HIG * (k1.getWeight() - SUBT_FOOD_HIG)));
			}
		}
		return foodK1;
	}
	
	public double calculateFoodK2()
	{
		double foodK2 = 0.0;
				
		if(k2 != null)
		{

			if (k2.getWeight() <= FOOD_LOW_WEIGHT)
			{
				foodK2 = (k2.getWeight() * MULT_FOOD_LOW);
			}else if(k2.getWeight() <= FOOD_MED_WEIGHT)
			{
				foodK2 = (k2.getWeight() * MULT_FOOD_MED);
			}else
			{
				foodK2 = (FAC_FOOD_HIG + (MULT_FOOD_HIG * (k2.getWeight() - SUBT_FOOD_HIG)));
			}
		}
		return foodK2;
	}
	
	public double calculateFoodK3()
	{
		double foodK3 = 0.0;
		
		if(k3 != null)
		{
			if (k3.getWeight() <= FOOD_LOW_WEIGHT)
			{
				foodK3 = (k3.getWeight() * MULT_FOOD_LOW);
			}else if(k3.getWeight() <= FOOD_MED_WEIGHT)
			{
				foodK3 = (k3.getWeight() * MULT_FOOD_MED);
			}else
			{
				foodK3 = (FAC_FOOD_HIG + (MULT_FOOD_HIG * (k3.getWeight() - SUBT_FOOD_HIG)));
			}
		}
		return foodK3;
	}
	
	public double calculateTotalFood()
	{
		double totalFood = 0.0;
			
		totalFood += k1 == null ? 0 : calculateFoodK1();
		totalFood += k2 == null ? 0 : calculateFoodK3();
		totalFood += k3 == null ? 0 : calculateFoodK3();
		
		return totalFood;
	}
	
	public boolean mach(){
		boolean mac = false;
		
		if (k1 != null && k1.getGender() == MALE){
			mac = true;
		}
		if (k2 != null && k2.getGender() == MALE){
			mac = true;
		}
		if (k3 != null){
			if (k3.getGender() == MALE){
				mac = true;
			}
		}
		return mac;
	}
	
	public String addKgo(Kangaroo nuevokgo)
	{	
		String msg = "";
		if (k1 == null || k2 == null || k3 == null)
		{	
			if(nuevokgo.getGender() == MALE)
			{
				if (mach()) {
					msg = "Ya hay un macho en el ambiente. No se agrego el canguro";
				}
			}else if (k1 == null)
				{
					k1 = nuevokgo;
					msg = "Se ha agregado el canguro con exito";
				}else if (k2 == null) {
					k2 = nuevokgo;
					msg = "Se ha agregado el canguro con exito";
				}else if (k3 == null) {
					k3 = nuevokgo;
					msg = "Se ha agregado el canguro con exito";
				}
			
		}else 
		{
				msg = "Ambiente lleno. No se agrego el canguro";
		}
		
		return msg;
	}
	
	public double calculateWater()
	{
		double water = 0.0;
		
		if(k1 != null)
		{
			water += k1.calculateBmi()*1.5;
		}
		if(k2 != null)
		{
			water += k2.calculateBmi()*1.5;
		}
		if(k3 != null)
		{
			water += k3.calculateBmi()*1.5;
		}
		
		return water;
	}
	
	public String whoVowel()
	{
		String msg = "";

		if (k1 != null) 
		{
			msg += k1.whoVowel();
		}
		if (k2 != null) 
		{
			msg += k2.whoVowel();
		}
		if (k3 != null) 
		{
			msg += k3.whoVowel();
		}

		return msg;
	}
	
	public String vaccination()
	{
		String msg = "";

		if (k1 != null) 
		{	
				msg += k1.vaccination();
		}
		if (k2 != null) 
		{
				msg += k2.vaccination();
		}
		if (k3 != null) 
		{
				msg += k3.vaccination();
		}

		return msg;
	}
	
	public String removeKangaroo(int kang)
	{
		String msg = "";
		   
		if(kang == 1) 
		{	
			if (k1 != null)
			{		   	
				k1 = null;
				msg = "El canguro ha sido eliminado";
			}else 
			{
				msg = "El canguro seleccionado no existe";
			}
		
	   } else if(kang == 2) 
	   {		
			if (k2 != null)
			{   	
				k2 = null;
				msg = "El canguro ha sido eliminado";
			}else 
			{
				msg = "El canguro seleccionado no existe";
			}
			   		
		}else if(kang==3)
		{
		   if (k3 != null)
		   {   	
				k3 = null;
				msg = "El canguro ha sido eliminado";
		   }else
		   {
				msg = "El canguro seleccionado no existe";
			}
		
		}else
		{		
			msg = "Ingrese una seleccion valida";
	    }
		   
		return msg;
	}
	
	public Kangaroo selectedKangaroo(int kang)
	{
		Kangaroo x = null;
		   
		if(kang == 1) 
		{	
			if (k1 != null)
			{		   	
				x = k1;
			}
		
	   } else if(kang == 2) 
	   {		
			if (k2 != null)
			{   	
				x = k2;
			}
			   		
		}else if(kang==3)
		{
		   if (k3 != null)
		   {   	
				x = k3;
		   }
		}
		
		return x;
	}
	
	public String addChangeKgo(Kangaroo nuevokgo){
		
		String msg = "";
		if (k1 == null || k2 == null || k3 == null){
			
			if(nuevokgo.getGender() == MALE) {
				if (mach()) {
					msg = "Ya hay un macho en el ambiente. No se cambio el canguro";
				}
			}else if (k1 == null)
			{
				k1 = nuevokgo;
				msg = "El canguro ha sido cambiado satisfactoriamente";
			}else if (k2 == null) {
				k2 = nuevokgo;
				msg = "El canguro ha sido cambiado satisfactoriamente";
			}else if (k3 == null) {
				k3 = nuevokgo;
				msg = "El canguro ha sido cambiado satisfactoriamente";
			}
			
		}else 
		{
				msg = "Ambiente lleno. No se cambio el canguro";
		}
		
		return msg;
	}
	
	public String removeChangeKangaroo(int kang)
	{
		String msg = "";
		 if(kang == 1) 
			{	
				if (k1 != null)
				{		   	
					k1 = null;
					msg += "";
				}else 
				{
					msg += "El canguro seleccionado no existe";
				}
			
		   } else if(kang == 2) 
		   {		
				if (k2 != null)
				{   	
					k2 = null;
					msg += "";
				}else 
				{
					msg += "El canguro seleccionado no existe";
				}
						
			}else if(kang==3)
			{
			   if (k3 != null)
			   {   	
					k3 = null;
					msg += "";
			   }else
			   {
					msg += "El canguro seleccionado no existe";
				}
			
			}else
			{		
				msg += "Seleccione una opcion valida";
			}
		   
		return msg;
	}
	
	public String showEnvironment()
	{
		String msg = "";
		
		if(k1 != null)
		{
		msg += "El primer canguro de este ambiente es:\n \n"+k1.showKangaroo()+"\n";
		msg += "-------------------------------------------------------------------- \n";
		}
		if(k2 != null)
		{
		msg += "El segundo canguro de este ambiente es:\n \n"+k2.showKangaroo()+"\n";
		msg += "-------------------------------------------------------------------- \n";
		}
		if(k3 != null)
		{
		msg += "El tercer canguro de este ambiente es:\n \n"+k3.showKangaroo()+"\n";
		msg += "-------------------------------------------------------------------- \n";
		}
		msg += "Este ambiente cuenta con un area de: "+calculateAreaEnv()+"metros cuadrados \n";
		msg += "Este ambiente cuenta con "+calculateTotalFood()+" kg de comida \n";
		msg += "Este ambiente cuenta con "+calculateWater()+" litros de agua \n";
		
		return msg;
	}
}