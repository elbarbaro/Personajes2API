package com.generationc20.personajesapi.service;

import java.util.List;
import java.util.Optional;

import com.generationc20.personajesapi.model.Caracteristica;

public interface CaracteristicaService {
	
	List<Caracteristica> getAll();
	List<Caracteristica> getAllByIdPersonaje(Integer idPersonaje);
	Optional<Caracteristica> getById(Integer id);
	Caracteristica save(Integer idPersonaje, Caracteristica caracteristica);
	Caracteristica update(Integer id, Caracteristica caracteristica);
	void remove(Integer id);
}
