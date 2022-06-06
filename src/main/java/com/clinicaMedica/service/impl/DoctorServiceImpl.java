package com.clinicaMedica.service.impl;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clinicaMedica.Error.ResourceNotFoundException;
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
	
	public List<DoctorDto> searchDoctors() {
		List<Doctor> doctors = doctorRepository.findAll();
		List<DoctorDto> doctorDto = doctors.stream().map(d-> new DoctorDto(d)).collect(Collectors.toList());
		
		return doctorDto;
	}
	
	
	// SEARCH WITH ID OF DOCTOR
	@Override
	public DoctorDto searchDoctor(Long id) {
			Optional<Doctor> doctor = doctorRepository.findById(id);
			if (doctor.isPresent()) {
				Doctor response= doctorRepository.findById(id).get();
				DoctorDto doctorDto = new DoctorDto(response);
				return doctorDto;
			}
			else throw new ResourceNotFoundException("Doctor id: "+ id + " Not found" );
	}
	
	
	// REGISTER NEW DOCTOR
	public  DoctorDto registerDoctor(DoctorDto doctorDto) {
		Doctor doctor  = new Doctor(doctorDto);
		doctor = doctorRepository.save(doctor);
		doctorDto = new DoctorDto(doctor);
		return doctorDto;
	}

	
	// UPDATE DOCTOR WITH ID
	public DoctorDto updateDoctor(DoctorDto doctorDto) {
		try {			
			Doctor doctor = new Doctor(searchDoctor(doctorDto.getId()));
			if(doctor!=null) {
				doctor =new Doctor(doctorDto);
				doctor = doctorRepository.save(doctor);
				doctorDto = new DoctorDto(doctor);
			}
			return doctorDto;
		}catch (Exception e) {
			 throw new ResourceNotFoundException("Erro. Update doctor not completed ");
		}
		
	}

	//DELETE DOCTOR WITH ID
	public void deleteDoctor(Long id) {
		try {
			Optional<Doctor> doctor = doctorRepository.findById(id);
			if(doctor.isPresent()) {		
				doctorRepository.deleteById(id);
			}
			else {
				throw new ResourceNotFoundException("Doctor: "+ id +" not found");
			}
		} catch (Exception e) {
			throw new ResourceNotFoundException("Erro. Delete doctor not completed");
		}
	}



}
