package com.prueba.nttData.herramientas;

public class NegocioException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -52164493532295144L;

	private int codigo;
	private String message;
	
	
	public NegocioException(int codigo, String message) {
		super();
		this.codigo = codigo;
		this.message = message;
	}
			
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
