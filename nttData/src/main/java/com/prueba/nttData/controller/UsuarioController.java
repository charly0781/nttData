package com.prueba.nttData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.nttData.enumerados.EnumParametros;
import com.prueba.nttData.herramientas.NegocioException;
import com.prueba.nttData.herramientas.Respuesta;
import com.prueba.nttData.herramientas.Utilidades;
import com.prueba.nttData.servicio.ServicioUsuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
		
	@Autowired
	private ServicioUsuario sUsuario;
	
	@GetMapping(value="/getUsuario")
	public Respuesta buscarUsuario(
			@RequestParam(value = "idDocumento", required =  true) String id,
			@RequestParam(value = "tipoDocumento", required = true)String tipoDocumento)
	{
		
		Respuesta respuesta = new Respuesta();
		try {
			Utilidades.validarVacio(id, EnumParametros.ID_DOCUMENTO.getValue());
			Utilidades.validarVacio(tipoDocumento, EnumParametros.TIPO_DOCUMENTO.getValue());
			
			respuesta.setRespuesta(sUsuario.buscarUsuario(Integer.valueOf(id), tipoDocumento));
			
		} catch (NegocioException e) {
			respuesta.setCodigo(e.getCodigo());
			respuesta.setMensaje(e.getMessage());
		}
		return respuesta;
	}

}
