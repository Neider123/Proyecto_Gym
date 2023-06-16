package com.example.gym.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;


@Data
@Entity
public class Cliente implements Serializable {
	
	@Id
	@SequenceGenerator(name="cliente_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cliente_id_seq")
	private Integer id;
	private int peso;
	private double altura;
	private double imc;
	private Date fecha_inscripcion;
	private int edad;
    
	

	
	
	@ManyToOne
	@JoinColumn(name="plan_id")
	private Plan plan;
	
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	
	
	

	

}
