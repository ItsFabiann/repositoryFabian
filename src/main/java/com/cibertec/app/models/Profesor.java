package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cedula;
	
	@Column(name="nombres", length = 50, nullable = false)
	private String nombres;
	
	@Column(name="apellido", length = 50, nullable = false)
	private String apellido;
	
	@Column(name="genero", length = 50, nullable = false)
	private String genero;
	
	public Profesor() {
		
	}

	public Profesor(Integer cedula, String nombres, String apellido, String genero) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellido = apellido;
		this.genero = genero;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
