package com.clinicaMedica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.clinicaMedica.dto.PatientDto;

@Service
public interface PatientService {

	
	//Search all patients
	public List<PatientDto> searchPatients();
	
	//Search by id of patient
	public PatientDto searchPatient(Long id);
	
	//Register new patient 
	public PatientDto registerPatient(PatientDto patientDto);
	
	//PUT patient by id
	public PatientDto uptadePatient(PatientDto patientDto);
	
	//Delete by id of patient
	public void deletePatient(Long id);
	
	
}
