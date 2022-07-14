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

import com.formacionbdi.spring.app.sede.entity.escuela;

import com.formacionbdi.spring.app.sede.service.escuelaService;
@RestController
public class escuelaController {
	@Autowired
	private escuelaService escuser; 
	
	@GetMapping("/listar-escuela")
	public List<escuela>listar(){
		return escuser.findAll(); 	
	}
	
	@GetMapping("/ver-escuela/{id}")
	public escuela detalle(@PathVariable Long id) { 
		return escuser.findById(id);
	}

	@DeleteMapping("/eliminar-escuela/{ID_ESCUELA}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_ESCUELA") Long ID_ESCUELA, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        escuela data = escuser.findById(ID_ESCUELA);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_ESCUELA);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            escuser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
