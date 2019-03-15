public class Alimentacion {

private int harinas; 
private int lacteos;
private int frutas;
private int carnes;

public Alimentacion (int harinas, int lacteos, int frutas, int carnes){
	this.harinas = harinas;
	this.lacteos = lacteos;
	this.frutas = frutas;
	this.carnes = carnes;
}



public String necesitaCita (){
	int puntuacion = 0;
	String mensaje = "Tiende a sobrealimentación. Requiere cita.";



if (harinas != 0){
	if (harinas == 1 || harinas == 2){
		++puntuacion;
	} else if (harinas == 3 || harinas == 4){
		puntuacion += 5;
	} else if (harinas >= 5 && harinas <= 7){
		puntuacion += 7;
	} else {puntuacion += 10;}

} else if (lacteos != 0){
	if (lacteos == 1){
		++puntuacion;
	} else if (lacteos >= 2 && lacteos <= 4){
		puntuacion += 5;
	} else if (lacteos >= 5 && lacteos <= 7){
		puntuacion += 7;
	} else {puntuacion += 10;}

} else if (frutas != 0){
	if (frutas == 1){
		++puntuacion;
	} else if (frutas == 2){
		puntuacion += 4;
	} else if (frutas >= 3 && frutas <= 5){
		puntuacion += 8;
	} else {puntuacion += 10;}

} else if (carnes != 0){
	if (carnes == 1){
		++puntuacion;
	} else if (carnes == 2){
		puntuacion += 4;
	} else {puntuacion += 10;}
}



if (puntuacion >= 1 && puntuacion <= 3)
	{
	mensaje = "A la clinica de inmediato. Requiere cita";
	} 
	else if (puntuacion == 4)
	{
		mensaje = "A la clinica de inmediato. Requiere cita";
	} 
	else if (puntuacion >= 5 && puntuacion <= 15)
	{
		mensaje = "Debe consumir mayor cantidad de alimentos. Requiere cita";
	} 
	else if (puntuacion >= 16 && puntuacion <= 19)
	{
		mensaje = "Puede mejorar, pero no está mal. No requiere cita.";
	} 
	else if (puntuacion == 20)
	{
		mensaje = "Excelente, No requiere cita";
	} 
	else if (puntuacion >= 21 && puntuacion <= 30)
	{
		mensaje = "Puede mermar un poco, pero no está mal. No requiere cita";
	}

return mensaje;
}
}