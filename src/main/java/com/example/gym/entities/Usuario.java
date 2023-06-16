package com.example.gym.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;


@Data
@Entity
public class Usuario {
	
	
	@Id
	@SequenceGenerator(name="usuario_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "usuario_id_seq")
	private Integer id;
	private String nombre;
	private String apellido;
	private Date fecha_nacimiento;
	private String genero;
	private String usuario;
	private String contraseña;
	@JsonIgnore
	@OneToMany(mappedBy="usuario")
	private List<Cliente> clientes;
	
	

}
