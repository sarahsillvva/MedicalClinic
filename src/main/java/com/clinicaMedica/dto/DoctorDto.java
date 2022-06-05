package com.clinicaMedica.dto;

import com.clinicaMedica.model.Patient;

import lombok.Getter;
import lombok.Setter;

public class DoctorDto {

	
	@Getter
	private Long id;
	
	@Getter @Setter
	private String name;
	
	@Getter @Setter
	private String address;
	
	@Getter @Setter
	private String crm;
	
	@Getter @Setter
	private String especialition;
	
	@Getter @Setter
	private Patient patient;

	public DoctorDto() {}
	
}
