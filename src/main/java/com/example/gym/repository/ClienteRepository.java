package com.example.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gym.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
