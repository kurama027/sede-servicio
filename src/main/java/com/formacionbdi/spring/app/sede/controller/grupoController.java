package com.formacionbdi.spring.app.sede.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.spring.app.sede.entity.grupo;
import com.formacionbdi.spring.app.sede.service.entidadService;
import com.formacionbdi.spring.app.sede.service.grupoService;

@RestController
public class grupoController {
	@Autowired
	private grupoService gruposer; 
	
	@GetMapping("/listar-grupo")
	public List<grupo>listar(){
		return gruposer.findAll(); 	
	}
	
	@GetMapping("/ver-grupo/{id}")
	public grupo detalle(@PathVariable Long id) { 
		return gruposer.findById(id);
	}

	@DeleteMapping("/eliminar-grupo/{ID_GRUPO}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_GRUPO") Long ID_GRUPO, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        grupo data = gruposer.findById(ID_GRUPO);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_GRUPO);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            gruposer.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
