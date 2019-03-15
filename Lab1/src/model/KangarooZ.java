package model;

public class KangarooZ
{
	//Atributes
	
	private double tArea;
	
	//Relations	
	
	private KangarooE kE1;
	private KangarooE kE2;
	private KangarooE kE3;
	
	//Methods
	
	public KangarooZ(double tArea, KangarooE kE1, KangarooE kE2, KangarooE kE3)
	{
		this.tArea = tArea;
		this.kE1 = kE1;
		this.kE2 = kE2;
		this.kE3 = kE3;
	}
	
	public double getTArea()
	{
		return tArea;
	}
	
	public void setTArea(double tArea)
	{
		this.tArea = tArea;
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
}