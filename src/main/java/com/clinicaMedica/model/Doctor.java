package com.clinicaMedica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="Doctor")
@Table (name="Doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="crm")
	private String crm;
	
	@Column(name="espealization")
	private String especialition;

	@Transient // verificar
	private Patient patient;
	
	public Doctor() {}
	
	
}
