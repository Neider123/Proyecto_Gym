package com.example.gym.entities;

import java.io.Serializable;
import java.util.Date;
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
public class Plan implements Serializable {
	
	
	@Id
	@SequenceGenerator(name="plan_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "plan_id_seq")
	private Integer id;
	private String nombre;
	private Date fecha_inicio;
	private Date fecha_fin;

	
	@JsonIgnore
	@OneToMany(mappedBy="plan")
	private List<Cliente> clientes;
	
	
	@ManyToOne
	@JoinColumn(name="rutinaSemana_id")
	private Rutina_Semana rutinaSemana;
	
	
	
	
	
	
	
	
	

}
