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
}