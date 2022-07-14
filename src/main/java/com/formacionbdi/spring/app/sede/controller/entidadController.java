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

import com.formacionbdi.spring.app.sede.entity.entidad;
import com.formacionbdi.spring.app.sede.service.entidadService;



@RestController
public class entidadController {
	@Autowired
	private entidadService entiser; 
	
	@GetMapping("/listar-entidad")
	public List<entidad>listar(){
		return entiser.findAll(); 	
	}
	
	@GetMapping("/ver-entidad/{id}")
	public entidad detalle(@PathVariable Long id) { 
		return entiser.findById(id);
	}

	@DeleteMapping("/eliminar-entidad/{ID_ENTIDAD}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_ENTIDAD") Long ID_ENTIDAD, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        entidad data = entiser.findById(ID_ENTIDAD);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_ENTIDAD);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            entiser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
