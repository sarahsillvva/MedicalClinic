package com.clinicaMedica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.clinicaMedica.dto.DoctorDto;

@Service
public interface DoctorService {

	//public List<DoctorDto> searchDoctors();
	
	public DoctorDto searchDoctor(Long doctorId);
	
	public DoctorDto registerDoctor	(DoctorDto doctorDto);
	
	public DoctorDto updateDoctor (DoctorDto doctorDto);
	
	//public void deleteDoctor (Long doctorId);
	
}
