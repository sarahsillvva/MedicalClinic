package com.clinicaMedica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clinicaMedica.dto.DoctorDto;
import com.clinicaMedica.service.DoctorService;

@RestController
@RequestMapping("/doctor")

public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	
	
	//Search list of all Doctors
	@GetMapping("/allDoctors")
	@ResponseStatus(value = HttpStatus.OK)
	public List<DoctorDto> searchDoctors() {
		return doctorService.searchDoctors();
	}
	
	@GetMapping("/searchDoctor")
	@ResponseStatus(value = HttpStatus.OK)
	public DoctorDto searchDoctor(@RequestParam (name="id") Long id) {
		DoctorDto doctorDto = doctorService.searchDoctor(id) ;
		return doctorDto;
	}
	
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public DoctorDto registerDoctor(@RequestBody DoctorDto doctorDto) {
		return doctorService.registerDoctor(doctorDto);
	}
	
	
	@PutMapping
	@ResponseStatus(value = HttpStatus.OK)
	public DoctorDto updateDoctor(@RequestBody DoctorDto doctorDto) {
		doctorService.updateDoctor(doctorDto);
		return doctorDto;
	}
	
	@DeleteMapping
	@ResponseStatus (value= HttpStatus.NO_CONTENT)
	public void deleteDoctor(@RequestParam (name="id") Long id) {
		doctorService.deleteDoctor(id);
	}
	
	
}
