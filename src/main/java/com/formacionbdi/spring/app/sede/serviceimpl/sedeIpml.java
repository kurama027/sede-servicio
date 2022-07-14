package com.formacionbdi.spring.app.sede.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.sede.entity.sede;
import com.formacionbdi.spring.app.sede.repository.sedeRepository;
import com.formacionbdi.spring.app.sede.service.sedeService;
@Service
public class sedeIpml implements sedeService{
	@Autowired
	private sedeRepository sedre;
	
	@Override
	public List<sede> findAll() {
		// TODO Auto-generated method stub
		return (List<sede>)sedre.findAll();
	}

	@Override
	public sede findById(Long id) {
		// TODO Auto-generated method stub
		return sedre.findById(id).orElse(null);
	}

	@Override
	public void delete(sede sed) {
		// TODO Auto-generated method stub
		sedre.delete(sed);
	}

}
