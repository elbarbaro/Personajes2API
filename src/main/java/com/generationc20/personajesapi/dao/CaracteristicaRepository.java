package com.generationc20.personajesapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generationc20.personajesapi.model.Caracteristica;

public interface CaracteristicaRepository extends JpaRepository<Caracteristica, Integer> {
	
	List<Caracteristica> findByIdPersonaje(Integer personaje);
}
