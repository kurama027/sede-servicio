package com.formacionbdi.spring.app.sede.service;

import java.util.List;

import com.formacionbdi.spring.app.sede.entity.sede;


public interface sedeService { 
	public List<sede> findAll();
	public sede findById(Long id);
	public void delete(sede sed);

}
