package model;

public class KangarooZ
{
	//Relations	
	
	private KangarooE kE1;
	private KangarooE kE2;
	private KangarooE kE3;
	
	//Methods
	
	public KangarooZ(KangarooE kE1, KangarooE kE2, KangarooE kE3)
	{
		this.kE1 = kE1;
		this.kE2 = kE2;
		this.kE3 = kE3;
	}

	public KangarooE getKE1()
	{
		return kE1;
	}
	
	public void setKE1(KangarooE kE1)
	{
		this.kE1 = kE1;
	}
	
	public KangarooE getKE2()
	{
		return kE2;
	}
	
	public void setKE2(KangarooE kE2)
	{
		this.kE2 = kE2;
	}
	
	public KangarooE getKE3()
	{
		return kE3;
	}
	
	public void setKE3(KangarooE kE3)
	{
		this.kE3 = kE3;
	}
	
	//Mthods calculate
	
	public String addKangaroo(Kangaroo nuevokgo, int opEnvironment)
	{
		String msg = "";
			
		if (opEnvironment == 1) {
				msg = kE1.addKgo(nuevokgo);
		}else if (opEnvironment == 2) {
				msg = kE2.addKgo(nuevokgo);
		}else if (opEnvironment == 3) {
				msg = kE3.addKgo(nuevokgo);
		}
		return msg;
	}
	
	public double totalArea()
	{
		double total = 0.0;
			
		total = kE1.calculateAreaEnv() + kE2.calculateAreaEnv() + kE3.calculateAreaEnv();
		return total;
	}
	
	public String showZone()
	{
		String msg = "";
		
		if (kE1.showEnvironment() != null)
		{
			msg += "=================================================================== \n";
			msg += "El primer ambiente tiene las siguientes caracteristicas: \n";
			msg += kE1.showEnvironment()+"\n";
		}
		if (kE2.showEnvironment() != null)
		{
			msg += "=================================================================== \n";
			msg += "El segundo ambiente tiene las siguientes caracteristicas: \n";
			msg += kE2.showEnvironment()+"\n";
		}
		if (kE3.showEnvironment() != null)
		{
			msg += "=================================================================== \n";
			msg += "El tercer ambiente tiene las siguientes caracteristicas: \n";
			msg += kE3.showEnvironment()+"\n";
		}
		msg += "=================================================================== \n";
		
		return msg;
	}
	
	public String whoVowels()		
	{
		String msg = "";

		msg += kE1.whoVowel();
		msg += kE2.whoVowel();
		msg += kE3.whoVowel();

		return msg;
	}
	
	public String vaccination()
	{
		String msg = "";

		msg += kE1.vaccination();
		msg += kE2.vaccination();
		msg += kE3.vaccination();

		return msg;
	}
	
	public String removeKangaroo(int kang, int opEnvironment)
	{
		String msg = "";

		   if(opEnvironment == 1) 
		   {
			   msg += kE1.removeKangaroo(kang);
		   } else if(opEnvironment == 2)
		   {
			   msg += kE2.removeKangaroo(kang);
		   }else if(opEnvironment == 3)
		   {
			   msg += kE3.removeKangaroo(kang);
		   }else
		   {
			   msg = "Seleccione una opcion valida";
		   }
		   
		   return msg;
	}
	
	public KangarooE getEnvironment(int opEnvironment1)
	{
		KangarooE x = null;
		
		if(opEnvironment1 == 1)
		{
			x = kE1;
		}
		if(opEnvironment1 == 2)
		{
			x = kE2;
		}
		if(opEnvironment1 == 3)
		{
			x = kE3;
		}
		
		return x;
	}
	
	public String changeKangaroo(int kang, int opEnvironment1, int opEnvironment2)
	{
		String msg = "";

		KangarooE eliminateKofEnvironment = getEnvironment(opEnvironment1);
		KangarooE addKtoEnvironment = getEnvironment(opEnvironment2);
		Kangaroo x = eliminateKofEnvironment.selectedKangaroo(kang);
		msg += addKtoEnvironment.addChangeKgo(x);
		if(addKtoEnvironment.addChangeKgo(x).equals("Ambiente lleno. No se cambio el canguro") || addKtoEnvironment.addChangeKgo(x).equals("Ya hay un macho en el ambiente. No se cambio el canguro"))
		{
			msg += "";
		}else 
		{
			msg += eliminateKofEnvironment.removeChangeKangaroo(kang);
		}
		return msg;
	}
}