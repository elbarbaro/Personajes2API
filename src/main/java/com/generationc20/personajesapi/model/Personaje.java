package com.generationc20.personajesapi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "personaje")
public class Personaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String aparicion;
	private String tipo;
	
	@OneToMany(targetEntity = Caracteristica.class, cascade = CascadeType.ALL,
			fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "idPersonaje", referencedColumnName = "id")
	private List<Caracteristica> caracteristicas;
	
	public Personaje() {}
	
	public Personaje(Integer id, String nombre, String aparicion, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.aparicion = aparicion;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAparicion() {
		return aparicion;
	}
	public void setAparicion(String aparicion) {
		this.aparicion = aparicion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public List<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}
	
	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
}
