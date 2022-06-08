package com.clinicaMedica.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.clinicaMedica.dto.PatientDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="Patient")
@Table (name="Patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="dt_creation")
	private Date dtCreation;

	@Column(name="dt_birth")
	private Date dtBirth;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private String phone;


	public Patient() {
		super();
	}
	
	
	public Patient(PatientDto patientDto) {
		this.id = patientDto.getId();
		this.name = patientDto.getName();
		this.cpf = patientDto.getCpf();
		this.dtCreation = patientDto.getDtCreation();
		this.dtBirth = patientDto.getDtBirth();
		this.address = patientDto.getAddress();
		this.phone = patientDto.getPhone();
	}
	
	
}
