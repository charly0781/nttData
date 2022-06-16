package com.prueba.nttData.enumerados;

import com.prueba.nttData.herramientas.NegocioException;

public enum EnumIdErrores {
	
	ERR_ERROR_GENERAL(90001, "ERROR AL OBTENER DATOS CONSULTA {}, MOTIVO {}"),
	ERR_ERROR_GENERAL_2(90002, "ERROR AL CONECTARSE A LA DB, MOTIVO {}"),
	TOO_MANY_ROWS(9003, "Error, demasiadas columnas para su remplazo"),
	ERROR_CONTEXTO(100002, "Sin datos en contexto"),
	ERROR_SIN_DATOS(405, "EL CAMPO {} NO TIENE DATOS"),
	ERROR_TIPO_DOCUMENTO(500, "EL TIPO DE DOCUMENTO {} ES INVALIDO"),
	ERROR_BUSQUEDA(500, "NO SE ENCONTRARON DATOS CON EL TIPO DOCUMENTO {} Y DOCUMENTO NRO {}"),
	ERROR_INSERTAR(100004, "ERROR AL INSERTAR LOS DATOS"),
	ERROR_ACTUALIZAR(100006, "ERROR AL ACCTUALIZAR EL USUARIO CON ID {}, MOTIVO {}"),
	ERROR_LISTADO(100007, "NO SE PUDO OBTENER EL LISTADO DE USUARIOS, DATOS VACIOS"),
	ERROR_BORRADO(100008, "ERROR AL ELIMINAR EL REGISTRO"),
	;
	
	private final String value;	
	private final int key;
	
	private EnumIdErrores(int key, String value) {
		this.value = value;
		this.key = key;
	}

	public int getKey() {
		return key;
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
