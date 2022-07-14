package com.formacionbdi.spring.app.sede.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.sede.entity.grupo;
import com.formacionbdi.spring.app.sede.repository.grupoRepository;
import com.formacionbdi.spring.app.sede.service.grupoService;
@Service
public class grupoIpml implements grupoService{
	@Autowired
	private grupoRepository grupore;
	
	@Override
	public List<grupo> findAll() {
		// TODO Auto-generated method stub
		return (List<grupo>)grupore.findAll();
	}

	@Override
	public grupo findById(Long id) {
		// TODO Auto-generated method stub
		return grupore.findById(id).orElse(null);
	}

	@Override
	public void delete(grupo grup) {
		// TODO Auto-generated method stub
		grupore.delete(grup);
	}
	

}
