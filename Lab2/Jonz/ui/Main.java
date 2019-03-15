package ui;
import model.*;
import java.util.Scanner;

//Jhon Stiven Arboleda Gallego

	public class Main{
		
	//relations
		private Zoo zooCali;
		private Scanner reader;
	
	//1
	
	public Main (){
		init ();
		reader = new Scanner (System.in);
	}
	//Method main
	public static void main(String[] args){
		
		Main m = new Main();
		m.showMenu();
	}
	//menu
	public void showMenu(){
	
		int option=0;
		while(option!=8){
			message();
		option=reader.nextInt();	
		reader.nextLine();
		
	switch (option) {
			case 1:
				
				//Crear un canguro
				
				System.out.println("Por favor digite el nombre del canguro:");
				String name = reader.nextLine();
				
				System.out.println("Por favor digite la altura:");
				double height = reader.nextDouble();
				reader.nextLine();
				
				System.out.println("Por favor digite el peso:");
				double weight = reader.nextDouble();
				reader.nextLine();
				
				System.out.println("Por favor elija una de las opciones de genero \n 1.Masculino \n 2.Femenino");
				int seleccion = reader.nextInt();
				reader.nextLine();
				String gender="";
				if (seleccion==1){
					gender=Kangaroo.MALE;
				}
				else if (seleccion==2){
					gender=Kangaroo.FEMALE;
				}
				
				System.out.println("Por favor digite el tipo de sangre:");
				String bloodType = reader.nextLine();
				
				System.out.println("Por favor digite el dia de nacimiento:");
				int day = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Por favor digite el mes de nacimiento:");
				int month = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Por favor digite el anio de nacimiento:");
				int year = reader.nextInt();
				reader.nextLine();
				
				Kangaroo agregar = new Kangaroo(name, weight, height, gender, bloodType, new Date(day, month, year));
				System.out.println("En que ambiente quiere agregar al canguro?");			
				
				System.out.println("1. Para el ambiente 1");
				System.out.println("2. Para el ambiente 2");
				System.out.println("3. Para el ambiente 3");
				
				int enviNum = reader.nextInt();
				reader.nextLine();
				
				System.out.println(zooCali.addKangaroo(agregar, enviNum));
				
				break;
			case 2:
			kangarooEliminate();
				break;
			case 3:
				System.out.println(""+zooCali.showKangaroo());
				break;
			case 4:
				System.out.println(""+zooCali.showEnvironment());		
				break;
			case 5:
				System.out.println(""+zooCali.showZone());
				break;
			}			
		}
	}
		//Eliminar canguros

		public void kangarooEliminate(){
	
			int numero = 0;
	
			while(numero != 10){
		
				System.out.println ("");
				System.out.println ("Que canguro quieres eliminar?");
				

				if (zooCali.getKangarooZone().getEnvironment1().getKangaroo1() != null){
				System.out.println("1."+ zooCali.getKangarooZone().getEnvironment1().getKangaroo1().getName());
				}
				if (zooCali.getKangarooZone().getEnvironment1().getKangaroo2() != null){
				System.out.println("2."+ zooCali.getKangarooZone().getEnvironment1().getKangaroo2().getName());
				}
				if (zooCali.getKangarooZone().getEnvironment1().getKangaroo3() != null){
				System.out.println("3."+ zooCali.getKangarooZone().getEnvironment1().getKangaroo3().getName());
				}
				if (zooCali.getKangarooZone().getEnvironment2().getKangaroo1() != null){
				System.out.println("4."+ zooCali.getKangarooZone().getEnvironment2().getKangaroo1().getName());
				}
				if (zooCali.getKangarooZone().getEnvironment2().getKangaroo2() != null){
				System.out.println("5."+ zooCali.getKangarooZone().getEnvironment2().getKangaroo2().getName());
				}
				if (zooCali.getKangarooZone().getEnvironment2().getKangaroo3() != null){
				System.out.println("6."+ zooCali.getKangarooZone().getEnvironment2().getKangaroo3().getName());
				}
				if (zooCali.getKangarooZone().getEnvironment3().getKangaroo1() != null){
				System.out.println("7."+ zooCali.getKangarooZone().getEnvironment3().getKangaroo1().getName());
				}
				if (zooCali.getKangarooZone().getEnvironment3().getKangaroo2() != null){
				System.out.println("8."+ zooCali.getKangarooZone().getEnvironment3().getKangaroo2().getName());
				}
				if (zooCali.getKangarooZone().getEnvironment3().getKangaroo3() != null){
				System.out.println("9."+ zooCali.getKangarooZone().getEnvironment3().getKangaroo3().getName());
				}
				System.out.println("10. Salir");
				
				numero = reader.nextInt();
	
				switch (numero){
				case (1):
					zooCali.getKangarooZone().getEnvironment1().setKangaroo1(null);
					System.out.println("El canguro ha sido eliminado /n");
					break;
				case (2):
					zooCali.getKangarooZone().getEnvironment1().setKangaroo2(null);
					System.out.println("El canguro ha sido eliminado"+"/n");
					break;
				case (3):
					zooCali.getKangarooZone().getEnvironment1().setKangaroo3(null);
					System.out.println("El canguro ha sido eliminado"+"/n");
					break;
				case (4):
					zooCali.getKangarooZone().getEnvironment2().setKangaroo1(null);
					System.out.println("El canguro ha sido eliminado"+"/n");
					break;
				case (5):
					zooCali.getKangarooZone().getEnvironment2().setKangaroo2(null);
					System.out.println("El canguro ha sido eliminado"+"/n");
					break;
				case (6):
					zooCali.getKangarooZone().getEnvironment2().setKangaroo3(null);
					System.out.println("El canguro ha sido eliminado"+"/n");
					break;
				case (7):
					zooCali.getKangarooZone().getEnvironment3().setKangaroo1(null);
					System.out.println("El canguro ha sido eliminado"+"/n");
					break;
				case (8):
					zooCali.getKangarooZone().getEnvironment3().setKangaroo2(null);
					System.out.println("El canguro ha sido eliminado"+"/n");
					break;
				case (9):
					zooCali.getKangarooZone().getEnvironment3().setKangaroo3(null);
					System.out.println("El canguro ha sido eliminado"+"/n");
					break;
				case (10):
					numero = 10;
					break;
				default:
					System.out.println("Por favor digite una opción valida");
					break;
				}	
			}
		}
	
		//mostrar menu
		public void message(){
			
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("  ||                        BIENVENIDOS AL ZOOLOGICO DE CALI                          || ");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("1. Agregar un canguros.");
			System.out.println("2. Eliminar un canguro.");
			System.out.println("3. Datos de los canguros.");
			System.out.println("4. Datos de los ambientes de los canguros.");
			System.out.println("5. Datos de la zona de los canguros.");
			System.out.println("6. Datos de los dragones barbados.");
			System.out.println("7. Datos de la zona de dragones barbados.");
			System.out.println("8. Salir.");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------------------");
			
		}
	
	public void init (){
		Date date1 = new Date (05, 10, 2010);
		Date date2 = new Date (04, 11, 2003);
		Date date3 = new Date (12, 12, 2004);
		Date date4 = new Date (22, 1, 2001);
		Date date5 = new Date (15, 9, 2013);
		Date date6 = new Date (12, 2, 2006);
		Kangaroo kanga1 = new Kangaroo("Camila", 191.6, 1.53, "Femenino", "AB", date1 );
		Kangaroo kanga2 = new Kangaroo("Fredd", 210.6, 1.63, "Masculino", "O", date2);
		Kangaroo kanga3 = new Kangaroo("Aleja", 171.6, 1.46, "Feminino", "A", date3);
		Kangaroo kanga4 = new Kangaroo("Jonz", 191.6, 1.53, "Masculino", "AB", date4);
		Kangaroo kanga5 = new Kangaroo("YIYIYI", 210.6, 1.63, "Femenino", "O", date5);
		Kangaroo kanga6 = new Kangaroo("Zupu", 171.6, 1.46, "Masculino", "A", date6);
		KangarooEnvironment EnviKanga1 = new KangarooEnvironment (kanga1, kanga4, null);
		KangarooEnvironment EnviKanga2 = new KangarooEnvironment (kanga2, kanga5, null);
		KangarooEnvironment EnviKanga3 = new KangarooEnvironment (kanga3, kanga6, null);
		KangarooZone zoneKanga = new KangarooZone (21.5 , 42.3, 23.2, 10.1, EnviKanga1, EnviKanga2, EnviKanga3);
		Dragon dragoncito = new Dragon ("Steff", 30.6, 1.16, 135.6, "o+");
		Dragon dragoncita = new Dragon ("Tiffa", 26.6, 1.21, 122.9, "o-");
		DragonZone zoneDragon = new DragonZone (41.2, 3.1, 31.2, 45.1, 6, dragoncito, dragoncita);
		zooCali = new Zoo ("Zoologico de Cali", zoneKanga, zoneDragon);
	}
}