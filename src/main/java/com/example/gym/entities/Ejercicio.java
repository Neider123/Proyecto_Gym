package com.example.gym.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Ejercicio {
	
	
	@Id
	@SequenceGenerator(name="ejercicio_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ejercicio_id_seq")
	private Integer id;
	private String nombre;
	private String descripcion;
	private String link;
	
	

}
