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

import com.formacionbdi.spring.app.sede.entity.sede;
import com.formacionbdi.spring.app.sede.service.sedeService;



@RestController
public class sedeController {
	@Autowired
	private sedeService sedeser; 
	
	@GetMapping("/listar-sede")
	public List<sede>listar(){
		return sedeser.findAll(); 	
	}
	
	@GetMapping("/ver-sede/{id}")
	public sede detalle(@PathVariable Long id) { 
		return sedeser.findById(id);
	}

	@DeleteMapping("/eliminar-sede/{ID_SEDE}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_SEDE") Long ID_SEDE, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        sede data = sedeser.findById(ID_SEDE);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_SEDE);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            sedeser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
