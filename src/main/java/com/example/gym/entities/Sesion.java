package com.example.gym.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Sesion {
	
	
	@Id
	@SequenceGenerator(name="sesion_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sesion_id_seq")
	private Integer id;
	private int repeticiones;
	private int series;
	private int peso;
	private int descanso;
	

	
	

}
