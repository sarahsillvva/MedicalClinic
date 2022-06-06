package com.clinicaMedica.model;

import java.util.Date;

import com.clinicaMedica.dto.PatientDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient {

	private Long id;
	
	private String name;
	
	private String cpf;
	
	private Date dtCreation;
	
	private Date dtNasc;
	
	private String address;


	public Patient() {
		super();
	}
	
	
	public Patient(PatientDto patientDto) {
		this.id = patientDto.getId();
		this.name = patientDto.getName();
		this.cpf = patientDto.getCpf();
		this.dtCreation = patientDto.getDtCreation();
		this.dtNasc = patientDto.getDtNasc();
		this.address = patientDto.getAddress();
	}
	
	
}
