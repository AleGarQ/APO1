public double calcularPrecioTorta ()
{	
	double precio = 0.0;

	if (pesoEnMediasLibras >  0 && tipo != null)
	{
		switch (tipo)
		{
		case TORTA_FRIA :
				switch (pesoEnMediasLibras)
				{
					case 1: precio = 15000.0; 
						break;
					case 2: precio = 28000.0; 
						break;
					case 3: precio = 40000.0; 
						break;
					case 4: precio = 53000.0; 
						break;
					default: precio = ( double ) (53000 + ((pesoEnMediasLibras-4) * 15000));
				}
		break;

		case TORTA_NEGRA :
				switch (pesoEnMediasLibras)
				{
					case 1: precio = 25000.0; 
						break;
					case 2: precio = 48000.0; 
						break;
					case 3: precio = 70000.0; 
						break;
					case 4: precio = 90000.0; 	
						break;
					default: precio = ( double ) (90000 + ((pesoEnMediasLibras-4) * 25000));    
				}
		break;

		case TORTA_FRUTAS :
				switch (pesoEnMediasLibras)
				{
					case 1: precio = 10000.0; 
						break;
					case 2: precio = 18000.0; 
						break;
					case 3: precio = 27000.0; 
						break;
					case 4: precio = 35000.0; 
						break;
					default: precio = ( double ) (35000 + ((pesoEnMediasLibras-4) * 10000));    
				}
		break;
		}
	} 

	if (cubierta.darTipo >= 1 && cubierta.darTipo <= 3)
	{
		switch (cubierta.darTipo)
		{
			case 1: precio = precio + PRECIO_CUBIERTA_MANTEQUILLA;
				break;
			case 2: precio = precio + PRECIO_CUBIERTA_HUEVO;
				break;
			case 3: precio = precio + PRECIO_CUBIERTA_NARANJA;
				break;
		}
	}

	return precio;
	}