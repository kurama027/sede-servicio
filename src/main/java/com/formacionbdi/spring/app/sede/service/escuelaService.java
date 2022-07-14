package com.formacionbdi.spring.app.sede.service;

import java.util.List;

import com.formacionbdi.spring.app.sede.entity.escuela;


public interface escuelaService {
	public List<escuela> findAll();
	public escuela findById(Long id);
	public void delete(escuela esc);
	
}
