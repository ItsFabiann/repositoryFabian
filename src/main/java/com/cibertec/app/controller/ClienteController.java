package com.cibertec.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.app.models.Cliente;
import com.cibertec.app.service.IClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	IClienteService servicioCliente;

	@GetMapping("/inicio")
	public String inicio(Model model) {
		
		List<Cliente> lista= servicioCliente.listar();
		model.addAttribute("listaCliente", lista);
		return "/cliente/inicio";
	}
	
	@GetMapping("/crear")
	public String crear(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "/cliente/crear";
	}
	
	@PostMapping("/crear")
	public String crear(Cliente cliente) {
		System.out.println("cliente cod : "+ cliente.getCodigo_cliente());
		servicioCliente.registrar(cliente);
		return "redirect:/cliente/inicio";
	}
	
	@GetMapping("/editar/{Codigo_cliente}")
	public String editar(@PathVariable Integer Codigo_cliente, Model model) {
		Cliente objCli = servicioCliente.consultarXId(Codigo_cliente);
		model.addAttribute("cliente", objCli);
		return "/cliente/editar";
	}
	
	@GetMapping("/eliminar/{Codigo_cliente}")
	public String eliminar(@PathVariable Integer Codigo_cliente, Model model) {
		Cliente objCli = servicioCliente.consultarXId(Codigo_cliente);
		model.addAttribute("cliente", objCli);
		return "/cliente/eliminar";
	}
	
	@PostMapping("/eliminar")
	public String eliminar(Cliente cli) {
		servicioCliente.eliminar(cli.getCodigo_cliente());
		return "redirect:/cliente/inicio";
	}
}
