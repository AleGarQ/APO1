package ui;

import model.*;
import java.util.Scanner;

public class Main
{
	private Zoo australia;
	
	public Main()
	{
		init();
	}
	
	public void init()
	{
		australia = new Zoo("Zoologico de Cali", new KangarooZ(new KangarooE(new Kangaroo("Alberto", 53.0, 1.4, "Masculino", "o", new DateK(22, 1, 2001)), new Kangaroo("Randy", 30.0, 1.1, "Femenino", "a", new DateK(8, 2, 2003)), null),
															   new KangarooE(new Kangaroo("Alex", 37.2, 1.3, "Masculino", "b", new DateK(18, 9, 2010)), new Kangaroo("Lili", 21.0, 0.9, "Femenino", "ab", new DateK(27, 7, 2018)), null),
														   	   new KangarooE(new Kangaroo("Derby", 40.6, 1.5, "Masculino", "ab", new DateK(14, 1, 2006)), new Kangaroo("Lucy", 24.6, 1.0, "Femenino", "o", new DateK(9, 2, 2016)), null)),
												 new DragonZ(20.0, 37.0, new Dragon("Kilian", 0.420, 0.55, "Masculino"), new Dragon("Kai'Zha", 0.400, 0.50, "Femenino")));
	}
	
	public static void main(String[] args)
	{
		Main m = new Main();
		m.showMessage();
	}
	
	public void showMessage()
	{
		Scanner scanStr = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		Scanner scanDou = new Scanner(System.in);
		System.out.println("*****************************************************************************************************************************");
		System.out.println("*****************************************************************************************************************************");
		System.out.println("***************************                                                                       ***************************");
		System.out.println("*************************** HOLA, BIENVENIDO AL PROGRAMA DE MONITORIZACION DE LA ZONA AUSTRALIANA ***************************");
		System.out.println("***************************                                                                       ***************************");
		System.out.println("*****************************************************************************************************************************");
		System.out.println("*****************************************************************************************************************************");
		System.out.println("");
		
		boolean selection = false;
		int userSelection = 0;
		int kang = 0;
		
		while (!selection)
		{
			showMenu();
			userSelection = scanInt.nextInt();
			
			switch (userSelection)
			{
				case (1): 
					String name;
					double weight;
					double height;
					String gender;
					String blood;
					int day;
					int month;
					int year;
					
					System.out.println("\nPor favor digite el nombre del canguro:\n");
					name = scanStr.nextLine();
					System.out.println("\nPor favor digite el peso en kg del canguro:\n");
					weight = scanDou.nextDouble();
					scanDou.nextLine();
					System.out.println("\nPor favor digite la altura en metros del canguro:\n");
					height = scanDou.nextDouble();
					scanDou.nextLine();
					System.out.println("\nPor favor digite el genero del canguro:");
					System.out.println("	1. si es macho");
					System.out.println("	2. si es hembra\n");
					int selectedGender = scanInt.nextInt();
					scanInt.nextLine();
					gender = selectedGender ==1 ? Kangaroo.MALE : Kangaroo.FEMALE;
					System.out.println("\nPor favor digite el tipo de sangre del canguro:\n");
					blood = scanStr.nextLine();
					System.out.println("\nPorfavor digite el dia de nacimiento\n");
					day = scanInt.nextInt();
					scanInt.nextLine();
					
					System.out.println("\nPorfavor digite el mes de nacimiento\n");
					month = scanInt.nextInt();
					scanInt.nextLine();
					System.out.println("\nPorfavor digite el anio de nacimiento\n");
					year = scanInt.nextInt();
					scanInt.nextLine();
					
					
					Kangaroo nuevokgo = new Kangaroo(name, weight, height, gender, blood, new DateK(day, month, year));
					
					System.out.println("\nPor favor dijite el ambiente que quiere agregar el canguro:");
					System.out.println("1. ambiente 1");
					System.out.println("2. ambiente 2");
					System.out.println("3. ambiente 3\n");
					int opEnvironment = scanInt.nextInt();
					scanInt.nextLine();
					
					System.out.println(australia.addKgoo(nuevokgo, opEnvironment));
				break;
				
				case (2):
					System.out.println("\nEn que ambiente se encuentra el canguro que desea cambiar?");
					System.out.println("1. ambiente 1");
					System.out.println("2. ambiente 2");
					System.out.println("3. ambiente 3\n");
                    int opEnvironment1 = scanInt.nextInt();
					scanInt.nextLine();
					System.out.println("\nQue canguro desea cambiar?");
                    System.out.println("1. primer canguro");
              		System.out.println("2. segundo canguro");			
               		System.out.println("3. tercer canguro\n");
					kang = scanInt.nextInt();
                    scanInt.nextLine();
					System.out.println("\nA que ambiente quiere agregar el canguro?");
					System.out.println("1. ambiente 1");
					System.out.println("2. ambiente 2");
					System.out.println("3. ambiente 3\n");
                    int opEnvironment2 = scanInt.nextInt();
					scanInt.nextLine();
					
					System.out.println(australia.changeKangaroo(kang, opEnvironment1, opEnvironment2));
				break;
				
				case (3):
					System.out.println("\nDe que ambiente quiere eliminar un canguro?");
                 	System.out.println("1. ambiente 1");
					System.out.println("2. ambiente 2");
					System.out.println("3. ambiente 3");
                    opEnvironment = scanInt.nextInt();
                    scanInt.nextLine();
                    System.out.println("\nQue canguro desea eliminar?");
                    System.out.println("1. primer canguro");
              		System.out.println("2. segundo canguro");			
               		System.out.println("3. tercer canguro");
                    kang = scanInt.nextInt();
                    scanInt.nextLine();
                    System.out.println(australia.removeKangaroo(kang, opEnvironment));
				break;
				
				case (4):
					System.out.println("\nLos nombres de los animales que empiezan y terminan en vocal son: \n");
					System.out.println(australia.whoVowel()+"\n");
				break;
				
				case (5):
					System.out.println("\nLa fecha de vacunacion de los canguros es: \n");
					System.out.println(australia.vaccination()+"\n");
				break;
				
				case (6):
					System.out.println(australia.showZoo()+"\n");
				break;
				
				case (7): 
					selection = true;
				break;
				
				default:
					System.out.println("\nPor favor ingrese un seleccion valida.\n"); 
			}
			
		
		}
	}
	
	public void showMenu()
	{
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Que desea hacer?");
		System.out.println("1. Agregar canguro");
		System.out.println("2. Cambiar canguro de ambiente");
		System.out.println("3. Eliminar canguro");
		System.out.println("4. Buscar los animales cuyos nombres empiecen o terminen por vocal");
		System.out.println("5. Mostrar fechas de vacunacion");
		System.out.println("6. Mostrar el monitor");
		System.out.println("7. Salir\n");
	}
}