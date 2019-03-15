package ui;

import model.*;

public class Main
{
	private Zoo australia;
	
	public Main()
	{
		init();
	}
	
	public void init()
	{
		australia = new Zoo("Zoologico de Cali", new KangarooZ(83.2, new KangarooE(27.2, 95.0, 140.0, new Kangaroo("Roberto", 53.0, 1.4, "Masculino", "O+", 38.0, "Alto", "No", new Date(22, 1, 2001)), new Kangaroo("Randy", 30.0, 1.1, "Femenino", "A-", 27.3, "Alto", "No", new Date(8, 2, 2003)), new Kangaroo("Sasha", 25.0, 0.9, "Femenino", "AB+", 27.7, "Moderado", "No", new Date(15, 3, 2014))),
																	  new KangarooE(25.6, 76.1, 112.3, new Kangaroo("Alex", 37.2, 1.3, "Masculino", "B+", 28.6, "Alto", "No", new Date(18, 9, 2010)), new Kangaroo("Lili", 21.0, 0.9, "Femenino", "AB+", 23.3, "Bajo", "Si", new Date(27, 7, 2018)), new Kangaroo("Kamla", 23.0, 1.0, "Femenino", "AB-", 23.0, "Bajo", "No", new Date(29, 4, 2015))),
																	  new KangarooE(30.4, 80.4, 100.7, new Kangaroo("Derby", 40.6, 1.5, "Masculino", "AB+", 27.1, "Moderado", "No", new Date(14, 1, 2006)), new Kangaroo("Lucy", 24.6, 1.0, "Femenino", "O-", 24.6, "Bajo", "No", new Date(9, 2, 2016)), new Kangaroo("Yudi", 20.0, 1.3, "Femmenino", "O+", 15.4, "Moderado", "Si", new Date(9, 2, 2016)))),
												 new DragonZ(20.0, 37.0, 11.7, new Dragon("Kilian", 420.5, 55.0, "Masculino", 7.6), new Dragon("Kai'Zha", 400.0, 50.0, "Femenino", 8.0)));
	}
	
	public static void main(String[] args)
	{
		
	}
}