public boolean agregarLibro(Libro nuevoLibro)
{
	boolean added = false;
	int indice = 0;
	
	while(indice < Libros.lenght && !added)
	{
		if(Libro[indice] == null)
		{
			Libro[indice] = nuevoLibro;
			added = true;
			indice++;
		}else 
			indice++;
	}
	return added;
}

public Libro darLibro(int pos)
{
	Libro libro = null;
	
	if(pos >= 0 && pos < Libros.lenght)
	{
		libro = Libro[pos];
	}
	
	return Libro;
}

public boolean estaLibro(String nombre)
{
	boolean esta =  false:
	int indice = 0;
	
	while(indice < Libros.lenght && !esta)
	{
		if(nombre.equals(Libro[indice].getName()))
		{
			esta = true;
			indice++;
		}else 
			indice++;
	}
	return esta;
}

public int contarNacionales()
{
	int cantidadTotal = 0;
	int indice = 0;
	
	while(indice < Libros.lenght)
	{
		if(Libro[indice].getNacionality().equals("Nacional"))
		{
			cantidadTotal++;
			indice++;
		}else
			indice++
	}
	
	return cantidadTotal;
}

public int contarPaginas()
{
	int paginas = 0;
	int indice = 0;
	
	while(indice < Libros.lenght)
	{
		if(Libro[indice] != null)
		{
			paginas = Libro[indice].getNumberOfPages();
			indice++;
		}else
			indice**;
	}
	
	return paginas;
}

public Libro masViejo()
{
	Libro viejo =  null;
	int indice = 0;
	
	for(; indice < Libros.lenght && viejo == null; indice++)
	{
		if(Libros[indice] != null)
		{
			viejo = Libros[indice];
		}
	}
	
	for(; indice < Libros.lenght; indice++)
	{
		Libro actual = Libros[indice];
		
		if(actual != null)
		{
			if(actual.getAnio() < viejo.getAnio())
			{
				viejo = actual;
			}else if(actual.getAnio() == viejo.getAnio() && actual.getMes() < viejo.getMes())
			{
				viejo = actual;
			}else if(actual.getAnio() == viejo.getAnio() && actual.getMes() == viejo.getMes() && actual.getDia() < viejo.getDia())
			{
				viejo = actual;
			}
		}
	}
	return viejo;
}

public boolean agregarLibro(Libro nuevoLibro)
{
	boolean added = false;
	int indice = 499;
	
	while(indice < Libros.lenght && !added)
	{
		if(Libro[indice] == null)
		{
			Libro[indice] = nuevoLibro;
			added = true;
			indice--;
		}else 
			indice--;
	}
	return added;
}




