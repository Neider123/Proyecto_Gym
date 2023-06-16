package com.example.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.gym.entities.Cliente;
import com.example.gym.repository.ClienteRepository;


@Controller
@RequestMapping
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	// obtener todos los usuarios que estan en la base de datos.
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Cliente> clientes = clienteRepository.findAll() ;
		model.addAttribute("clientes", clientes);
		return "vistaAdmin";
	}
	
	
}
