package com.clinicaMedica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clinicaMedica.dto.PatientDto;
import com.clinicaMedica.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@GetMapping("/allPatient")
	public List<PatientDto> searchPatients() {
		return patientService.searchPatients();
	}
	
	@GetMapping("/searchById")
	public PatientDto searchPatient(@RequestParam(name="id")Long id) {
		return patientService.searchPatient(id);
	}
	
	
	@PostMapping
	public PatientDto registerPatient(@RequestBody PatientDto patientDto) {
		return patientService.registerPatient(patientDto);
	}
	
	@PutMapping
	public PatientDto updatePatient(@RequestBody PatientDto patientDto) {
		return patientService.uptadePatient(patientDto);
	}
	
	@DeleteMapping
	public void deletePatient(@RequestParam(name="id")Long id) {
		patientService.deletePatient(id);
	}
	
}
