package com.cibertec.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.models.Cliente;
import com.cibertec.app.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	IClienteRepository repositorioCliente;
	
	@Override
	public List<Cliente> listar() {
		return (List<Cliente>)repositorioCliente.findAll();
	}

	@Override
	public Cliente consultarXId(Integer id) {
		return repositorioCliente.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Integer id) {
		repositorioCliente.deleteById(id);
	}

	@Override
	public Cliente editar(Cliente cli) {
		return repositorioCliente.save(cli);
	}

	@Override
	public Cliente registrar(Cliente cli) {
		return repositorioCliente.save(cli);
	}
}
