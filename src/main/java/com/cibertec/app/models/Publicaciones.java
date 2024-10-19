package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "publicaciones")
public class Publicaciones {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer publicaciones_id;
	
	@Column(name="titulo", length = 45, nullable = false)
	private String titulo;
	
	@Column(name="cuerpo", length = 45, nullable = false)
	private String cuerpo;
	
	@ManyToOne
	@JoinColumn(name = "usuarios_id")
	private Usuarios usuarios;
	
	public Publicaciones() {
		
	}

	public Publicaciones(Integer publicaciones_id, String titulo, String cuerpo, Usuarios usuarios) {
		super();
		this.publicaciones_id = publicaciones_id;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.usuarios = usuarios;
	}

	public Integer getPublicaciones_id() {
		return publicaciones_id;
	}

	public void setPublicaciones_id(Integer publicaciones_id) {
		this.publicaciones_id = publicaciones_id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
