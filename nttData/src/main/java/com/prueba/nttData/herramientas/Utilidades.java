package com.prueba.nttData.herramientas;

import com.prueba.nttData.enumerados.EnumIdErrores;

public class Utilidades {
	
		
	public static void validarVacio(Object valor, String name) throws NegocioException
	{
		
		if (String.valueOf(valor).equals("null") || String.valueOf(valor).isEmpty())
		{
			throw new NegocioException(EnumIdErrores.ERROR_SIN_DATOS.getKey(),
					EnumIdErrores.ERROR_SIN_DATOS.replaceMessage(name));
		}
		
	}

}
