package com.example.gym.entities;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Rutina_Semana {
	
	
	@Id
	@SequenceGenerator(name="rutina_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "rutina_id_seq")
	private Integer id;
	private String diaEntrenamiento;
	
	@JsonIgnore
	@OneToMany(mappedBy="rutinaSemana")
	private List<Plan> planes;
	
	@ManyToOne
	@JoinColumn(name="sesion_id")
	private Sesion sesion;

	
	
	
	

}
