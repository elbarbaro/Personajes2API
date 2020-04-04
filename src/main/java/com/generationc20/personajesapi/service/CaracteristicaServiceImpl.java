package com.generationc20.personajesapi.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.personajesapi.dao.CaracteristicaRepository;
import com.generationc20.personajesapi.model.Caracteristica;
import com.generationc20.personajesapi.model.Personaje;

@Service
public class CaracteristicaServiceImpl implements CaracteristicaService {
	
	@Autowired
	private CaracteristicaRepository repository;
	//@Autowired
	//private PersonajeRepository pRepository;
	
	@Override
	public List<Caracteristica> getAll() {
		return repository.findAll();
	}
	
	@Override
	public List<Caracteristica> getAllByIdPersonaje(Integer idPersonaje) {
		Personaje personaje = new Personaje();
		personaje.setId(idPersonaje);
		return repository.findByIdPersonaje(idPersonaje);
	}
	
	@Override
	public Optional<Caracteristica> getById(Integer id) {
		return repository.findById(id);
	}
	
	@Override
	public Caracteristica save(Integer idPersonaje, Caracteristica caracteristica) {
		//Personaje personaje = pRepository.findById(idPersonaje).orElseThrow(() -> new PersonajeNotFoundException(idPersonaje));
		caracteristica.setIdPersonaje(idPersonaje);
		caracteristica.setFechaCreacion(new Date());
		return repository.save(caracteristica);
	}
	
	@Override
	public Caracteristica update(Integer id, Caracteristica caracteristica) {
		Caracteristica  caracteristicaDB = getById(id).get();
		caracteristicaDB.setNombre(caracteristica.getNombre());
		caracteristicaDB.setValor(caracteristica.getValor());
		caracteristicaDB.setTipo(caracteristica.getTipo());
		return repository.save(caracteristica);
	}
	
	@Override
	public void remove(Integer id) {
		repository.deleteById(id);
	}
}
