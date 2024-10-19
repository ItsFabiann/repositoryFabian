package com.cibertec.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.app.models.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer>{

}
