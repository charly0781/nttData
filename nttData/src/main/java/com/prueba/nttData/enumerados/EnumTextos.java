package com.prueba.nttData.enumerados;

import com.prueba.nttData.herramientas.NegocioException;

public enum EnumTextos {
	
	VACIOS("VACIOS"),
	C("C"),
	P("P")
	
	;
	
	private final String value;

    private EnumTextos(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String replaceMessage(String... args) throws NegocioException {
        try {
            String mensaje = value;
            Integer cont = 0;
            while (mensaje.contains("{}")) {
                mensaje = mensaje.replaceFirst("\\{\\}", args[cont]);
                cont++;
            }
            return mensaje;
        } catch (Exception e) {
            throw new NegocioException(EnumIdErrores.TOO_MANY_ROWS.getKey(),
            		EnumIdErrores.TOO_MANY_ROWS.getValue());
        }
    }

}
