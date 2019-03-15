package ui;

import model.*;

public class Main
{
	private Person use;
	
	public Main()
	{
		init();
	}
	
	public void init()
	{
		use = new Person("Juan Manuel", new Phone("Iphone X", "Apple"), new Phone("Galaxy S9", "Samsung"));
	}
	
	public static void main(String[] args) 
	{
		Main m = new Main();
		m.showMessage();
	}
	
	public void showMessage()
	{
		System.out.println("El nombre de la persona es: "+use.getName());
		System.out.println("El modelo del celular 1 es: "+use.getP1().getModel()+" y la marca es: "+use.getP1().getBrand());
		System.out.println("El modelo del celular 2 es: "+use.getP2().getModel()+" y la marca es: "+use.getP2().getBrand());
	}
}