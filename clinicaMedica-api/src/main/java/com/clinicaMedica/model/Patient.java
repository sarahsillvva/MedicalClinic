package com.clinicaMedica.model;

import java.util.Date;

public class Patient {

	private Long id;
	
	private String name;
	
	private String cpf;
	
	private Date dtCreation;
	
	private Date dtNasc;
	
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDtCreation() {
		return dtCreation;
	}

	public void setDtCreation(Date dtCreation) {
		this.dtCreation = dtCreation;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Patient() {
		super();
	}
	
	
	
}
