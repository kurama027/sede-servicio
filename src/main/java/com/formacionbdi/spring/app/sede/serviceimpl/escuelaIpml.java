package com.formacionbdi.spring.app.sede.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.sede.entity.escuela;
import com.formacionbdi.spring.app.sede.repository.escuelaRepository;
import com.formacionbdi.spring.app.sede.service.escuelaService;
@Service
public class escuelaIpml implements escuelaService{
	@Autowired
	private escuelaRepository escr;
	@Override
	public List<escuela> findAll() {
		// TODO Auto-generated method stub
		return (List<escuela>)escr.findAll();
	}

	@Override
	public escuela findById(Long id) {
		// TODO Auto-generated method stub
		return escr.findById(id).orElse(null);
	}

	@Override
	public void delete(escuela esc) {
		// TODO Auto-generated method stub
		escr.delete(esc);
	}

}
