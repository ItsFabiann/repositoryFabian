package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuarios_id;
	
	@Column(name="username", length = 45, nullable = false)
	private String username;
	
	@Column(name="password", length = 45, nullable = false)
	private String password;
	
	public Usuarios() {
		
	}

	public Usuarios(Integer usuarios_id, String username, String password) {
		super();
		this.usuarios_id = usuarios_id;
		this.username = username;
		this.password = password;
	}

	public Integer getUsuarios_id() {
		return usuarios_id;
	}

	public void setUsuarios_id(Integer usuarios_id) {
		this.usuarios_id = usuarios_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
