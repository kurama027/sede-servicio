package com.formacionbdi.spring.app.sede.service;

import java.util.List;

import com.formacionbdi.spring.app.sede.entity.entidad;


public interface entidadService {
	public List<entidad> findAll();
	public entidad findById(Long id);
	public void delete(entidad ent);

}
