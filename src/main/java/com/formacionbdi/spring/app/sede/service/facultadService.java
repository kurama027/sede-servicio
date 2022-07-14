package com.formacionbdi.spring.app.sede.service;

import java.util.List;

import com.formacionbdi.spring.app.sede.entity.facultad;


public interface facultadService {
	public List<facultad> findAll();
	public facultad findById(Long id);
	public void delete(facultad facu);

}
