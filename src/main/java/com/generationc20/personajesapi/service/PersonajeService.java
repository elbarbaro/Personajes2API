package com.generationc20.personajesapi.service;

import java.util.List;
import java.util.Optional;

import com.generationc20.personajesapi.model.Personaje;

public interface PersonajeService {

	Personaje save(Personaje personaje);
	List<Personaje> getAll();
	Optional<Personaje> getById(Integer id);
	Personaje update(Integer id, Personaje personaje);
	void remove(Integer id);
}
