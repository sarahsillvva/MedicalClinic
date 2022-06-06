package com.clinicaMedica.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clinicaMedica.Error.ResourceNotFoundException;
import com.clinicaMedica.dto.PatientDto;
import com.clinicaMedica.model.Patient;
import com.clinicaMedica.repository.PatientRepository;
import com.clinicaMedica.service.PatientService;

@Component
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepository patientRepository;

	@Override
	public List<PatientDto> searchPatients() {
		List<Patient> patients = patientRepository.findAll();
		List<PatientDto> patientDto = patients.stream().map(p-> new PatientDto(p)).collect(Collectors.toList());
	
		return patientDto;
	}
	

	public PatientDto searchPatient(Long id) {
		Patient patient = patientRepository.findById(id).get();
		PatientDto patientDto = new PatientDto(patient);	
		return patientDto;
		
	}

	public PatientDto registerPatient(PatientDto patientDto) {
		Patient patient = new Patient(patientDto);
		patient = patientRepository.save(patient);
		patientDto = new PatientDto(patient);
		return patientDto;
	}

	public PatientDto uptadePatient(PatientDto patientDto) {
		Patient patient = new Patient(searchPatient(patientDto.getId()));
		patient = new Patient(patientDto);
		patient = patientRepository.save(patient);
		patientDto = new PatientDto(patient);
		return patientDto;
	}

	public void deletePatient(Long id) {
		try {
			Optional<Patient> patient = patientRepository.findById(id);
			if(patient.isPresent()) {
				patientRepository.deleteById(id);
			}
			else {
				throw new ResourceNotFoundException("Patient: "+ id +" not found");
			}
		} catch (Exception e) {
			throw new ResourceNotFoundException("Erro. Delete Patient not completed");
		}
		
	}


}
