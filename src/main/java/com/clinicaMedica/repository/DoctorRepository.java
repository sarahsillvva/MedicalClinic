package com.clinicaMedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinicaMedica.dto.DoctorDto;
import com.clinicaMedica.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository <Doctor, Long>{
	
	

}
