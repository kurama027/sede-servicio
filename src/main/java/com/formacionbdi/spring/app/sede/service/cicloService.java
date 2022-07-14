package com.formacionbdi.spring.app.sede.service;

import java.util.List;

import com.formacionbdi.spring.app.sede.entity.ciclo;


public interface cicloService {
	public List<ciclo> findAll();
	public ciclo findById(Long id);
	public void delete(ciclo cic);

}
