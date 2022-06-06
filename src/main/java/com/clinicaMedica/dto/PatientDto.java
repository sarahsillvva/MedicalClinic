package com.clinicaMedica.dto;

import java.util.Date;

import com.clinicaMedica.model.Patient;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PatientDto {
	private Long id;
	
	private String name;
	
	private String cpf;
	
	private Date dtCreation;
	
	private Date dtNasc;
	
	private String address;

	public PatientDto() {
		super();
	}

	public PatientDto(Patient patient) {
		this.id = patient.getId();
		this.name = patient.getName();
		this.cpf = patient.getCpf();
		this.dtCreation = patient.getDtCreation();
		this.dtNasc = patient.getDtNasc();
		this.address = patient.getAddress();
	}
	
	
}
