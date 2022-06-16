package com.prueba.nttData.herramientas;

import javax.persistence.Cacheable;

import org.springframework.stereotype.Service;

@Service
@Cacheable(false)
public class Respuesta {
	
	private int codigo = 200;
	private String mensaje = "";
	private Object respuesta = "";
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Object getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(Object respuesta) {
		this.respuesta = respuesta;
	}
	

}
