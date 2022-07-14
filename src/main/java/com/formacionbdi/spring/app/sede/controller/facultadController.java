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

import com.formacionbdi.spring.app.sede.entity.facultad;
import com.formacionbdi.spring.app.sede.service.facultadService;



@RestController
public class facultadController {
	@Autowired
	private facultadService facuser; 
	
	@GetMapping("/listar-facultad")
	public List<facultad>listar(){
		return facuser.findAll(); 	
	}
	
	@GetMapping("/ver-facultad/{id}")
	public facultad detalle(@PathVariable Long id) { 
		return facuser.findById(id);
	}

	@DeleteMapping("/eliminar-facultad/{ID_FACULTAD}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_FACULTAD") Long ID_FACULTAD, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        facultad data = facuser.findById(ID_FACULTAD);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_FACULTAD);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            facuser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
