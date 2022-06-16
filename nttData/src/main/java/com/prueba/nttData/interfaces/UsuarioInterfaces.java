package com.prueba.nttData.interfaces;


import com.prueba.nttData.herramientas.NegocioException;

public interface UsuarioInterfaces {
	
	public Object buscarUsuario(int idDocumento, String tipoDocumento) throws NegocioException;

}
