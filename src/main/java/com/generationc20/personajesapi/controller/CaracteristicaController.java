package com.generationc20.personajesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationc20.personajesapi.model.Caracteristica;
import com.generationc20.personajesapi.service.CaracteristicaService;

@RestController
@RequestMapping("/v1/caracteristicas")
public class CaracteristicaController {
	
	@Autowired
	private CaracteristicaService service;
	
	@GetMapping
	public ResponseEntity<List<Caracteristica>> getCaracteristicas() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}	
}
