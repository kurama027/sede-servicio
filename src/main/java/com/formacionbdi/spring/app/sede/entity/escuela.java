package com.formacionbdi.spring.app.sede.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tax_escuela")
public class escuela {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESCUELA")
	private long ID_ESCUELA;
	@Column(name = "NO_ESCUELA")
	private String NO_ESCUELA;
	@Column(name = "ID_COORDINADOR")
	private Long ID_COORDINADOR;
	@ManyToOne()
	@JoinColumn(name="ID_ESCU_FAC")
	private facultad fac;
	public long getID_ESCUELA() {
		return ID_ESCUELA;
	}
	public void setID_ESCUELA(long iD_ESCUELA) {
		ID_ESCUELA = iD_ESCUELA;
	}
	public String getNO_ESCUELA() {
		return NO_ESCUELA;
	}
	public void setNO_ESCUELA(String nO_ESCUELA) {
		NO_ESCUELA = nO_ESCUELA;
	}
	public Long getID_COORDINADOR() {
		return ID_COORDINADOR;
	}
	public void setID_COORDINADOR(Long iD_COORDINADOR) {
		ID_COORDINADOR = iD_COORDINADOR;
	}
	public facultad getFac() {
		return fac;
	}
	public void setFac(facultad fac) {
		this.fac = fac;
	}
	
}
