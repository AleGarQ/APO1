import java.util.Scanner;

public class Promedio
{
	public static void main(String[] args)
	{
	Scanner entrada = new Scanner(System.in);
	double nota1;
	double nota2;
	double nota3;
	int cantidadNotas;
	double suma;
	double promedio;
	
	System.out.print("Escriba la primera nota: ");
	nota1 = entrada.nextDouble();
	
	System.out.print("Escriba la segunda nota: ");
	nota2 = entrada.nextDouble();
	
	System.out.print("Escriba la tercera nota: ");
	nota3 = entrada.nextDouble();
	
	System.out.print("Escriba la cantidad de notas: ");
	cantidadNotas = entrada.nextInt();
	
	suma = nota1+nota2+nota3;
	promedio = suma/cantidadNotas;
	
	System.out.printf("El promedio es: %d%n", promedio);
	}
}