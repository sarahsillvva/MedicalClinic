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
	
	private Date dtBirth;
	
	private String address;

	private String phone;
	
	public PatientDto() {
		super();
	}

	
	public PatientDto(Patient patient) {
		this.id = patient.getId();
		this.name = patient.getName();
		this.cpf = patient.getCpf();
		this.dtCreation = patient.getDtCreation();
		this.dtBirth = patient.getDtBirth();
		this.address = patient.getAddress();
		this.phone = patient.getPhone();

	}
	
	
}
