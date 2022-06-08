package com.clinicaMedica.dto;


import com.clinicaMedica.model.Doctor;
import com.clinicaMedica.model.Patient;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class DoctorDto {

	private Long id;
	
	private String name;

	private String address;
	
	private String crm;
	
	private String especialition;
	
	private Patient patient;
	


	public DoctorDto() {}

	public DoctorDto(Doctor doctor) {
		id = doctor.getId();
		name = doctor.getName();
		address = doctor.getAddress();
		crm = doctor.getCrm();
		especialition = doctor.getEspecialition();
		patient = doctor.getPatient();
	}
	
}
