package com.clinicaMedica.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import com.clinicaMedica.dto.DoctorDto;
import com.clinicaMedica.model.Doctor;

@Mapper(componentModel="spring")
public interface DoctorMapper {

	Doctor toDoctor(DoctorDto doctorDto);
	
	//ajuda no processamento visto que o metodo é o inverso do outro
	@InheritInverseConfiguration
	DoctorDto toDto(Doctor doctor);
	
}
