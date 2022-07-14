package com.formacionbdi.spring.app.sede.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.sede.entity.facultad;
import com.formacionbdi.spring.app.sede.repository.facultadRepository;
import com.formacionbdi.spring.app.sede.service.facultadService;
@Service
public class facultadIpml implements facultadService {
	@Autowired 
	private facultadRepository facure;
	
	@Override
	public List<facultad> findAll() {
		// TODO Auto-generated method stub
		return (List<facultad>)facure.findAll();
	}

	@Override
	public facultad findById(Long id) {
		// TODO Auto-generated method stub
		return facure.findById(id).orElse(null);
	}

	@Override
	public void delete(facultad facu) {
		// TODO Auto-generated method stub
		facure.delete(facu);
	}

}
