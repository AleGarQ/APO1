package model;

public class Zoo
{
	//Atrubutes
	
	private String name;
	
	//Relations
	
	private KangarooZ kZone;
	private DragonZ dZone;
	
	//Methods
	
	public Zoo(String name, KangarooZ kZone, DragonZ dZone)
	{
		this.name = name;
		this.kZone = kZone;
		this.dZone = dZone;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public KangarooZ getKZone()
	{
		return kZone;
	}
	
	public void setKZone(KangarooZ kZone)
	{
		this.kZone = kZone;
	}
	
	public DragonZ getDZone()
	{
		return dZone;
	}
	
	public void setDZone(DragonZ dZone)
	{
		this.dZone = dZone;
	}
	
	//Methods calculate
	
	public String addKgoo(Kangaroo nuevokgo, int opEnvironment)
	{
		String msg = "";
		
		msg += kZone.addKangaroo(nuevokgo, opEnvironment);
		return msg;
	}
	
	public String showZoo()
	{
		String msg = "";
		
		if (kZone.showZone() != null){
			msg += ".............................................................................................................................\n";
			msg += "La zona de los canguros tiene un area de "+kZone.totalArea()+" metros cuadrados y cuenta con los siguientes ambientes: \n";
			msg += kZone.showZone()+"\n";
			msg += ".............................................................................................................................\n";
			msg += "La zona de los dragones cuenta con las siguientes caracteristicas: \n";
			msg += dZone.showZone()+"\n";
			msg += ".............................................................................................................................\n";
		}
		return msg;
	}
	
	public String whoVowel()
	{
		String msg = "";

		msg += kZone.whoVowels()+"\n";
		msg += dZone.whoVowels()+"\n";

		return msg;
	}
	
	public String vaccination()
	{
		String msg = "";
		msg += kZone.vaccination();
		return msg;
	}
	
	public String removeKangaroo(int kang, int opEnvironment)
	{
		String msg = "";

		msg += kZone.removeKangaroo(kang, opEnvironment);

		return msg;
	}
	
	public String changeKangaroo(int kang, int opEnvironment1, int opEnvironment2)
	{
		String msg = "";
		
		msg += kZone.changeKangaroo(kang, opEnvironment1, opEnvironment2);
		
		return msg;
	}
}