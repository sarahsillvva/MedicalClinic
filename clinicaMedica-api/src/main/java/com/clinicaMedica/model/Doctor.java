package com.clinicaMedica.model;

import org.modelmapper.ModelMapper;

import com.clinicaMedica.dto.DoctorDto;

import lombok.Getter;
import lombok.Setter;


public class Doctor {
	@Getter
	private Long id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private String address;
	
	@Getter
	@Setter
	private String crm;
	
	@Getter
	@Setter
	private String especialition;
	
	@Getter
	@Setter
	private Patient patient;
	
	
	private ModelMapper modelMapper;
	
	public Doctor Doctor (DoctorDto doctorDto) {
		return modelMapper.map(doctorDto, Doctor.class);
	}

	
	
	
	
	
}
