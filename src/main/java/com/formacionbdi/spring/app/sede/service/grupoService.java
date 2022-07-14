package com.formacionbdi.spring.app.sede.service;

import java.util.List;

import com.formacionbdi.spring.app.sede.entity.grupo;


public interface grupoService {
	public List<grupo> findAll();
	public grupo findById(Long id);
	public void delete(grupo grup);

}
