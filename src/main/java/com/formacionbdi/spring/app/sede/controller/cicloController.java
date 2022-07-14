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

import com.formacionbdi.spring.app.sede.entity.ciclo;
import com.formacionbdi.spring.app.sede.service.cicloService;

@RestController
public class cicloController {
	@Autowired
	private cicloService cicloser; 
	
	@GetMapping("/listar-ciclo")
	public List<ciclo>listar(){
		return cicloser.findAll(); 	
	}
	
	@GetMapping("/ver-ciclo/{id}")
	public ciclo detalle(@PathVariable Long id) { 
		return cicloser.findById(id);
	}

	@DeleteMapping("/eliminar-ciclo/{ID_CICLO}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_CICLO") Long ID_CICLO, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        ciclo data = cicloser.findById(ID_CICLO);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_CICLO);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            cicloser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
