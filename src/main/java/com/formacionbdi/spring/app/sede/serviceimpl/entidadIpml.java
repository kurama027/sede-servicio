package com.formacionbdi.spring.app.sede.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.sede.entity.entidad;
import com.formacionbdi.spring.app.sede.repository.entidadRepository;
import com.formacionbdi.spring.app.sede.service.entidadService;
@Service
public class entidadIpml implements entidadService{
	@Autowired
	private entidadRepository entir;
	
	@Override
	public List<entidad> findAll() {
		// TODO Auto-generated method stub
		return (List<entidad>)entir.findAll();
	}

	@Override
	public entidad findById(Long id) {
		// TODO Auto-generated method stub
		return entir.findById(id).orElse(null);
	}

	@Override
	public void delete(entidad ent) {
		// TODO Auto-generated method stub
		entir.delete(ent);
	}

}
