package com.generationc20.personajesapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "caracteristica")
public class Caracteristica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	//@JoinColumn(name = "id_personaje", nullable = false)
	//private Personaje personaje;
	private Integer idPersonaje;
	@Column(length = 50, nullable = false)
	private String nombre;
	@Column(length = 50, nullable = false)
	private String valor;
	@Column(length = 30, nullable = false)
	private String tipo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
	
	public Caracteristica() {}
	
	public Caracteristica(Integer id, String nombre, String valor, String tipo, Date fechaCreacion) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
		this.tipo = tipo;
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getIdPersonaje() {
		return idPersonaje;
	}
	
	public void setIdPersonaje(Integer idPersonaje) {
		this.idPersonaje = idPersonaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
}
