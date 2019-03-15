public class Main
{

	
	public static void main(String[] args)
	{
		int valorA = 5;
		int valorB = 6;
		
		String linea = 0 == valorB - (++valorA)? "Rojo" : "Verde";
		
		System.out.println(linea);
		
		int valorC = valorA-- * ++valorB;
		System.out.println(valorC);
	}
	
	
}