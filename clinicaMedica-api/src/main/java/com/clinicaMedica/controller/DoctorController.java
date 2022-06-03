package com.clinicaMedica.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clinicaMedica.dto.DoctorDto;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
//	@Autowired
	//private DoctorService doctorService;
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public DoctorDto cadastrarDoctor(DoctorDto doctorDto) {
		return null;
	}
	
	@GetMapping 
	@ResponseStatus(value = HttpStatus.OK)
	public DoctorDto buscarDoctor(DoctorDto doctorDto) {
		return null;
	}
	
}
