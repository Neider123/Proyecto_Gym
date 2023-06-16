package com.example.gym.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.gym.entities.Usuario;
import com.example.gym.repository.UsuarioRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	/**
	@GetMapping("/login")
	public String login() {
		return "usuario/login";
	}
	*/
	
    
	@GetMapping("{usuario}/login/{contraseña}")
	public String login(@PathVariable String usuario,@PathVariable String contraseña) {
		Optional<Usuario>userCurrent=usuarioRepository.findByUsuario(usuario);
		if(userCurrent.isPresent()) {
			if(userCurrent.get().getContraseña().equals(contraseña)) {
				return "index";
			}
		}
		return "Datos equivocados";
	}
	
	

}
