package com.formacionbdi.spring.app.sede.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tax_entidad")
public class entidad {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ENTIDAD")
	private long ID_ENTIDAD; 
	@Column(name = "NO_ENTIDAD")
	private String NO_ENTIDAD;  
	@Column(name = "ID_UBIGEO")
	private long ID_UBIGEO; 
	@Column(name = "DE_ENTIDAD")
	private String DE_ENTIDAD;
	public long getID_ENTIDAD() {
		return ID_ENTIDAD;
	}
	public void setID_ENTIDAD(long iD_ENTIDAD) {
		ID_ENTIDAD = iD_ENTIDAD;
	}
	public String getNO_ENTIDAD() {
		return NO_ENTIDAD;
	}
	public void setNO_ENTIDAD(String nO_ENTIDAD) {
		NO_ENTIDAD = nO_ENTIDAD;
	}
	public long getID_UBIGEO() {
		return ID_UBIGEO;
	}
	public void setID_UBIGEO(long iD_UBIGEO) {
		ID_UBIGEO = iD_UBIGEO;
	}
	public String getDE_ENTIDAD() {
		return DE_ENTIDAD;
	}
	public void setDE_ENTIDAD(String dE_ENTIDAD) {
		DE_ENTIDAD = dE_ENTIDAD;
	} 
	 
	
}
