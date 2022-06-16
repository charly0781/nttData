package com.prueba.nttData.enumerados;

public enum EnumParametros {

	ID_DOCUMENTO("ID_DOCUMENTO"),
	TIPO_DOCUMENTO("TIPO_DOCUMENTO"),
	
	;
	
	private final String value;

	private EnumParametros(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
	
	
}
