package com.clinicaMedica.service.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clinicaMedica.dto.DoctorDto;
import com.clinicaMedica.mapper.DoctorMapper;
import com.clinicaMedica.model.Doctor;
import com.clinicaMedica.repository.DoctorRepository;
import com.clinicaMedica.service.DoctorService;

@Component("DoctorController")
public class DoctorServiceImpl  implements DoctorService{

	@Autowired
	DoctorRepository doctorRepository;
	
	DoctorMapper doctorMapper;
	// FIND ALL REGISTERED DOCTORS
	/*@Override
	public List<DoctorDto> searchDoctors() {
		List<Doctor> search = doctorRepository.findAll();
	return doctorRepository.findAll();
	}*/
	
	
	// SEARCH WITH ID OF DOCTOR
	@Override
	public DoctorDto searchDoctor(Long doctorId) {
		try {
			Doctor doctor = doctorRepository.findById(doctorId).get();
			return doctorMapper.toDto(doctor);
		}catch (Exception e) {
			throw new IllegalArgumentException("Erro. Search doctor not completed");
		}	
	}
	
	
	// REGISTER NEW DOCTOR
	public  DoctorDto registerDoctor(DoctorDto doctorDto) {
		
		Doctor doctor  = doctorMapper.toDoctor(doctorDto);
		doctor = doctorRepository.save(doctor);
		return doctorMapper.toDto(doctor);
	}

	
	// UPDATE DOCTOR WITH ID
	public DoctorDto updateDoctor(DoctorDto doctorDto) {
		try {
			
			Doctor doctor = doctorMapper.toDoctor(searchDoctor(doctorDto.getId()));
			if(doctor!=null) {
				doctor = doctorRepository.save(doctor);
				return doctorMapper.toDto(doctor);
			}
			else 
				throw new IllegalArgumentException("Doctor not found");
				
		}catch (Exception e) {
			 throw new IllegalArgumentException("Erro. Update doctor not completed");
		}
		
	}

	//DELETE DOCTOR WITH ID
	/*
	@Override  
	public void deleteDoctor(Long doctorId) {
		try {
			Doctor doctor = doctorRepository.findById(doctorId).get();
			if(doctor!=null) {
				doctor = doctorRepository.deleteById(doctorId);
				doctorMapper.toDto(doctor);
			}
			else {
				throw new IllegalArgumentException("Doctor not found");
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("Erro. Delete doctor not completed");
		}
	}
	*/



}
