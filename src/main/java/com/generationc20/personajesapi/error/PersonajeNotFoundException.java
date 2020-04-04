package com.generationc20.personajesapi.error;

public class PersonajeNotFoundException extends RuntimeException {
	
	public PersonajeNotFoundException(Integer id) {
		super(String.format("Personaje no encontrado con el id: %s", id));
	}
}
