package com.generationc20.personajesapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationc20.personajesapi.model.Personaje;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {
	
	List<Personaje> findByTipo(String tipo);
}