package com.prueba.nttData.servicio;


import org.springframework.stereotype.Service;

import com.prueba.nttData.entity.Usuario;
import com.prueba.nttData.enumerados.EnumIdErrores;
import com.prueba.nttData.enumerados.EnumParametros;
import com.prueba.nttData.enumerados.EnumTextos;
import com.prueba.nttData.herramientas.NegocioException;
import com.prueba.nttData.herramientas.Utilidades;
import com.prueba.nttData.interfaces.UsuarioInterfaces;

@Service
public class ServicioUsuario implements UsuarioInterfaces{
	
	private Usuario usuario = new Usuario();

	@Override
	public Object buscarUsuario(int idDocumento, String tipoDocumento) throws NegocioException 
	{

		if ( tipoDocumento.equals(EnumTextos.C.getValue()) ||  tipoDocumento.equals(EnumTextos.P.getValue()))
		{
			if (idDocumento == 23445322)
			{
				usuario.setIdDocumento(idDocumento);
				usuario.setTipoDocuemnto(tipoDocumento);
				usuario.setNombre("Primer nombre");
				usuario.setNombre2("Segundo nombre");
				usuario.setApellido("Primer apellido");
				usuario.setApellido2("Segundo apellido");
				usuario.setTelefono("Teléfono");
				usuario.setDireccion("Dirección");
				usuario.setCiudad("Ciudad de residencia");
				return usuario;
				
			}else
			{
				throw new NegocioException(EnumIdErrores.ERROR_BUSQUEDA.getKey(), 
						EnumIdErrores.ERROR_BUSQUEDA.replaceMessage(tipoDocumento, String.valueOf(idDocumento)));
			}
			
		}else
		throw new NegocioException(EnumIdErrores.ERROR_TIPO_DOCUMENTO.getKey(), 
				EnumIdErrores.ERROR_TIPO_DOCUMENTO.replaceMessage(tipoDocumento));

	}

}
