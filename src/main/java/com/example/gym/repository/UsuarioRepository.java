package com.example.gym.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gym.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
	Optional<Usuario> findByUsuario(String usuario);
}
