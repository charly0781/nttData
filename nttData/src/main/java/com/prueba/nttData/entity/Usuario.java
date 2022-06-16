package com.prueba.nttData.entity;


public class Usuario {

	private int idDocumento;
	private String tipoDocuemnto;
	private String nombre;
	private String nombre2;
	private String apellido;
	private String apellido2;
	private String telefono;
	private String direccion;
	private String ciudad;
	
	
	public Usuario() {
		super();
	}
	
	public Usuario(int idDocumento, String tipoDocuemnto, String nombre, String nombre2, String apellido,
			String apellido2, String telefono, String direccion, String ciudad) {
		super();
		this.idDocumento = idDocumento;
		this.tipoDocuemnto = tipoDocuemnto;
		this.nombre = nombre;
		this.nombre2 = nombre2;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	
	public int getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}
	public String getTipoDocuemnto() {
		return tipoDocuemnto;
	}
	public void setTipoDocuemnto(String tipoDocuemnto) {
		this.tipoDocuemnto = tipoDocuemnto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre2() {
		return nombre2;
	}
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String i) {
		this.telefono = i;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}	
	
	
}
