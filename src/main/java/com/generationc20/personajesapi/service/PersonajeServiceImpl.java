package com.generationc20.personajesapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.personajesapi.dao.PersonajeRepository;
import com.generationc20.personajesapi.error.PersonajeNotFoundException;
import com.generationc20.personajesapi.model.Personaje;

@Service
public class PersonajeServiceImpl implements PersonajeService {

	@Autowired
	private PersonajeRepository repository;
	
	@Override
	public Personaje save(Personaje personaje) {
		return repository.save(personaje);
	}
	
	@Override
	public List<Personaje> getAll() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Personaje> getById(Integer id) {
		return repository.findById(id);
	}
	
	@Override
	public Personaje update(Integer id, Personaje personaje) {
		Personaje personajeDB = getById(id).orElseThrow(() -> new PersonajeNotFoundException(id));
		personajeDB.setNombre(personaje.getNombre());
		personajeDB.setAparicion(personaje.getAparicion());
		personajeDB.setTipo(personaje.getTipo());
		return repository.save(personajeDB);
	}
	
	@Override
	public void remove(Integer id) {
		repository.deleteById(id);
	}
}
