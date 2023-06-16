package com.example.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gym.entities.Sesion;

public interface SesionRepository extends JpaRepository <Sesion,Integer>  {

}
