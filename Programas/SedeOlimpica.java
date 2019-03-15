//Autor: Alejandro Garcia
//Codigo: A00358891


//Punto 2
//va en SedeOlimpica
public ArrayList<Entrenador> listadoDeEntrenadoresDelegacionesAsiaticas()
{
	ArrayList<Entrenador> lista = new ArrayList<Entrenador>;
	int i = 0;
	
	while(i < delegaciones.length)
	{
		if(delegaciones[i] != null && delegaciones[i].darContinente() == delegacion.ASIA && delegaciones[i].anhosExp() > 10)
		{
			lista.add(delegaciones[i].darEntrenador());
		}
		i++;
	}
	
	return list;
}



//va en la clase delegacion
public int anhosExp()
{
	int anhos = 0;
	
	anhos = entrenador.darAnhos();
	
	return anhos;
}