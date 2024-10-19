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
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_cliente;
	
	@Column(name="nombre", length = 40, nullable = false)
	private String nombre;
	
	@Column(name="apellidoPaterno", length = 30, nullable = false)
	private String apellidoPaterno;
	
	@Column(name="apellidoMaterno", length = 40, nullable = false)
	private String apellidoMaterno;
	
	@Column(name="documento", length = 8, nullable = false)
	private String documento;
	
	@ManyToOne
	@JoinColumn(name = "codigo_ciudad")
	private Ciudad ciudad;
	
	public Cliente() {
		
	}

	public Cliente(Integer codigo_cliente, String nombre, String apellidoPaterno, String apellidoMaterno,
			String documento, Ciudad ciudad) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.documento = documento;
		this.ciudad = ciudad;
	}

	public Integer getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Integer codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
