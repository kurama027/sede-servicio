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
@Table(name = "tax_facultad")
public class facultad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FACULTAD")
	private long ID_FACULTAD;
	@Column(name = "NO_FACULTAD")
	private String NO_FACULTAD;
	
	@ManyToOne()
	@JoinColumn(name="ID_FAC_SE")
	private sede sed;

	public long getID_FACULTAD() {
		return ID_FACULTAD;
	}

	public void setID_FACULTAD(long iD_FACULTAD) {
		ID_FACULTAD = iD_FACULTAD;
	}

	public String getNO_FACULTAD() {
		return NO_FACULTAD;
	}

	public void setNO_FACULTAD(String nO_FACULTAD) {
		NO_FACULTAD = nO_FACULTAD;
	}

	public sede getSed() {
		return sed;
	}

	public void setSed(sede sed) {
		this.sed = sed;
	}
}
