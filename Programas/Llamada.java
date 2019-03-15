public class Llamada{

public final static char DIA = 'D';
public final static char NOCHE = 'N';

public final static String ZONA_NORTE = "Norte";
public final static String ZONA_SUR = "Sur";
public final static String ZONA_ORIENTE = "Oriente";
public final static String ZONA_OCCIDENTE = "Occidente";
public final static String ZONA_CENTRO = "Centro";

private double minutos;
private char momento;
private String zonaDestino;

public Llamada (double minutos, char momento, String zonaDestino){
this.minutos = minutos;
this.momento = momento;
this.zonaDestino = zonaDestino;
}

public double calcularValorLlamada (){
double valorFinal = 0.0;
if (zonaDestino != null && zonaDestino != "" && (momento == DIA || momento == NOCHE) && minutos > 0.0){
	switch (zonaDestino) {

	case ZONA_NORTE: if (momento == DIA){ valorFinal = minutos * 80.0; }
		else { valorFinal = minutos * 65.0; }
	break;

	case ZONA_SUR: if (momento == DIA){ valorFinal = minutos * 70.0; }
		else { valorFinal = minutos * 60.0; }
	break;

	case ZONA_ORIENTE: if (momento == DIA){ valorFinal = minutos * 100.0; }
		else { valorFinal = minutos * 80.0; }
	break;
		
	case ZONA_OCCIDENTE: if (momento == DIA){ valorFinal = minutos * 60.0; }
		else { valorFinal = minutos * 55.0; }
	break;
		
	case ZONA_CENTRO: if (momento == DIA){ valorFinal = minutos * 75.0; }
		else { valorFinal = minutos * 68.0; }
	break;
	}
}
return valorFinal;
}
}