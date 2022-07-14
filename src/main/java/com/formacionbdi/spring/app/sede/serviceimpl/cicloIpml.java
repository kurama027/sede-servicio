package com.formacionbdi.spring.app.sede.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.sede.entity.ciclo;
import com.formacionbdi.spring.app.sede.repository.cicloRepository;
import com.formacionbdi.spring.app.sede.service.cicloService;
@Service
public class cicloIpml implements cicloService{
	@Autowired
	private cicloRepository ciclor;

	@Override
	public List<ciclo> findAll() {
		// TODO Auto-generated method stub
		return (List<ciclo>)ciclor.findAll();
	}

	@Override
	public ciclo findById(Long id) {
		// TODO Auto-generated method stub
		return ciclor.findById(id).orElse(null);
	}

	@Override
	public void delete(ciclo cic) {
		// TODO Auto-generated method stub
		ciclor.delete(cic);
	}

}
