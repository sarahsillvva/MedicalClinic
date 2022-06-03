package com.clinicaMedica.dto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.clinicaMedica.model.Doctor;
import com.clinicaMedica.model.Patient;

import lombok.Getter;
import lombok.Setter;

public class DoctorDto {

	
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
	
	@Autowired
	private ModelMapper modelMapper;

	
	public DoctorDto DoctorDto (Doctor doctor) {
		return modelMapper.map(doctor, DoctorDto.class);
	}
	
	
	
	
}
