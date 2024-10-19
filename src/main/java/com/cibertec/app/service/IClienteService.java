package com.cibertec.app.service;

import java.util.List;

import com.cibertec.app.models.Cliente;

public interface IClienteService {
	
	List<Cliente> listar();
	
	Cliente consultarXId(Integer id);
	
	void eliminar(Integer id);
	
	Cliente editar(Cliente cli);
	
	Cliente registrar(Cliente cli);

}
